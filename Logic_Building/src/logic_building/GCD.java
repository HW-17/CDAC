package logic_building;
import java.util.Scanner;

public class GCD {
public static void main(String args[])
{
	System.out.println("Enter two numbers:");
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b=sc.nextInt();
	while(b !=0)
	{
		int temp =b;
		b=a % b;
		a=temp;
	}
	System.out.println("GCD:" +a);
}
}
