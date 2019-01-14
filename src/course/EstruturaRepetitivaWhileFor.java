package course;

import java.util.Scanner;

public class EstruturaRepetitivaWhileFor {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int num = data.nextInt();
		int higher = 0;
		
		while(num <= 0) {
			System.out.print("N must be positive! Try again: ");
			num = data.nextInt();			
		}
		
		for (int i = 1; i <= num; i++) {
			System.out.print("Value #" + i + ": ");
			int x = data.nextInt();
			if(higher < x)
				higher = x;
			
		}
		
		System.out.println("Higher: " + higher);
		
		data.close();
		

	}

}
