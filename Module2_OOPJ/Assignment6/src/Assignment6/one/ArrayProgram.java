package Assignment6.one;
import java.util.Scanner ;
public class ArrayProgram {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
 int [] a=new int[5];
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i] );
 }
 for(int i=0;i<a.length;i++ )
 {
	 if(i==1)
		 System.out.println("Enter "+i+"st value: ");
	 else if(i==2)
		 System.out.println("Enter "+i+"nd value: ");
	 else if(i==3)
		 System.out.println("Enter "+i+"rd value: ");
	 else 
		 System.out.println("Enter "+i+"th value: ");
	 a[i]=sc.nextInt();
	 
 }
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]+" ");
 }
 sc.close();
	}

}
