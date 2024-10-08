package ir.freeland.spring.validator;

import java.util.Set;

import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Service
public class InputService {
	
	private Validator validator;

	public InputService(Validator validator) {
		super();
		this.validator = validator;
	}
	
	public void validateInput(Input input) {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
	    Set<ConstraintViolation<Input>> violations = validator.validate(input);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }

	  public void validateInputWithInjectedValidator(Input input) {
	    Set<ConstraintViolation<Input>> violations = validator.validate(input);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }

}
