package logic_building;
import java.util.Scanner;
public class Factorial_Recursion {
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int fact =factorial(num);
		System.out.println("factorial of " +num + " is "+fact);
	}

}
