package POO_Exemplo05;

import java.util.Locale;
import java.util.Scanner;

import POO_Exemplo05.entities.Student;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
        System.out.println("FAILED");
        System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
      }
       else {
        System.out.println("PASS");
     }
      sc.close();
    } 
    
}
