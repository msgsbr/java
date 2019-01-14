package course;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures od triangle X: ");	
		xA = data.nextDouble();
		xB = data.nextDouble();
		xC = data.nextDouble();

		System.out.println("Enter the measures od triangle Y: ");	
		yA = data.nextDouble();
		yB = data.nextDouble();
		yC = data.nextDouble();
		
		double p = (xA + xB + xC) / 2.0; 
		double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
		
		p = (yA + yB + yC) / 2.0; 
		double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));
		
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
