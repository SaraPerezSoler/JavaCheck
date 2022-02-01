package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Checkeable;

public class And<T extends IElements> extends Checkeable<T> {

	private List<PrimaryOp<T>> properties;
	private boolean changeForContains = false;

	public And() {
		super(false);
		properties = new ArrayList<PrimaryOp<T>>();
	}

	public void addPropertie(PrimaryOp<T> p) {

		properties.add(p);

	}

	@Override
	public void check(List<T> analyze) {
		for (PrimaryOp<T> p : properties) {
			p.check(analyze);
		}
		changeForContains = false;
		for (T a : analyze) {
			boolean wrong = false;
			for (PrimaryOp<T> p : properties) {
				if (p.isChangeForContains()) {
					if (p.getWrong().contains(a)) {
						changeForContains = true;
						this.addLastWrong(a);
						wrong = true;
					}
				} else {
					if (p.getWrong().contains(a)) {
						this.addWrong(a);
						wrong = true;
					}
				}
				if (wrong == false) {
					this.addRight(a);
				}
			}
		}
	}

	public void reset() {
		for (Checkeable<T> a : properties) {
			a.reset();
		}
		super.reset();
	}

	@Override
	public String toString() {
		String cad = "";
		String and = "";
		for (PrimaryOp<T> p : properties) {
			if (p instanceof Or<?>) {
				cad += and + "(" + p.toString() + ")";
			} else {
				cad += and + p.toString();
			}
			and = " and ";

		}
		return cad;
	}

	@Override
	public String print(boolean right) {
		String cad;
		if (right) {
			cad = "This elements satisfy " + this.toString() + ":\n";
		} else {
			cad = "This elements don't satisfy " + this.toString() + ":\n";
		}
		if (properties.size() <= 1) {
			cad = "";
		}
		for (Checkeable<T> p : properties) {
			cad += p.print(right);
		}
		return cad + "\n";
	}

	@Override
	public boolean checkElement(T analyze) {
		return false;
	}

	public boolean needVariables() {
		for (PrimaryOp<T> a : this.properties) {
			if (a.needVariables()) {
				return true;
			}
		}
		return false;
	}

	public void setUsing(Map<String, IElements> using) {
		for (PrimaryOp<T> a : this.properties) {
			a.setUsing(using);
		}
		super.setUsing(using);
	}

	public boolean isChangeForContains() {
		return changeForContains;
	}

	@Override
	public void reset(RuleSave<T> rs, int i) {
		this.reset();
		this.addAllRight(rs.getRight(i));
		this.addAllWrong(rs.getWrong(i));
		int k=i++;
		for (PrimaryOp<T> a : properties){
			a.reset(rs, k);
			k=1+a.getChildren();
		}
		
	}

	@Override
	public int getChildren() {
		int i=0;
		for (PrimaryOp<T> p: this.properties){
			i+=p.getChildren();
		}
		return 1+i;
	}

	@Override
	public void save(RuleSave<T> rs, int i) {
		rs.save(i, getRight(), getWrong());
		int k=i++;
		for (PrimaryOp<T> a : properties){
			a.save(rs, k);
			k=1+a.getChildren();
		}
		
	}

}
