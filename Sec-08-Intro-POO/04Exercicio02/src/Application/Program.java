package Application;

import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
			Employee employee = new Employee(); // Instantiated "Employee"
			
			System.out.print("Enter employee name: ");
			employee.name = read.next();
			
			System.out.print("Enter gross salary $ ");
			employee.grossSalary =  read.nextDouble();
			
			System.out.print("Enter tax $ ");
			employee.tax = read.nextDouble();
			
			System.out.print("\nUpdate data:\n" + employee);
			
			System.out.print("\n\nPercentage to increase the salary: ");
			employee.percentage = read.nextDouble(); 
			
			System.out.print("\nUpdate data: " + employee.name + "\n" + "New gorss salary $" + String.format("%.2f", employee.increaseSalary()));
			
		read.close();
	}

}
