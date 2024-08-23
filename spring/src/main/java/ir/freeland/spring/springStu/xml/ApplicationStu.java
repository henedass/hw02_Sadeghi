package ir.freeland.spring.springStu.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class ApplicationStu {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextStu_xml.xml");

	    InfoSetter infoSetter = context.getBean(InfoSetter.class);
	    infoSetter.showInfo();
	    

	    
		InfoConstructor infoConstructor = (InfoConstructor) context.getBean("infoConstructor");
		infoConstructor.showInfo();


	    
	}

}
