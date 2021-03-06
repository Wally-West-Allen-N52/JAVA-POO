package Entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax; // Imposto
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary() {
		return  grossSalary / percentage + grossSalary;
	}
	
	@Override
	public String toString() {
		return "Employee name: " + name + "\nNet salary $ " + String.format("%.2f",netSalary());
	}
}
