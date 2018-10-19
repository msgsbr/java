package course;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		/*
		 * Operador			Exemplo			Significado 
		 * = 				a = 10; 		a RECEBE10; 
		 * += 				a += 2; 		a RECEBEa + 2; 
		 * -= 				a -= 2; 		a RECEBEa -2; 
		 * *= 				a *= 2; 		a RECEBEa * 2; 
		 * /= 				a /= 2; 		aRECEBEa / 2; 
		 * %= 				a %= 3; 		a RECEBEa % 3
		 */
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("--------------------------");
		
		n1 *= 2; // 20
		n2 += n1; // 50
		s += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);

		System.out.println("--------------------------");
		
		// ARITMETICOS E ATRIBUICAO
		int a = 10;
		a++;
		System.out.println(a);

		System.out.println("--------------------------");
		
		int A = 10;
		int B = A++;
		System.out.println(A);
		System.out.println(B);

		System.out.println("--------------------------");
		
		int C = 10;
		int D = ++C;
		System.out.println(C);
		System.out.println(D);
		
	}
}
