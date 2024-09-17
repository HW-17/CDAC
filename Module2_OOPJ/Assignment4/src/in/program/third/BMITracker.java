package in.program.third;

public class BMITracker {
	 float weight;
	 float height;
     float bmiCalculate;
     float CalculateBMI;
  
	
	public  BMITracker()
	{
		this(0.0f,0.0f,0.0f);
	}
	
	public BMITracker(float weight, float height, float bmiCalculate) {
		super();
		this.weight = weight;
		this.height = height;
		this.bmiCalculate = bmiCalculate;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBmiCalculate() {
		return bmiCalculate();
	}
	public void setBmiCalculate(float bmiCalculate) {
		this.bmiCalculate = bmiCalculate;
	}
	 float bmiCalculate()
	{
		bmiCalculate=getWeight()/(getHeight()*getHeight());
		return bmiCalculate;
		
	}
	String classifyBMI() {
	
		if(  bmiCalculate< 18.5)
		{
			return "Underweight";
		}
		else if(18.5<= bmiCalculate &&  bmiCalculate<24.9)
		{
			return "Normal Weight";
		}
		else if(25<= bmiCalculate &&  bmiCalculate<29.9)
		{
			return "Overweight";
		}
		else if( bmiCalculate>=30)
		{
			return "Obese";
		}
		else {
			System.out.println("Invalid input!");
		}
		
	return classifyBMI();

	}
	
	

}
