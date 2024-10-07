import java.util.Scanner;
public class RevNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		/*int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num % 10;
			num=num/10;
		}*/
		StringBuffer rev;
		StringBuffer a =new StringBuffer(String.valueOf(num));
		 rev = a.reverse();
		System.out.println(rev);
		sc.close();
	}

}
