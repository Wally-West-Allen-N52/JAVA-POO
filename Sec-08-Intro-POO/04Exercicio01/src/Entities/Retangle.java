package Entities;

public class Retangle {
	public double width;
	public double height;

	// operation/ function/ method
	public double area() {
		return width * height; // Getting "width and height" as argument
	}

	public double perimeter() {
		return (width * 2) + (height * 2); // Getting "width  and height" as argument
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height ); // Getting "width and height" as argument
	}

	@Override
	public String toString() {
		return "\nRetangle width: " + width + "\nRetangle height: " + height + "\nArea: " + area() + "\n\nPerimeter: " + perimeter() + "\nDiagoonal: " + diagonal();
	}

}
