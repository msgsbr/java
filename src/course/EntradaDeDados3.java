package course;
import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		// insira nome completo
		String nomeCompleto = data.nextLine();
		// insira quantos quartos em sua residencia
		int quartos = data.nextInt();
		// insira o preco do produto
		double preco = data.nextDouble();
		// insira seu sobrenome, idade e altura na mesma linha
		String sobreNome = data.next();
		int idade = data.nextInt();
		double altura = data.nextDouble();
		
		System.out.println(nomeCompleto);
		System.out.println(quartos);
		System.out.println(preco);		
		System.out.println(sobreNome);
		System.out.println(idade);
		System.out.println(altura);
			
		// FINALIZANDO O USO DA CLASSE
		data.close();
		
	}

}
