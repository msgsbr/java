package course;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		/*
		 * System.out.println = line new, quebra de linha
		 * System.out.print = sem quebra de linha
		 * System.out.printf = com formatacao
		 */
		String product1 	= "Computer";
		String product2 	= "Office desk";
		
		int age 			= 39;
		int code 			= 5290;
		char gender 		= 'M'; // unicode em aspas simples
		
		double price1 		= 2100.0;
		double price2 		= 650.50;
		double measure 		= 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n %n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %c %n %n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.6f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		
		Locale.setDefault(Locale.GERMANY); //Mudar regiao (pais) para mudar a formatacao da moeda
		System.out.printf("US decimal point: %.3f %n", measure);
		
	}

}
