package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.EmployeeList;

public class ListaEmpregados {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = data.nextInt();
		System.out.println();
		
		List<EmployeeList> list = new ArrayList<>();	
		
		for (int i = 1; i < n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = data.nextInt();
			
			System.out.print("Name: ");
			data.nextLine();
			String name = data.nextLine();
			
			System.out.print("Salary $: ");
			double salary = data.nextDouble();
			
			list.add(new EmployeeList(id, name, salary));
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Enter the Employee id that will have salary increase: ");
		int incId = data.nextInt();
		
		// FILTER ELEMENTS ON LIST W/ LAMBDA EXPRESSION
		EmployeeList employee = list.stream().filter(x -> x.getId() == incId).findFirst().orElse(null); // LAMBDA ON LIST
		
		if(employee != null) {
			System.out.println("Enter the percentage: ");
			double percentage = data.nextDouble();
			
			employee.increaseSalary(percentage);
			
		}
		else {
			System.out.println("This id does not sxiist!");
		}
		
		System.out.println();
		
		System.out.println("List of Employees: ");
		
		// FOREACH
		for (EmployeeList obj : list) {
			System.out.println(obj);
		}
		
		data.close();

	}

}
