package course;

import java.util.Scanner;
import entities.Employee;

public class LeFuncionario {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.println("Insira abaixo as informações do funcionário.");
		System.out.print("Name: ");
		funcionario.name = data.nextLine();
		System.out.println("Gross salary: ");
		funcionario.grossSalary = data.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = data.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		funcionario.increaseSalary(data.nextDouble());

		System.out.println();
		System.out.println("Updated data: " + funcionario);
		
		data.close();
	}

}
