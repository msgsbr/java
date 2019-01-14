package course;

import java.util.Scanner;

public class EstruturaRepetitivaWhileCartesiano {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("Insira a coordenada X: ");
		int x = data.nextInt();
		System.out.print("Insira a coordenada Y: ");
		int y = data.nextInt();		
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}

			System.out.print("Insira a coordenada X: ");
			x = data.nextInt();
			System.out.print("Insira a coordenada Y: ");
			y = data.nextInt();
			
		}
		
		data.close();
	}

}
