package ir.freeland.spring.preAndPost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class StudentConfig {
	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    Student student() {
        Student student = new Student();
        student.setFirstName("Sadeneh");
        student.setLastName("Sadeghi");
        student.setAge(22);
        return student;
    }
	
	
	@Bean
    MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }

}
