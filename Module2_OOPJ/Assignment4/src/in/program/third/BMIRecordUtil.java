package in.program.third;

import java.util.Scanner;

public class BMIRecordUtil {
	 static Scanner sc = new Scanner(System.in);
	 BMITracker b = new BMITracker();
	 public void acceptRecord()
	 {
		 System.out.println("Entre the weight: ");
		 b.setWeight(sc.nextFloat());
		 System.out.println("Entre the height: ");
		 b.setHeight(sc.nextFloat());
		 sc.close();
	 }
	 public void printRecord()
{
		 System.out.println("BMI is : "+b.getBmiCalculate()); 
}
	 
}
