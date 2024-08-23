package ir.freeland.spring.springStu.annotation;

import org.springframework.stereotype.Service;

@Service
public class Grade {

    public int mean(int mathGrade, int javaGrade) {  // Corrected parameter names
        return (mathGrade + javaGrade) / 2;
    }

}
