package in.program.fifth;
import java.util.Scanner;
public class TollUtil {
static Scanner sc =new Scanner(System.in);
Toll t1 = new Toll(0, 0, 0, 0, 0, 0);

public void acceptRecord() {
    System.out.println("Enter car count:" +t1.getCarCount());
    System.out.println("Enter truck count:" +t1.getTruckCount());
    System.out.println("Enter motor cycle count: "+t1.getMotorcycleRate());
	
}

void printRecord() {
   
    System.out.printf("Total number of vehicles: %d\n",t1.totalVehicles());
    System.out.printf("Total revenue collected: ₹%.2f\n",t1.getCalculateRevenue());
}



}
