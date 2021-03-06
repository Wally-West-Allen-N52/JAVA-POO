package Application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		// As the class members are not static it is necessary to instantiate the object "Calculator"
		Calculator calc = new Calculator();
		
		System.out.println("Enter raduis: ");

		double radius = read.nextDouble();
		
		// Method to call the "calculator"
		double c = calc.circumference(radius);
		// Method to call the "calculator"
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI); // Method to call the "calculator"

		read.close();
	}

}
