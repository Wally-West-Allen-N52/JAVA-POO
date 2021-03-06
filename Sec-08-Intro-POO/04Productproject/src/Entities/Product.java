package Entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// Operation/function/method
	public double totalValueInStock() {
		return price * quantity; // Getting "price and quantity" as argument
	}
	// Operation/function/method
	public void addProducts(int quantity) { // Returns nothing. Just change "quantity" attribute value
		this.quantity += quantity; // Getting "quantity" as argument 
	}
	// operation/function/method
	public void removeProduct(int quantity) { // Returns nothing. Just change "quantity" attribute value
		this.quantity -= quantity; // Getting "quantity" as argument
	}
	@Override
	// Override default toString of Java class object
	public String toString() { // Generates a presentation method to be called as a string
		return "\nProduct name: " + name + "\nPrice: $" + String.format("%.2f", price) + "\nQuantity: " + quantity + " Uinits, Total $" + String.format("%.2f", totalValueInStock()) + "\n";
	}
	
}
