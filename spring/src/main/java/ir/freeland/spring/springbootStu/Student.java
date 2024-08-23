package ir.freeland.spring.springbootStu;

import org.springframework.stereotype.Service;
@Service
public class Student {
	
    public String stuInfo(String firstName,String lastName,int age ) {
    	return firstName + " " + lastName + " " + age;
    
    }	


}
