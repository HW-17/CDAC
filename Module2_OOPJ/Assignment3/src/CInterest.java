import java.util.Scanner;

class CompoundInterestCalculator{
	private float principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private float futureValue;
	private float totalInterest;
	
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		this.principal=sc.nextFloat();
		System.out.println("Enter Annualinterest Rate: ");
		this.annualInterestRate=sc.nextFloat();
		System.out.println("Enter number of times the interest is compounded per year : ");
		this.numberOfCompounds=sc.nextInt();
		System.out.println("Enter investment duration (in years): ");
		this.years=sc.nextInt();
        
	}
	
	public void calculateFutureValue()
	{
		futureValue =(float)(principal*Math.pow(1+(annualInterestRate/numberOfCompounds), numberOfCompounds*years));
	System.out.println("Future Value is: "+futureValue);
	}
	public void printRecoord() {
		totalInterest=futureValue-principal;
		System.out.println("total interest is: "+totalInterest);
	}
}
public class CInterest 
{
	public static void main(String[] args)
	{
	CompoundInterestCalculator c =new CompoundInterestCalculator();
	c.acceptRecord();
	c.calculateFutureValue();
	c.printRecoord();
	}
}
