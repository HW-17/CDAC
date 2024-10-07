import java.util.Scanner;

public class Palindrom {
 public static boolean isPalindrom(int i,int j,String str){
	 if(i>=j)
	 {
		 return true;
	 }
	 if(str.charAt(i) != str.charAt(j)) {
		 return false;
	 }
	 i=i+1;
	 j=j-1;
	 return isPalindrom(i,j,str);
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		boolean isPalindrome = isPalindrom(0,str.length()-1,str);
		System.out.println(isPalindrome);
		sc.close();
	}

}
