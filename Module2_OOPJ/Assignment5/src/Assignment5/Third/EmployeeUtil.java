package Assignment5.Third;
import java.util.*;
public class EmployeeUtil {
public static void acceptRecord(ArrayList<Employee>employee) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter employee name: ");
	String name = sc.nextLine();
	System.out.print("Enter employee ID: ");
	int id = sc.nextInt();
	System.out.print("Enter employee salary: ");
	double salary = sc.nextDouble();
	employee.add(new Employee(name, id ,salary));
	System.out.println("Employee record added");
}
public static void printRecord(ArrayList<Employee> employee) {
	if(employee.isEmpty()) {
		System.out.println("No empoyee records available");
	}else
	{
		for(Employee emp : employee) {
			System.out.println(emp);
		}
	}
}
public static void Menu(ArrayList<Employee> employee) {
	Scanner sc = new Scanner(System.in);
	while(true)
	{ 
		System.out.println("\n menu: ");
		System.out.println("1. Add Employee Record");
		System.out.println("2. Raise Salary of all employee");
		System.out.println("3.calculate total salary expense");
		System.out.println("4.update employee salary");
		System.out.println("5.print all employee records");
		System.out.println("6. Exit");
		System.out.print("choose an option"); 
		int option = sc.nextInt();
		switch(option){
		case 1:
			acceptRecord(employee);
			break;
		case 2:
			System.out.print("Enter percentage to raise salary: ");
			double percentage = sc.nextDouble();
			Employee.raiseSalary(percentage, employee);
			System.out.println("Salaries update ");
			break;
		case 3 :
			System.out.println("Total salary expense: "+Employee.calculateEmployeeExpense());
			break;
		case 4:
			System.out.println("Enter employee ID to update: ");
			int id = sc.nextInt();
			System.out.println("Enter new salary: ");
			double newSalary =sc.nextDouble();
			Employee.updateEmployeeSalary(id, newSalary, employee);
			System.out.println("Salary update ");
			break;
		case 5:
			printRecord(employee);
			break;
		case 6:
			System.out.println("Exiting..");
			sc.close();
			return;
			default:
				System.out.println("Invalid option,please try again");
				break;
		}
	}
}
}
