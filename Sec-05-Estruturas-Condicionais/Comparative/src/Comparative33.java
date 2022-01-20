import java.util.Scanner;

public class Comparative33 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int number1, number2, option=0;
		do {
			System.out.println("Enter first number:");
			number1 = read.nextInt();
			System.out.println("Enter second number:");
			number2 = read.nextInt();

			if (number1 > number2) {

				System.out.println("The first number is bigger than the second?");
			} else {
				System.out.println("The second number is bigger than the first?");
			}
			System.out.println("Do you want continue entering numbers for test?");
			option=read.nextInt();
			
		}while(option==1);
				
		read.close();

	}

}
