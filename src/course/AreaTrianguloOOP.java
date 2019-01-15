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
		
		double areaX = x.area();
		double areaY = y.area();
		
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
