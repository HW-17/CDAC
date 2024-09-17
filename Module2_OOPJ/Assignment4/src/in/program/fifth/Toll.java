package in.program.fifth;

public class Toll {
	double carRate;
     double truckRate;
     double motorcycleRate;
    int carCount;
    int truckCount;
    int motorcycleCount;
    double calculateRevenue;
    double  totalRevenue;
	
    
    public Toll(double careRate ,double truckRate,double motorcycleRate,  int carCount, int truckCount,int motorcycleCount) {
        this.carRate = 50.00;
        this.truckRate = 100.00;
        this.motorcycleRate = 30.00;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

    public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getCarCount() {
		return carCount;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public int getTruckCount() {
		return truckCount;
	}

	public void setTruckCount(int truckCount) {
		this.truckCount = truckCount;
	}

	public int getMotorcycleCount() {
		return motorcycleCount;
	}

	public void setMotorcycleCount(int motorcycleCount) {
		this.motorcycleCount = motorcycleCount;
	}
	public double getCalculateRevenue() {
		return calculateRevenue();
	}
	
	public void setCalculateRevenue(double calculateRevenue) {
		this.calculateRevenue=calculateRevenue;
	}
    public int gettotalVehicles()
    {
    	return totalVehicles();
    }
   
	
    public void setTollRates(double carRate, double truckRate, double motorcycleRate) {
        this.carRate = carRate;
        this.truckRate = truckRate;
        this.motorcycleRate = motorcycleRate;
    }

    public double calculateRevenue() {
    	calculateRevenue = (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    	return calculateRevenue;
    }

 public int totalVehicles()
 {
	 int totalVehicles =carCount + truckCount + motorcycleCount;
	 return  totalVehicles;
	 
 }
 public double  totalRevenue()
{
	 totalRevenue = getCalculateRevenue();
	 return totalRevenue;
}
}
 

