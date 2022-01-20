package Welcome;
import java.util.Scanner;

// Write a program that reads a person's name and displays "welcome" message for them:
// Example:
// What is your name? Answer: Jack
// Hello Jack, nice to meet you.

public class Welcome {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("What is your first name? ");
		String name = read.next();
		
		System.out.println("Hello, " + name + " nice to meet you!");
		
		read.close();
	}

}
