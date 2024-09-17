package in.program.four;
import java.util.Scanner;
public class DiscountUtil {
static Scanner sc= new Scanner(System.in);
DiscountCalculater d = new DiscountCalculater();

public void acceptRecord() {
	
	System.out.println("Enter the price of item: ");
	d.setOriginalPrice(sc.nextFloat());
	System.out.println("Enter the discount rate: ");
	d.setDiscountRate(sc.nextFloat());
	}
public void printRecord()
{
	System.out.println("Discount Amount is: "+ d.getDiscountAmount());
	System.out.println("final price is: "+d. getFinalPrice());

}

}
