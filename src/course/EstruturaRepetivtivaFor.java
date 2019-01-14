package course;

import java.util.Scanner;

public class EstruturaRepetivtivaFor {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("How many integer numbers are you going to enter: ");
		int number = data.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			System.out.print("Value #" + i + ": ");
			int x = data.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		data.close();
	}

}
