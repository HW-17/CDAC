import java.util.Scanner;

class LoanAmortizationCalculator{
	
	private float loanAmount;
	private float annualInterestRate;
	private int loanTerm;
	private float monthlyPayment;
	private float monthlyInterestRate;
	private int numberOfMonths;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter loanAmount: ");
		this.loanAmount=sc.nextFloat();
		System.out.println("Enter annualInterestRate: ");
		this.annualInterestRate=sc.nextFloat();
		System.out.println("Enter Loan Term (year): ");
		this.loanTerm = sc.nextInt();
		sc.close();
	}
	
	public void calculateMonthlyPayment()
	{
		monthlyInterestRate= annualInterestRate/12/100;
		System.out.println("monthlyInterestRate is: "+monthlyInterestRate);
		numberOfMonths = loanTerm * 12 ;
		System.out.println(" Number of months is: "+numberOfMonths);
		monthlyPayment = (float)(loanAmount * (monthlyInterestRate * Math.pow((1+monthlyInterestRate),numberOfMonths))/(Math.pow((1+monthlyInterestRate),numberOfMonths)-1));
		System.out.println("monthly payment is: "+monthlyPayment);
	}
	public void printRecord()
	{
			System.out.println("loanAmount is: "+loanAmount);
			System.out.println("annualInterestRate: "+annualInterestRate);
			System.out.println("loan term : "+loanTerm);
	}
}
public class Moneymanagement {

	public static void main(String[] args) {
		LoanAmortizationCalculator l1 = new LoanAmortizationCalculator();
		l1.acceptRecord();
		l1.calculateMonthlyPayment();
		l1.printRecord();
	}

}
