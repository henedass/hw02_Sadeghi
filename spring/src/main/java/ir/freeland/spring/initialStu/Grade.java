package ir.freeland.spring.initialStu;

public class Grade {
	
	public int mathGrade(int mathGrade) {
        return mathGrade;
    }
    
    public int javaGrade(int javaGrade) {
        return javaGrade;
    }
    
    public int mean(int mathGrade, int javaGrade) {  // Corrected parameter names
        return (mathGrade + javaGrade) / 2;
    }

}
