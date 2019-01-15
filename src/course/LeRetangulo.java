package course;

import java.util.Scanner;
import entities.Rectangle;

public class LeRetangulo {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle with and height: ");
		retangulo.width = data.nextDouble();
		retangulo.height = data.nextDouble();
		
		System.out.println("AREA: " + String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETER: " + String.format("%.2f", retangulo.perimeter()));
		System.out.println("DIAGONAL: " + String.format("%.2f", retangulo.diagonal()));
		
		data.close();

	}

}
