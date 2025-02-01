package logic_building;

import java.util.Scanner;

public class AddWithoutOperator {
	public static void main(String args[])
	{
		System.out.println("Enter two number: ");
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		while(y != 0)
		{
			int carry = x & y;
			x= x^y;
			y=carry << 1;
			
		}
		System.out.println("sum: " +x);
		sc.close();
}
}
