import java.util.Scanner;
public class RevWordString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		String[] words= str.split(" ");
		String revString = " ";
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String revWord= "";
			
			for(int j =word.length()-1;j>=0;j--)
			{
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord+ " ";
		}
		System.out.println(revString);
		
     sc.close();
	}

}
