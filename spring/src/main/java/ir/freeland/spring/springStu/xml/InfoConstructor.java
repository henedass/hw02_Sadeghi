package ir.freeland.spring.springStu.xml;



public class InfoConstructor {

	
	private final Display display;
	private final Student stu;
	private final Grade grade;
	
	public InfoConstructor(Grade grade, Student stu, Display display) {
		this.stu=stu;
		this.grade= grade;
		this.display = display;
	}
	
	public void showInfo() {
		
		int result = grade.mean(15, 20);
		
		String showInfo= stu.stuInfo("Sadeneh", "Sadeghi", 22);
		
		display.output(showInfo, result);
		
		
		
		
	}

}
