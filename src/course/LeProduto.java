package course;

import java.util.Scanner;
import entities.Product;

public class LeProduto {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		Product product = new Product();	
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = data.nextLine();
		System.out.print("Price: ");
		product.price = data.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = data.nextInt();
		
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
