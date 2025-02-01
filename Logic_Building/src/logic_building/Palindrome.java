package logic_building;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int rev =0,temp=num;
		while(temp> 0)
		{
			rev = rev*10 + temp %10;
			temp /= 10;
		}
		if(num==rev)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not palindrome");
		}
		sc.close();
		
	}

}
