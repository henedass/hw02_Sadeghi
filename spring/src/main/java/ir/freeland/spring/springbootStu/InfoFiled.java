package ir.freeland.spring.springbootStu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class InfoFiled {
	@Autowired
	private  Display display;
	@Autowired
	private  Student stu;
	@Autowired
	private  Grade grade;
	
	
	public void showInfo() {
		
		int result = grade.mean(15, 20);
		
		String showInfo= stu.stuInfo("Sadeneh", "Sadeghi", 22);
		
		display.output(showInfo, result);
		
	}

}
