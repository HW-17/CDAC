package logic_building;
import java.util.Scanner;

public class SmallestNumber {
	public static void main(String args[])
	{
		System.out.println("Enter three number: ");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int smallest=Math.min(a,Math.min(b,c));
		System.out.println("smallest number is :" +smallest);
		
	}


}
