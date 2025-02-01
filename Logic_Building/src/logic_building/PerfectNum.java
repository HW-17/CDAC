package logic_building;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String args[])
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2; i++)
		{
			if(num % i ==0)
			{
				sum += i;
			}
		}
		System.out.println(num + (sum == num ? " is a perfect number ": " is not a perfect number"));
		sc.close();
	}

}
