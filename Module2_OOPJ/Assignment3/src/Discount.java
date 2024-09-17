import java.util.Scanner;

class DiscountCalculator{
	private float originalPrice;
	private float discountRate;
	private float discountAmount;
	private float finalPrice;
	
	public void acceptRecord() {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the price of item: ");
	this.originalPrice=sc.nextFloat();
	System.out.println("Enter the discount rate: ");
	this.discountRate=sc.nextFloat();
	sc.close();
	}
	
	public void calculateDiscount() {
		discountAmount =originalPrice*(discountRate/100);
		finalPrice=originalPrice-discountAmount;
	}
	
	public void printRecord()
	{
		System.out.println("Discount Amount is: "+discountAmount);
		System.out.println("final price is: "+finalPrice);
	}
}
public class Discount {

	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
	}
}
