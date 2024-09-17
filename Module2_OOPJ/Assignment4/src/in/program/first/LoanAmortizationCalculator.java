package in.program.first;

public class LoanAmortizationCalculator {
		 double loanAmount;
		 double annualInterestRate;
		 double loanTerm;
		 double monthlyPayment;
		 double monthlyInterestRate;
		 double numberOfMonths;
		 
		 public LoanAmortizationCalculator ()
		 {
			 this(0.0,0.0,0.0);
		 }
		 public LoanAmortizationCalculator(double loanAmount,double annualInterestRate,double loanTerm  )
		 {
			 loanAmount = loanAmount;
			 annualInterestRate = annualInterestRate;
			 loanTerm = loanTerm;
		 }
		 
		 double monthlyInterestRate ()
		 {
			 return monthlyInterestRate= annualInterestRate/12/100;
		 }
		 
		 double numberOfMonths () {
			 return numberOfMonths = loanTerm * 12 ;
		 }
		 double MonthlyPayment()
		 {
		
		 monthlyPayment = (float)(loanAmount * (monthlyInterestRate * 
		 Math.pow((1+monthlyInterestRate),numberOfMonths))/(Math.pow((1+monthlyInterestRate
		 ),numberOfMonths)-1));
		 return monthlyPayment;
		
		 }

		public double getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		public double getLoanTerm() {
			return loanTerm;
		}
		public void setLoanTerm(double loanTerm) {
			this.loanTerm = loanTerm;
		}
		public double getMonthlyPayment() {
			return MonthlyPayment();
		}
		public void setMonthlyPayment(double monthlyPayment) {
			this.monthlyPayment = monthlyPayment;
		}
		public double getMonthlyInterestRate() {
			return monthlyInterestRate ();
		}
		public void setMonthlyInterestRate(double monthlyInterestRate) {
			this.monthlyInterestRate = monthlyInterestRate;
		}
		public double getNumberOfMonths() {
			return numberOfMonths();
		}
		public void setNumberOfMonths(double numberOfMonths) {
			this.numberOfMonths = numberOfMonths;
		}
	
		

	}


