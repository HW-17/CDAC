package Assignment6.four;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
public static int  RDupicate( int[] a) {
	int i=0;
	for(int j=1;j<a.length;j++) {
		if(a[i]!=a[j]) {
			i++;
			a[i]=a[j];
		}
	}
	return i+1;
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array Elements: "+Arrays.toString(a));
		Arrays.sort(a);
		int b =RDupicate(a);
		System.out.println("Array Without Dupiate Elements: ");
		for(int i=0;i<b;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
