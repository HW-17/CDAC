package Assignment5.Third;
import java.util.*;
public class Employee {
private static int employeeCount = 0;
private static double totalSalary = 0.0;
private double salary;
private String name;
private int id;
public Employee(String name,int id, double salary) {
	this.name = name;
	this.id=id;
	this.salary=salary;
	employeeCount++;
	totalSalary += salary;
}
public double getSalary()
{
	return salary;
}
public void setSalary(double salary)
{
	totalSalary = totalSalary - this.salary+salary;
	this.salary = salary;
}
public String getName()
{
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId()
{
	return id;
}
public static void raiseSalary(double percentage , ArrayList<Employee> employee) {
	for(Employee emp:employee) {
		double newSalary = emp.salary*(1+percentage/100);
		emp.setSalary(newSalary);
	}
}
public static double calculateEmployeeExpense()
{
	return totalSalary;
}
public static void updateEmployeeSalary(int id,double newSalary,ArrayList<Employee>employee) {
	for(Employee emp : employee) {
		if(emp.getId()==id) {
			emp.setSalary(newSalary);
			break;
		}
	}
}
}
