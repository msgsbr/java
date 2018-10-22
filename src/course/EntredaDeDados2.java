package course;

import java.util.Scanner;

public class EntredaDeDados2 {

	public static void main(String[] args) {
		
		// Para mudar o formato da moeda de ',' para '.' é necessario alterar o IDIOMA/LOCALIZACAO.
		// IMPORTANTE: a alteracao de idioma deve ser realizada antes de instanciar a classe Scanner de entrada de dados
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		sc.nextLine(); // (FLUSH) limpeza de stream de entrada. Para consumir a quebra de linha anterior
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		
		// Codigo composto por uma letra e um digito sendo salvo em variaveis tipadas b5
		
		String s = sc.next(); // b5
		char letter = s.charAt(0); // pega o primeiro caracter
		int digit = Integer.parseInt( s.substring(1) ); // subtrai o primeiro caracter, necessario 'parseInt' para transformar String em Inteiro

		// 4.32
		double n2 = sc.nextDouble();
		
		// Marcelo M 39 1.80, guardando em variaveis separadas
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		
		System.out.println(n2);
		
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		// fecha a classe depois do uso
		sc.close();
	}

}
