package Application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		// Instantiated "Calculator" object has been  was deleted

		
		System.out.println("Enter raduis: ");

		double radius = read.nextDouble();
		
		// Static methods to call the "Calculator class" from package "util"
		double c = Calculator.circumference(radius);
		// Static methods to call the "Calculator class" from package "util"
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI); // Static method to call the "calculator" from package "util"

		read.close();
	}

}
