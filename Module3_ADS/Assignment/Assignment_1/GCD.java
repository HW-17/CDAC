import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int a=sc.nextInt();
		System.out.println("Enter Scecond num: ");
		int b=sc.nextInt();
		int gcd =1;
		for(int i =1;i<= a && i<=b;++i)
		{
			if(a%i == 0 && b%i==0)
				gcd =i;
		}
		System.out.println("a= "+a +" b= "+b );
		System.out.println(+gcd);

	}

}
