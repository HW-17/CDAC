package logic_building;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetre the number :");
		int num = sc.nextInt();
		int rev=0;
		while(num>0) {
			rev=rev*10 + num %10;
			num /= 10;
		}
		System.out.println("reverse number is: " +rev);
		sc.close();
	}

}
