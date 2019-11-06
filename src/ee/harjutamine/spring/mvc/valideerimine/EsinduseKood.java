package ee.harjutamine.spring.mvc.valideerimine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EsinduseKoodiValidaator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EsinduseKood {

	public String value() default "FON";
	
	public String message() default "Peab algama FON-iga";

	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
}
