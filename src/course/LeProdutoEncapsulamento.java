package course;

import java.util.Scanner;
import entities.ProductEncapsulamento;

public class LeProdutoEncapsulamento {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = data.nextLine();
		
		System.out.print("Price: ");
		double price = data.nextDouble();
		
		ProductEncapsulamento product = new ProductEncapsulamento(name, price);
		
		// alterando valores dos atributos do obj encapsulado pelo set/get
		product.setName("Mesa");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1500);
		System.out.println("Updated price: " + product.getPrice());		
		// alterando valores dos atributos do obj encapsulado pelo set/get
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(data.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(data.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		
		data.close();

	}

}
