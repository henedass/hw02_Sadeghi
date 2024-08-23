package ir.freeland.spring.springStu.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ApplicationStu {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextStu_annotation.xml");
		 
		 InfoSetter infoSetter = context.getBean(InfoSetter.class);
		 infoSetter.showInfo();
		    
		InfoConstructor infoConstructor = (InfoConstructor) context.getBean("infoConstructor");
		infoConstructor.showInfo();
		
		InfoFiled infoFiled = context.getBean(InfoFiled.class);
		infoFiled.showInfo();
	}

}
