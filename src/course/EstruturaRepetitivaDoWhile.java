package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US); // caso o sistema nao esteja com pontos na separacao dos decimais
		Scanner data = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Enter a number: ");
			double n = data.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);
			System.out.print("Repeat (y/n)? ");
			resp = data.next().charAt(0);
			
		} while (resp != 'n');
		
		data.close();
	}

}
