package entities;

public class ProductConstruct {
	
	public String name;
	public double price;
	public int quantity;

	// construct default
	public ProductConstruct() {

	}
	
	// construct w 3 args
	public ProductConstruct(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// construct w 2 args (SOBRECARGA)
	public ProductConstruct(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return 	name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity + " unit(s), Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
	
}
