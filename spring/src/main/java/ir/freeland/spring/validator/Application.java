package ir.freeland.spring.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
ApplicationContext applicationContext =  SpringApplication.run(Application.class, args);
		
		Input input = new Input();
		input.setEmail("1234");
		input.setPassword("abc");
		    
		var validator = applicationContext.getBean(InputService.class);		
		
		validator.validateInput(input);
		
		
	}

}
