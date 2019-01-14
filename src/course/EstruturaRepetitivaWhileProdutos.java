package course;

import java.util.Scanner;

public class EstruturaRepetitivaWhileProdutos {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("1 Etanol | 2 Gasolina | 3 Diesel | 4 Finalizar Sistema");
		System.out.print("Digite o cod. do combustível: ");
		int prod = data.nextInt();
		int etanol = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (prod != 4) {
			String message = "Digite o cod. do combustível: "; 
			
			if (prod == 1) {
				etanol += 1;
			} 
			else if(prod == 2) {
				gasolina += 1;
			}
			else if(prod == 3) {
				diesel += 1;
			}
			else {
				message = "Código inválido, digite novamente: ";
			}
			
			System.out.print(message);			
			prod = data.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Etanol: " + etanol);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		data.close();
		
	}

}
