package ir.freeland.spring.preAndPost;

import org.springframework.beans.factory.config.BeanPostProcessor;


public class MagicBeanPostProcessor implements BeanPostProcessor  {
	
	 @Override
	    public Object postProcessBeforeInitialization(Object bean, String beanName) {
	        if (bean instanceof Character) {
	            System.out.println("BeanPostProcessor: Adding a touch of magic to " + ((Student) bean).getFirstName());
	        }
	        return bean;
	    }

	    @Override
	    public Object postProcessAfterInitialization(Object bean, String beanName) {
	        if (bean instanceof Character) {
	            System.out.println("BeanPostProcessor: Magic continues for " + ((Student) bean).getFirstName());
	        }
	        return bean;
	    }

}
