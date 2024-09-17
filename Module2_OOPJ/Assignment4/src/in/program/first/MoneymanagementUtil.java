package in.program.first;
import java.util.Scanner;
public class MoneymanagementUtil {
 static Scanner sc = new Scanner(System.in);
 LoanAmortizationCalculator l = new  LoanAmortizationCalculator();
 public void  acceptRecord() {
	 
	 System.out.println("Enter loanAmount: ");
	 l.setLoanAmount(sc.nextDouble());
	 
	 System.out.println("Enter annualInterestRate: ");
	 l.setAnnualInterestRate(sc.nextDouble());
	
	 System.out.println("Enter Loan Term (year): ");
	 l.setLoanTerm(sc.nextDouble());
 }
 
 public void printRecord()
 {
	 System.out.println("monthlyInterestRate is: "+l.getMonthlyInterestRate());
	 System.out.println("Number of Months is: "+l.getNumberOfMonths());
	 System.out.println("Monthly Payment : "+l.getMonthlyPayment());
	 System.out.println("loanAmount is: "+l.getLoanAmount() );
	 System.out.println("annualInterestRate: "+l.getAnnualInterestRate());
	 System.out.println("loan term : "+l.getLoanTerm());
	 }
 public static int menulist()
 {
	 System.out.println("0. Exit");
	 System.out.println("1. Accept Record");
	 System.out.println("2. Print Record");
	 return sc.nextInt();
 }
}
