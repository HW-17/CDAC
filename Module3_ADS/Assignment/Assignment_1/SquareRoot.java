import java.util.Scanner;
public class SquareRoot {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number: ");
		int a= sc.nextInt();
		System.out.println(Root(a));
		int Sqrt;
      sc.close();
	}
	public static int Root(int a)
	{
		
		int temp;
		int sqrt=a/2;
		do {
			temp=sqrt;
			sqrt=(temp+(a/temp))/2;
		}while((temp-sqrt)!=0);
		return sqrt;
	}

}
