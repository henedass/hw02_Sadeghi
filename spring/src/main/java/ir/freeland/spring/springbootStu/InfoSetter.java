package ir.freeland.spring.springbootStu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InfoSetter {
	
	private  Display display;
	private  Grade grade ;
	private  Student student;

	public void showInfo() {
		
		int result = grade.mean(15, 20);
		
		String showInfo= student.stuInfo("Sadeneh", "Sadeghi", 22);
		
		display.output(showInfo,result);
		
	}
	@Autowired
	public void setDisplay(Display display) {
		this.display = display;
	}

	@Autowired
	public void setGrade (Grade grade) {
		this.grade= grade;
	}
	@Autowired
	public void setStudent(Student student) {
		this.student= student;
	}

}
