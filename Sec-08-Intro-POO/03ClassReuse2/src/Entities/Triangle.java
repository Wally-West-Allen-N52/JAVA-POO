package Entities;

// Created Triangle class to use in the Program class
public class Triangle {
	public double a;
	public double b;
	public double c;

	// Created the function for reuse class Area
	public double Area() {
		double area = (a + b + c) / 2;
		return area;
	}
}