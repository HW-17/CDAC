package in.program.four;

public class DiscountCalculater {
	 float originalPrice;
	 float discountRate;
     float discountAmount;
     float finalPrice;
public DiscountCalculater()
{
	//this(0.0,0.0,0.0,0.0);
}
	public DiscountCalculater(float originalPrice, float discountRate, float discountAmount, float finalPrice) {
		super();
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
		this.discountAmount = discountAmount;
		this.finalPrice = finalPrice;
	}
	float discountAmount() {
		discountAmount =originalPrice*(discountRate/100);
		return discountAmount;
		
	}
	float finalPrice()
	{
		finalPrice=  originalPrice - discountAmount;
		return finalPrice;
	}
	
public float getOriginalPrice() {
	return originalPrice;
}


public void setOriginalPrice(float originalPrice) {
	this.originalPrice = originalPrice;
}


public float getDiscountRate() {
	return discountRate;
}


public void setDiscountRate(float discountRate) {
	this.discountRate = discountRate;
}


public float getDiscountAmount() {
	return discountAmount();
}


public void setDiscountAmount(float discountAmount) {
	this.discountAmount = discountAmount;
}


public float getFinalPrice() {
	return finalPrice();
}


public void setFinalPrice(float finalPrice) {
	this.finalPrice = finalPrice;
}



}
	