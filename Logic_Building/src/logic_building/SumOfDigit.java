package logic_building;
import java.util.Scanner;

public class SumOfDigit {
public static void main(String args[])
{
	System.out.println("Enter the number: ");
	Scanner sc =new Scanner(System.in);
	int num =sc.nextInt(); 
	int sum =0;
	while(num>0)
	{
		sum += num%10;
		num=num/10;
	}
	System.out.println("sum of digits is: " +sum);
	sc.close();
}
}
