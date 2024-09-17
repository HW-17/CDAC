package Assignment6.sixth;
public class Range {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,6,7,8,9,10,11};
	int sum=0;
	int m=a.length;
	int n=a.length+1;
	int sumn=n*(n+1)/2;
	for(int i=0;i<m;i++)
	{
		sum+=a[i];
	}
	System.out.println("Missing num is: "+(sumn-sum));

	}

}
