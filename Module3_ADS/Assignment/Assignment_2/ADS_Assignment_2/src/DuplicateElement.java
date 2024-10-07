import java.util.Arrays;
import java.util.Scanner;
public class DuplicateElement {
	public static int RemoveDuplicate(int[] array) {
		if(array.length == 0)
		{
			return 0;
		}
		Arrays.sort(array);
		int j=0;
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i] != array[j])
			{
				j++;
				array[j]=array[i];
			
			}
		}
	 
		return j+1;
		
	}
	
public static void main(String[] args)
{   
	Scanner sc = new Scanner(System.in);
int k=0;

System.out.println("Enter the number of elements: ");
int n =sc.nextInt();
int []array = new int[n];
System.out.println("Enter the elements: ");
for(k=0;k<n;k++)
{
	array[k]=sc.nextInt();
}
System.out.print("[");
for(k=0;k<n;k++)
{
System.out.print(array[k]+" ," );

}
System.out.println("]");
	int c = RemoveDuplicate(array);
	int d=0;
	for(d=0;d<c;d++)
	{
		int h= array[d];
	System.out.print(array[d]+" ");
	}

	sc.close();
}
}