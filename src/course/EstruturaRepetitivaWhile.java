package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		
		while(num >= 0.0) {
			double raiz = Math.sqrt(num);
			System.out.printf("%.3f%n", raiz);
			System.out.print("Enter a number: ");
			num = sc.nextDouble();
		}
		System.out.println("Negative number!");
		
		sc.close();
	}

}
