package course;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		/*
		 *  + adicao
		 *  - subtracao
		 *  * multiplicacao
		 *  / divisao
		 *  % resto da divisao
		 * 
		 * 	'*', '/', '%' tem precedencia maior que '+' e '-' para anular a precedencia utilize '()' no calculo
		 *  3 + 4 * 2 (precedencia da multiplicacao)
		 *  (3 + 4) * 2 (precedencia anulada pelo parenteses)
		 * */
		
		int n1 = 3 + 4 * 2;
		System.out.println(n1);
		
		int n2 = (3 + 4) * 2;
		System.out.println(n2);

		int n3 = 17 % 3;
		System.out.println(n3);
		
		double n4 = 10.0 / 8.0; // atribui-se pontos aos numeros para informar `a variavel 'n4' que o valor a ser atribuido 'e 'double'
		double n5 = (double) 10 / 8; // outra forma 'e usar o Casting e informar que os valores do calculos serao 'double'
		System.out.println(n4);
		System.out.println(n5);
		
		double a = 1.0, b = -3.0, c = -4.0; // formula de baskara
		double x1 = ( -b + Math.sqrt(b * b - 4.0 * a * c) ) / (2.0 * a);
		System.out.println(x1);
		
		
	}

}
