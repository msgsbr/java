package course;

import java.util.Scanner;

public class EstruturaMatriz2 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		
		int n1 = data.nextInt();
		int n2 = data.nextInt();
		
		int matriz[][] = new int[n1][n2];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[n1][n2] = data.nextInt();
			}
		}

		int position = data.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if(matriz[i][j] == position) {
					System.out.println("Position Number: " + i + ", " + j);
					
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}	
					
				}
			
			}
		}
		
		data.close();

	}

}
