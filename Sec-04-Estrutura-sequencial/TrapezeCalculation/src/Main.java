import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		
		double b, B, h, area;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the value of b:");
		b=read.nextDouble();
		System.out.println("Enter the value of B:");
		B=read.nextDouble();
		System.out.println("Enter thhe value of h:");
		h=read.nextDouble();
		
		area=(b+B)/2*h;
		System.out.println(area);
		read.close();
	}

}
