package util;

public class Calculator {

	// Keyword "final" defines an entity that can be assigned only once. Capital
	// latter pattern
	public final double PI = 3.14159; // Without the static method

	// Create the circumference function without the static method
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	// Create the volume function without the static method
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
