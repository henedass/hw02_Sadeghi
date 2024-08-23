package ir.freeland.spring.manualStu;

//import java.lang.ProcessHandle.Info;



public class ApplicationStu {
	
	public static void main(String[] args) {
	Student student = new Student();
	Grade grade = new Grade();
	Display display = new Display();
	

	InfoConstructor infoConst = new InfoConstructor(grade, student, display);
	infoConst.showInfo();
	
	InfoSetter infoSetter= new InfoSetter();
	infoSetter.setDisplay(display);
	infoSetter.setGrade(grade);
	infoSetter.setStudent(student);
	infoSetter.showInfo();
	
	
	

	}

}
