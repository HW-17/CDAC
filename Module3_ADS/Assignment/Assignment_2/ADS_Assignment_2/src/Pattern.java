import java.util.Scanner;

public class Pattern {

	public static void Star(int n ) {
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n =sc.nextInt();
		Star(n);
		sc.close();
	}
}
