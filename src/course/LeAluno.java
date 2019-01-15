package course;

import java.util.Scanner;
import entities.Student;

public class LeAluno {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("Insira os dados do Aluno.");
		System.out.print("Name: ");
		aluno.name = data.nextLine();
		System.out.print("Enter #first grade: ");
		aluno.first = data.nextDouble();
		System.out.print("Enter #second grade: ");
		aluno.second = data.nextDouble();
		System.out.print("Enter #third grade: ");
		aluno.third = data.nextDouble();
		
		System.out.printf("FINAL GRADE = " + "%.2f", aluno.finalGrade());
		System.out.println();
		
		if(aluno.status()) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING = %.2f POINTS", aluno.missingPoints());
		}	
		
		data.close();
	}

}
