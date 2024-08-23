package ir.freeland.spring.springbootStu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class ApplicationStu implements CommandLineRunner{
	private final ApplicationContext context;
	
	public ApplicationStu(ApplicationContext context) {
	    this.context = context;
	  }
	
	 public static void main(String[] args) {
		    SpringApplication.run(ApplicationStu.class, args);
		  }
	 
	 @Override
	  public void run(String... args) {
	    InfoConstructor infoConst = context.getBean(InfoConstructor.class);
	    infoConst.showInfo();

	    InfoFiled infoFiled = context.getBean(InfoFiled.class);
	    infoFiled.showInfo();
	    
	    InfoSetter infoSetter = context.getBean(InfoSetter.class);
	    infoSetter.showInfo();
	  }


}
