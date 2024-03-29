/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.generator

import java.util.ArrayList
import java.util.List
import javaRule.And
import javaRule.Attribute
import javaRule.Class
import javaRule.Element
import javaRule.Enumeration
import javaRule.File
import javaRule.Interface
import javaRule.Method
import javaRule.Or
import javaRule.Package
import javaRule.PrimaryOp
import javaRule.PropertyLiteral
import javaRule.Rule
import javaRule.RuleSet
import javaRule.Sentence
import javaRule.Variable
import javaRule.VariableSubtype
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javaRule.Contains
import es.uam.sara.tfg.ast.ReadFiles

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JRulesGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		var sentences = resource.allContents.toIterable.filter(Sentence)

		fsa.generateFile("RuleFactory.java", RuleFactory(sentences.toList));

		var workspace = ResourcesPlugin.getWorkspace().getRoot();
		var ruleSet = resource.allContents.toIterable.filter(RuleSet).get(0)
		var projects = new ArrayList<IProject>();

		if (ruleSet.projectName.empty) {
			projects.addAll(workspace.projects);
		} else {
			for (name : ruleSet.projectName) {
				projects.add(workspace.getProject(name));
			}
		}
		var thisProject = resource.URI.segment(resource.URI.segmentsList.indexOf("resource") + 1)
		var thisProject1 = workspace.getProject(thisProject)
		ReadFiles.cargaProyectos(projects, thisProject1.location.toString);
		fsa.generateFile("Main.java", main(projects, thisProject1));

	}

	def CharSequence main(List<IProject> projects, IProject thisProject) {

		'''
				import java.io.File;
				import java.io.IOException;
				import java.util.List;
				import java.util.ArrayList;
				import es.uam.sara.tfg.ast.*;
			
			public class Main {
			 public static List<TypeVisitor> types= new ArrayList<TypeVisitor>(); 
			 public static TypeVisitor actual= null; 
			 public static void main(String[] args)throws IOException{
			 	
			 	List<Visitors> projects= new ArrayList<Visitors>();
			 List<File> roots= new ArrayList<File>();
			 
			 	�FOR p : projects�
			 		�var src= p.getFolder("src")�
			 		roots.add(new File("�src.location�"));
			 		projects.add(new Visitors("�p.name�"));
			 		types.add(new TypeVisitor("�p.name�", "."));
			 	�ENDFOR�
		
		 	for (int i=0; i <roots.size(); i++){
				types.get(i).readObject();
				actual=types.get(i);
				File root=roots.get(i);
				Visitors visit=projects.get(i);
				ReadFiles.parseFiles(root, visit);
				RuleFactory rf= new RuleFactory(visit);
				rf.getRules();
				rf.writeLog();
				actual=null;
						 	}
		 }
				
		}'''

	}

	def CharSequence RuleFactory(List<Sentence> sentences) {

		var i = 1;
		'''
			import java.io.FileWriter;
			import java.io.PrintWriter;
			import java.util.*;
			
			import es.uam.sara.tfg.ast.*;
			import es.uam.sara.tfg.elements.type.*;
			import es.uam.sara.tfg.sentence.*;
			import es.uam.sara.tfg.properties.*;
			import es.uam.sara.tfg.properties.all.*;
			import es.uam.sara.tfg.properties.attributes.*;
			import es.uam.sara.tfg.properties.classes.*;
			import es.uam.sara.tfg.properties.interfaces.*;
			import es.uam.sara.tfg.properties.methods.*;
			import es.uam.sara.tfg.properties.type.*;
			
			public class RuleFactory {
				
				private List <Sentence<?>> sentence=null;
				private Visitors visitors;
				
				public RuleFactory (Visitors vis){
					this.visitors=vis;
				}
				public List<Sentence<?>> getRules(){
					if (sentence!=null){
						return sentence;
					}else{
						sentence= new ArrayList<Sentence<?>>();
			
					//Crear
					�FOR Sentence s : sentences�
						�IF s instanceof Variable�
							�var v= s as Variable�
							�genetateVariable(v)�
							sentence.add(�s.name�);
							Sentence.allVariables.put("�v.name�", �v.name�);
						�ELSE�
							�var r= s as Rule�
							�IF r.eContainer instanceof RuleSet�
								�r.name="rule"+i�
								�genetateRule(r, ""+(i++))�
								sentence.add(�r.name�);
							�ENDIF�
						�ENDIF�
					�ENDFOR�
					�generateDependences(getPrimarySencence(sentences))�
					return sentence;
					}
				}
				
				public void writeLog(){
					
						FileWriter fichero = null;
							PrintWriter pw = null;
							try{
							fichero = new FileWriter("outs/"+visitors.getProjectName()+".txt");
							pw = new PrintWriter(fichero);
							
							for (Sentence<?> r: sentence){
								System.out.println(r.log());
								pw.println(r.log());
							}
							 } catch (Exception e) {
							      e.printStackTrace();
							  } finally {
							     try {
							      if (null != fichero)
							         fichero.close();
							     } catch (Exception e2) {
							        e2.printStackTrace();
							     }
							  }
							          
				}
			}
			
		'''
	}
	
	def List<Sentence> getPrimarySencence(List<Sentence> sentences){
		var ret= new ArrayList<Sentence> ();
		for (Sentence s:sentences){
			if (s.eContainer instanceof RuleSet){
				ret.add(s)
			}
		}
		return ret;
	}

	def CharSequence generateDependences(List<Sentence> s) {
		var c=""
		for (Sentence v: s){
				
			var contains=v.eAllContents.toIterable.filter(Contains).toList
			var subsentences= new ArrayList<Sentence>()	
			for (Contains cs: contains){
				subsentences.add(cs.rule);
			}	
			c+=
			'''
			�generateDependences(subsentences)�
			�FOR Variable in: v.in� @SuppressWarnings("unchecked")List<�getType(v.element)�> list�v.name��in.name�=(List<�getType(v.element)�>) Sentence.allVariables.get("�in.name�").get();
					�v.name�.setIn(list�v.name��in.name�, "�in.name�");
			�ENDFOR�
				�var k=0�
				�IF v.from!=null�
					for (�getType(v.from.element)� us�k�: �v.from.getName�.get()){
						�v.name�.setFrom("�v.from.getName�" ,us�k�.�getAnalice(v.element)�);
						�v.name�.setUsing("�v.from.getName�",us�k++�);
				�ENDIF�
				
				�FOR VariableSubtype us: v.using�
					�IF us.subtype==Element.NULL�
						for (�getType(us.variable.element)� us�k�: �us.variable.name�.get()){
							�v.name�.setUsing("�us.variable.name�",us�k++�);
					�ELSE�
						for (�getType(us.subtype)� us�k�: us�getK(v, us.variable.name)�.�getAnalice(us.subtype)�){
						�v.name�.setUsing("�us.variable.name��getType(us.subtype)�",us�k++�);
					�ENDIF�
				�ENDFOR�
				�IF v.eContainer instanceof RuleSet�
				�v.name�.analize();
				�ENDIF�
				�FOR VariableSubtype us: v.using�
					}
				�ENDFOR�
				�IF v.from!=null�
					}
				�ENDIF�
				�IF v.eContainer instanceof RuleSet�
				�v.name�.check();
				�ENDIF�
			'''}
		return c;
	}

	def int getK(Sentence s, String name) {
		var i = 0;
		if (s.from != null) {
			if (s.from.name.equals(name)) {
				return i;
			}
			i++;
		}
		var us = s.using;
		for (VariableSubtype vs : us) {
			if (vs.variable.name.equals(name)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	def static String genetateVariable(Variable v) {
		'''
			�var name=v.name�
			//v: �v.toString�
			�var type=getType(v.element)�
			�var analize=getAnalice(v.element)�
			�getOr(v.satisfy, name, v.element)�
			Variable<�type�> �name�=new Variable<�type�> ( "�v.element�",visitors.�analize�, or�name�, "�name�");	
		'''
	}

	def static String getAnalice(Element e) {
		if (e == Element.CLASS) {
			return "get" + e.toString.toFirstUpper + "es()"
		} else {
			return "get" + e.toString.toFirstUpper + "s()"
		}
	}

	def static String genetateRule(Rule r,
		String i) {
		'''
			//r�i�: �r.toString�
			�var type=getType(r.element)�
			�var analize=getAnalice(r.element)�
			�getOr(r.filter, "Filter"+i, r.element)�
			�getOr(r.satisfy, i, r.element)�
			Rule<�type�> �r.name�=new Rule<�type�> (�r.no�, Rule.Quantifier.�r.quantifier.literal.toUpperCase�,visitors.�analize�,orFilter�i�, or�i�, "�r.element�");	
		'''
	}

	def static CharSequence getOr(Or or, String i, Element element) {
		'''
		�var type= getType(element)�
		�IF or!=null�
			Or<�type�> or�i�= new Or<�type�>();
			�var j=1�
			�FOR And a: or.op�
				�getAnd(a, i+j, element)�
				or�i�.addAnd(and�i��j++�);
				
			�ENDFOR�
		�ELSE�
			Or<�type�> or�i�=	null;
			
		�ENDIF�'''
	}

	def static CharSequence getAnd(And a, String i, Element element) {
		'''
			�var j=1�
			�var type= getType(element)�
			And<�type�> and�i� = new And<�type�>();
			�FOR PrimaryOp s : a.op�
				�IF s instanceof Or�
					�getOr(s , i+j,element)�
					and�i�.addPropertie(or�i��j++�);
				�ELSEIF s instanceof PropertyLiteral�
					�getSatisfy((s as PropertyLiteral),element, i+j)�
					and�i�.addPropertie(p�i��j++�);
				�ENDIF�
				
			�ENDFOR�
		'''
	}

	def static CharSequence getSatisfy(PropertyLiteral s, Element e, String sufix) {
		if (e == Element.PACKAGE) {
			return PackageSatisfy.getPropertie(s.property as Package, sufix);
		} else if (e == Element.INTERFACE) {
			return InterfaceSatisfy.getPropertie(s.property as Interface, sufix);
		} else if (e == Element.CLASS) {
			return ClassesSatisfy.getPropertie(s.property as Class, sufix);
		} else if (e == Element.ENUMERATION) {
			return EnumSatisfy.getPropertie(s.property as Enumeration, sufix);
		} else if (e == Element.METHOD) {
			return MethodsSatisfy.getPropertie(s.property as Method, sufix);
		} else if (e == Element.FILE) {
			return FileSatisfy.getPropertie(s.property as File, sufix)
		} else {
			return AttributesSatisfy.getPropertie(s.property as Attribute, sufix);
		}
	}

	def static String getType(Element e) {
		return "M" + e.literal.toLowerCase.toFirstUpper;
	}
}
