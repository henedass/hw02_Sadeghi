package ir.freeland.spring.initialStu;

public class StuInfo {
	
	public void stuInfo() {
        Student student = new Student();
    
        String first = student.firstName("Sadeneh");
        String last = student.lastName("Sadeghi");
        int age = student.age(22);
        
        Display displayStu = new Display();
         
        displayStu.outputStu(first, last, age);
    }

}
