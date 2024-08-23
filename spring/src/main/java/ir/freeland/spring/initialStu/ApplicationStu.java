package ir.freeland.spring.initialStu;

public class ApplicationStu {
	public static void main(String[] args) {
	    
        GradeCalc gradeCalc = new GradeCalc();
        StuInfo stuInfo = new StuInfo();
        
        gradeCalc.gradeCalculation();
        stuInfo.stuInfo();
    }

}
