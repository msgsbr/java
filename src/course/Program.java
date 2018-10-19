package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Saida de Dados!");
		
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		// Tipos primitivos
		boolean 	a = true; // (1 bit) 
		char 		b = '\u0041'; // (16 bits) caractere unicode, aspas simples para unicode
		byte 		c = 127; // (8 bits) -128 to 127 
		short 		d = 32767; // (16 bits) -32768 to 32767
		int 		e = 1000; // (32 bits)
		long 		f = 12345689798798798L; // (64 bits), acrescenta-se 'L' para o compilador nao entender que seja 'int'
		float 		g = 0.5f; // (32 bits) 0.0, acrescenta-se 'f' para o compilador nao entender que seja 'double'
		double 		h = 0.9; // (64 bits) 0.0
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		// STRING | OBJECT
		String txt = "Lorem Ipsum Dolor";
		System.out.println(txt);

		Object obj = "Lorem Ipsum Dolor 2";
		System.out.println(obj);

		Object obj2 = 4.5f;
		System.out.println(obj2);
		
	}

}
