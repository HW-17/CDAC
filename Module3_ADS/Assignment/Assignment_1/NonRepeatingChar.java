import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a string: ");
	String ch=s.next();
	boolean flag =true;
	for(char i:ch.toCharArray())
	{
		if(ch.indexOf(i)==ch.lastIndexOf(i))
		{
			System.out.println("First Non repeating charecter: "+i);
			flag = false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("null");
	}

	}

}
