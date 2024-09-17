import java.util.Scanner;

class BMITracker{
	private float weight;
	private float height;
	private float bmiCalculate;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the weight: ");
		this.weight=sc.nextFloat();
		System.out.println("Entre the height: ");
		this.height=sc.nextFloat();
		sc.close();
	}
	public void calculateBMI()
	{
		bmiCalculate=weight/(height*height);
		//System.out.println("bmiCalculate");
	}
	public void classifyBMI()
	{
		if(bmiCalculate<18.5)
		{
			System.out.println("Underweight");
		}
		else if(18.5<=bmiCalculate && bmiCalculate<24.9)
		{
			System.out.println("Normal Weight");
		}
		else if(25<=bmiCalculate && bmiCalculate<29.9)
		{
			System.out.println("Overweight");
		}
		else if(bmiCalculate>=30)
		{
			System.out.println("Obese");
		}
		else {
			System.out.println("Invalid input!");
		}
	}
	public void printRecord() {
		System.out.println("BMI is: "+bmiCalculate);
	}
}
public class WeightTracker {

	public static void main(String[] args) {
		BMITracker bmi = new BMITracker();
		bmi.acceptRecord();
		bmi.calculateBMI();
		bmi.classifyBMI();
		bmi.printRecord();

	}

}
