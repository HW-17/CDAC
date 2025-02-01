package logic_building;
import java.util.Scanner;

public class NumToDigit {
public static void main(String args[])
{
	System.out.println("Enter the number:");
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	while(num>0)
	{
		int digit = num %10;
		System.out.println(digit);
		num=num/10;
	}
}
}
