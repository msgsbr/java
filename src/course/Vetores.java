package course;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);

		int n = data.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = data.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("Average Height: %.2f", avg);
		
		data.close();
	}

}
