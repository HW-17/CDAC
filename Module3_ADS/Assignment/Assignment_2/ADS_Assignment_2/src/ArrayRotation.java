import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
	public static int[] rotate(int[] nums,int d)
	{
		int n=nums.length;
		 d=d%n;
		reverse(nums,0,n-1);
		reverse(nums,0,d-1);
		reverse(nums,d,n-1);
		return nums;
	}
	public static void reverse(int[] nums,int start , int end)
	{
		while(start <= end)
		{
			
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(nums));
		Scanner sc =new Scanner(System.in);
		System.out.print("d = ");
		int d = sc.nextInt();
		
		System.out.println(Arrays.toString(rotate(nums,d)));
	sc.close();
	}

}
