package ee.harjutamine.spring.mvc.valideerimine;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EsinduseKoodiValidaator 
	implements ConstraintValidator<EsinduseKood, String> {

	private String esinduseEesliide;
	
	@Override
	public void initialize(EsinduseKood esinduseKood) {
		this.esinduseEesliide = esinduseKood.value();
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean vastus; 
		
		if(arg0 != null) {
			vastus = arg0.startsWith(esinduseEesliide);
		} else {
			vastus = true;
		}
		return vastus;
	}

}
