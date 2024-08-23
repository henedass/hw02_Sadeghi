package ir.freeland.spring.preAndPost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String beanName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void customInit() {
        System.out.println("Custom Initialization: Executing custom init for " + getFirstName());
       
    }

    public void customDestroy() {
        System.out.println("Custom Destruction: " + getFirstName() + " is bidding farewell and performing a final action.");
        
    }
	@Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }
	
	@PostConstruct
    public void init() {
        System.out.println("@PostConstruct: " + getFirstName() + " is preparing for action.");
	}
	
	@PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy: " + getFirstName() + " is saying goodbye and preparing to rest.");
    }

}
