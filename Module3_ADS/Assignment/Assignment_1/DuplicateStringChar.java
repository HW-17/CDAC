import java.util.*;
public class DuplicateStringChar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char[] ch =str.toCharArray();
		System.out.println(" Repeating Charecters are: ");
		for(int i =0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.print(ch[j]+",");
					break;
				}
			}
		}
		
		sc.close();

	}

}
