package ir.freeland.spring.springStu.annotation;

import org.springframework.stereotype.Service;

@Service
public class Display {

	public void output(String value1, int value2) {
		System.out.println(value1 +" "+ value2);
	}
	
	public void outputInt(int value) {
		System.out.println( value);
	}
	
	public void outputString(String value) {
		System.out.println( value);
	}

}
