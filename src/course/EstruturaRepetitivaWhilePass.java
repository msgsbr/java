package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhilePass {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner data = new Scanner(System.in);
		
		System.out.print("Enter your password: ");
		int pass = data.nextInt();
		
		while (pass != 2002) {
			System.out.println("Ops! Invalid password.");
			System.out.print("Try again: ");
			pass = data.nextInt();
		}
		
		System.out.println("Welcome Sr.!");
		
		data.close();
		
	}

}
