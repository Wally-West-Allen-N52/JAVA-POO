package Application;
import java.util.Scanner;

import Entities.Retangle;

public class Program {

	public static void main(String[] args) {
	
		Scanner read =  new Scanner(System.in);
		Retangle retangle = new Retangle();
			
			System.out.print("Enter retangle Width: ");
			retangle.width = read.nextDouble();
			
			System.out.print("Enter retnagle heiht: ");
			retangle.height = read.nextDouble();
			
			System.out.println(retangle);
			
		read.close();
	}

}
