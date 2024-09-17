package in.program.second;

public class CompoundInterestCalculator {
	 float principal;
	 float annualInterestRate;
	 int numberOfCompounds;
	 int years;
	 float futureValue;
     float totalInterest;
   public  CompoundInterestCalculator ()
   {
	  
	}
     
	public CompoundInterestCalculator(float principal, float annualInterestRate, int numberOfCompounds, int years) {
		//super();
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}
	public float futureValue() 
	{
		futureValue =(float)(principal*Math.pow(1+(annualInterestRate/numberOfCompounds), numberOfCompounds*years));
		return futureValue;
		
	}
public float totalInterest()
{
	totalInterest= (float)(futureValue - principal);
	return totalInterest;
	
}
	public float getPrincipal() {
		return principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public float getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}
	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public float getfutureValue()
	{
		return futureValue();
	}
	public void setfutureValue()
	{
		this.futureValue= futureValue;
	}
	public float gettotalInterest()
	{
		return totalInterest();
	}
	public void settotalInterest()
	{
		this.totalInterest= totalInterest;
	}
  /*	public float getcalculateFutureValue() {
		return calculateFutureValue();
	}
	public void setcalculateFutureValue(float futureValue) {
		this.calculateFutureValue= calculateFutureValue;
	}
	*/
     

}
