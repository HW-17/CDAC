package Assignment6.Second;
import java.util.*;
class ArrElement{

	
		int []n=new int[5];
		Scanner sc =new Scanner(System.in);
		
	public void acceptrecord()
	{
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		}
		sc.close();
	}
	public void printRecord() {
		System.out.println("array elements are: ");
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
	}
	
}


