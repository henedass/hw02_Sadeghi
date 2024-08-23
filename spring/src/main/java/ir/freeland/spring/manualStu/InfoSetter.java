package ir.freeland.spring.manualStu;

public class InfoSetter {
	


	
	private  Display display;
	private  Grade grade ;
	private  Student student;

	public void showInfo() {
		
		int result = grade.mean(15, 20);
		
		String showInfo= student.stuInfo("Sadeneh", "Sadeghi", 22);
		
		display.output(showInfo,result);
		
	}
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	

	
	public void setGrade (Grade grade) {
		this.grade= grade;
	}
	
	public void setStudent(Student student) {
		this.student= student;
	}

}
