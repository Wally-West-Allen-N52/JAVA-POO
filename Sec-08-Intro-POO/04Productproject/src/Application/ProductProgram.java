package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class ProductProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Product product = new Product(); // Instantiated "Product" class

		System.out.print("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = read.next();
		
		System.out.print("Price $: ");
		product.price = read.nextDouble();
		
		System.out.print("Quanntity in stock: ");
		product.quantity = read.nextInt();  
		System.out.print(product); // Is using the toString method of the product class
		
		System.out.println("\nEnter the number of the products to be added in stock: ");
		int quantity = read.nextInt(); // Create a variable to receive inventory value
		product.addProducts(quantity); // Call the product method
		
		System.out.println("\nUpdate data: " + product); // Print the new program data
		
		System.out.println("\nEnter the number of the products to be remoed from stock: ");
		quantity = read.nextInt();
		product.removeProduct(quantity);
		
		System.out.println("Update data: " + product);
		read.close();
	}

}
