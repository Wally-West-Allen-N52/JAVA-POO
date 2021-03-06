package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	// Keyword "final" defines an entity that can be assigned only once. Capital
	// latter pattern
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		System.out.println("Enter raduis: ");
		double radius = read.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		read.close();
	}

	// Create the circumference function
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	// Create the volume function
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
