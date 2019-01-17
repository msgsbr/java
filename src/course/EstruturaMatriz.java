package course;

import java.util.Scanner;

public class EstruturaMatriz {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		
		int n = data.nextInt();
		
		// NEW BIDIMENSIONAL MATRIZ
		int[][] matriz = new int[n][n];
		
		// READ MATRIZ
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = data.nextInt();
			}	
			
		}

		System.out.println();
		System.out.println("Main diagonal: ");
		// READ MAIN DIAGONAL MATRIZ
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + ", ");
		}
		System.out.println();
		
		// COUNTING NEGATIVE NUMBERS ON MATRIZ
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}			
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
		data.close();

	}

}
