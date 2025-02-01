package logic_building;
import java.util.Scanner;

public class LCM {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two number:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int gcd =a,temp=b;
		while(temp !=0) {
			int temp2 =temp;
			temp = gcd % temp;
			gcd = temp2;
		}
		int lcm = (a* b)/gcd;
		System.out.println("lcm:" +lcm);
		sc.close();
	}

}
