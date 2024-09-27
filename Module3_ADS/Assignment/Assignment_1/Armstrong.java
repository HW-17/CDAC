import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number : ");
	    int n = sc.nextInt();
	    int temp = n;
	    int sum = 0;

	    while(temp !=0) {
	      int digit = temp % 10;
	      temp = temp / 10;
	      sum = sum + digit * digit * digit ;
	    }

	    if (sum == n) {
	      System.out.println("true");
	    }else {
	      System.out.println("false");
	    }
	}

}
