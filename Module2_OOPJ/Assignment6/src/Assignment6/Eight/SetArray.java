package Assignment6.Eight;
import java.util.Scanner;
/*import java.util.Scanner;

public class SetArray {
 int[] a;
 public SetArray()
 {
	 this(5);
 }
 public SetArray(int n)
 {
	 this.a=new int[n];
 }
 public int getElement(int ind)
 {
	 if(ind>=0 && ind<a.length) {
		 return a[ind];
	 }else
	 {
		 throw new ArrayIndexOutOfBoundsException("Index"+ind+" is out of bound");
	 }
 }
 public void setElement(int ind,int v) {
	 if(ind>=0 && ind<a.length)
	 {
		 a[ind] =v;
	 }else {
		 throw new ArrayIndexOutOfBoundsException("Index" +ind+"is out of bounds");
	 }
 }
 private static Scanner sc = new Scanner(System.in);
 public void acceptElement()
 {
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println("enter" +i+ "index element");
		 int v=sc.nextInt();
		 setElement(i,v);
	 }
 }
 public void printElement()
 {
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(getElement(i)+"\n");
	 }
 }
 private static void closeScanner()
 {
	 sc.close();
 }
 public static int menuList(Scanner sc)
 {
	 System.out.println("Select a given option");
	 System.out.println("0.Exit");
	 System.out.println("1.Accept array elements");
	 System.out.println("2.print array element");
	 int choice=sc.nextInt();
	 return choice;
 }
}
*/


class SetArray{
int[] a;

public SetArray() {
this(5);	
}
public SetArray(int n) {
this.a=new int[n];
}
public int getElement(int ind) {
	if(ind>=0&&ind<a.length) {
		return a[ind];
	}else {
throw new ArrayIndexOutOfBoundsException("Index "+ind+" is out of bounds");
	}
	
	}
public void setElement(int ind,int v) {
if(ind>=0&&ind<a.length) {
 a[ind] = v;
    } else {
        throw new ArrayIndexOutOfBoundsException("Index " +ind+" is out of bounds");
    	}
	}

private static Scanner sc=new Scanner(System.in);
public void acceptElement(){
for(int i=0;i<a.length;i++){
System.out.print("enter "+i+" index element");
int v=sc.nextInt();
setElement(i,v);
}
}
public void printElement() {
for(int i=0;i<a.length;i++) {
	System.out.print(getElement(i)+" \n");
	}
}
private static void closeScanner() {
	sc.close();
}
public static int menuList(Scanner sc) {
System.out.println("Select a given option");
System.out.println("0.Exit");
System.out.println("1.Accept array elements");
System.out.println("2.Print array elements");
	int choice=sc.nextInt()	;
	return choice;
	
}
}
