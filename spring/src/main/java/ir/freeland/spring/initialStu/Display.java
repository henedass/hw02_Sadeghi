package ir.freeland.spring.initialStu;

public class Display {
	public void outputGrade(String value) {  // Corrected method name
        System.out.println(value);
    }
    
    public void outputStu(String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " " + age);
    }

}
