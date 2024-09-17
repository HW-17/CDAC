
public class Toll {

    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    public Toll() {
        this.carRate = 50.00;
        this.truckRate = 100.00;
        this.motorcycleRate = 30.00;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

    public void setTollRates(double carRate, double truckRate, double motorcycleRate) {
        this.carRate = carRate;
        this.truckRate = truckRate;
        this.motorcycleRate = motorcycleRate;
    }
    public void acceptRecord(int carCount, int truckCount, int motorcycleCount) {
        this.carCount += carCount;
        this.truckCount += truckCount;
        this.motorcycleCount += motorcycleCount;
    }

    public double calculateRevenue() {
        return (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        double totalRevenue = calculateRevenue();
        System.out.printf("Total number of vehicles: %d\n", totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f\n", totalRevenue);
    }

  

    public static void main(String[] args) {
        Toll tollBooth = new Toll();

        tollBooth.setTollRates(55.00, 130.00, 40.00);

        tollBooth.acceptRecord(10, 5, 8);  
        tollBooth.printRecord();
        tollBooth.acceptRecord(7, 3, 4);
        tollBooth.printRecord();
    }

}