package course;

import java.util.Scanner;
import entities.VectorProduct;

public class VetoresClasse {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int n = data.nextInt();	
		VectorProduct[] vect = new VectorProduct[n];
		
		for (int i = 0; i < vect.length; i++) {
			data.nextLine();
			String name = data.nextLine();
			double price = data.nextDouble();
			vect[i] = new VectorProduct(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();  
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price: %.2f", avg);
		data.close();
	}

}
