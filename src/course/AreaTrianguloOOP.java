package course;

import java.util.Scanner;
import entities.Triangle;

public class AreaTrianguloOOP {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures od triangle X: ");	
		x.a = data.nextDouble();
		x.b = data.nextDouble();
		x.c = data.nextDouble();

		System.out.println("Enter the measures od triangle Y: ");	
		y.a = data.nextDouble();
		y.b = data.nextDouble();
		y.c = data.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0; 
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0; 
		double areaY = Math.sqrt(p * (p - y.a) * (p-y.b) * (p-y.c));
		
		System.out.printf("Triangle X area: %.3f%n", areaX);
		System.out.printf("Triangle Y area: %.3f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		data.close();
		
	}

}
