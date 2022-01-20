package EmployeeMessage;
import java.util.Scanner;

// Create a program that reads an employee's name and salary, showing in the end a message:
// Example:
// Employee name: "John Snow"
// Salary: $4500,00
// The employee John Snow has a salary of $4500,00 in July
public class employeeMessage {

	public static void main(String[] args) {
		
		String employeeName;
		double salary;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Employee name: ");
		employeeName = read.next();
		
		System.out.print("Salary $");
		salary = read.nextDouble();
		
		System.out.println("The employee " + employeeName + " has a salary of $" + salary);
		
		read.close();

	}

}
