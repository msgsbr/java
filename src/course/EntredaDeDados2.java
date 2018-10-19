package course;

import java.util.Scanner;

public class EntredaDeDados2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		sc.nextLine(); // (FLUSH) limpeza de stream de entrada. Para consumir a quebra de linha anterior
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		
		// Codigo composto por uma letra e um digito sendo salvo em variaveis tipadas b5
		
		String s = sc.next(); // b5
		char letter = s.charAt(0); // pega o primeiro caracter
		int digit = Integer.parseInt( s.substring(1) ); // subtrai o primeiro caracter, necessario 'parseInt' para transformar String em Inteiro
		
		// 4.23
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		
		sc.close();
	}

}
