package Application;

import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Triangle x, y; // ImportedTriangle class from Triangle class
		x = new Triangle(); // Triangle class instantiated
		y = new Triangle(); // Triangle class instantiated

		Scanner read = new Scanner(System.in);
		System.out.println("Enter the massures of tringle x:");
		x.a = read.nextDouble(); // "x" Accesses the "a" attribute of the Triangle class
		x.b = read.nextDouble(); // "x" Accesses the "b" attribute of the Triangle class
		x.c = read.nextDouble(); // "x" Accesses the "c" attribute of the Triangle class
		double areaX = (x.a + x.b + x.c) / 2;
		System.out.println("Enter the messure of the triangle Y");
		y.a = read.nextDouble(); // "y" Accesses the "a" attribute of the Triangle class
		y.b = read.nextDouble(); // "y" Accesses the "b" attribute of the Triangle class
		y.c = read.nextDouble(); // "y" Accesses the "c" attribute of the Triangle class
		double areaY = (y.a + y.b + y.c) / 2;
	
		System.out.println("Tiangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY);
		if (areaX > areaY) {
			System.out.println("Large aerea: X");
		} else {
			System.out.println("Large area: Y");
		}
		read.close();
	}

}
