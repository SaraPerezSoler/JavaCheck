package es.uam.sara.tfg.properties.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FrutoSeco {
	boolean tieneVitaminaE() default false;
	
	int calorias() default 0;
	
	String arbolQueDaEsteFruto() default "";	
}
