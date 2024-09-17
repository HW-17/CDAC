package Assignment6.third;

import java.util.Scanner;

public class ArrayMinMax {
	

static int Max(int arr[]) {
	int res = arr[0];
	for(int i=1;i<arr.length;i++)
		res= Math.max(res, arr[i]);
	return res;
}

static int Min(int arr[]) {
	int res = arr[0];
	for(int i=0;i<arr.length;i++)
	res=Math.min(res,arr[i]);
	return res;
}
 
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int arr[]= new int[5];
	System.out.println("Enter the elements of array:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
	 System.out.println("Minimum element of array: " + Min(arr));
	 System.out.println("Minimum element of array: " + Max(arr));
}
}
