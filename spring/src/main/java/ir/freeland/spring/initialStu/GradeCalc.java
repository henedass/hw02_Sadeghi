package ir.freeland.spring.initialStu;

public class GradeCalc {
	public void gradeCalculation() {
        Grade grade = new Grade();

        int math = grade.mathGrade(15);
        int java = grade.javaGrade(20);
        int mean = grade.mean(math, java);

        Display displayGrade = new Display();
       
        displayGrade.outputGrade(String.format("Mean of Java and Math Grade= %d", mean));  // Corrected method name
    }

}
