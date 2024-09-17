package in.program.second;

import java.util.Scanner;
public class CInterestUtil {
static Scanner sc = new Scanner(System.in);
CompoundInterestCalculator c1 = new CompoundInterestCalculator();
public void acceptRecord()
{
	System.out.println("Enter Principle Amount: ");
	c1.setPrincipal(sc.nextFloat());
	
	System.out.println("Enter Annualinterest Rate: ");
	c1.setAnnualInterestRate(sc.nextFloat());
	
	System.out.println("Enter number of times the interest is compounded per year: ");
	c1.setNumberOfCompounds(sc.nextInt());
	
	System.out.println("Enter investment duration (in years): ");
	c1.setYears(sc.nextInt());
}

public void printRecord() {
	System.out.println("Future Value is: "+c1.getfutureValue());
	System.out.println("Total interest is: "+c1.gettotalInterest());
}


}
