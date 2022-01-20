import java.util.Scanner;

public class triabglesXY {

	public static void main(String[] args) {
		double xa, xb, xc, ya, yb, yc, areaX, areaY;

		Scanner read = new Scanner(System.in);
		System.out.println("Enter the massures of tringle x:");
		xa = read.nextDouble();
		xb = read.nextDouble();
		xc = read.nextDouble();
		areaX = (xa + xb + xc) / 2;
		System.out.println("Enter the messure of the triangle Y");
		ya = read.nextDouble();
		yb = read.nextDouble();
		yc = read.nextDouble();
		areaY = (ya + yb + yc) / 2;
	
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
