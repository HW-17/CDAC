package Assigment6.nine;
import java.util.*;
public class Airline {
	private boolean[][] a;
	public Airline(){
	this(6,3);
	}
	public Airline(int m,int n) {
		this.a=new boolean[m][n];
	}
	public boolean getSeat(int ind1,int ind2) {
		if(ind1>=0&&ind2>=0&&ind2<a[ind1].length&&ind1<a.length) {return a[ind1][ind2] ;}
	throw new ArrayIndexOutOfBoundsException("indices are out of bounds");
	}
	public void setSeat(int ind1,int ind2,boolean v){
		if(ind1>=0&&ind2>=0&&ind2<a[ind1].length&&ind1<a.length) {a[ind1][ind2]=v;}
		else {throw new ArrayIndexOutOfBoundsException("indices are out of bounds");}
	}
	private static Scanner sc=new Scanner(System.in);
	public void bookCancelSeat(){
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++){
			System.out.println("Enter the seat booking/cancellation for row "+i+" column "+j);
			boolean v=sc.nextBoolean();
			setSeat(i, j, v);
		}
	}
	}
	public void showSeatBooking(){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(getSeat(i,j)+" ");
			}
			System.out.println();
		}
	}
	public static int menuList(Scanner sc) {
	System.out.println("Select a given option");
	System.out.println("0.Exit");
	System.out.println("1.Accept seat bookings and cancellations");
	System.out.println("2.Print seating arrangements");
		int choice=sc.nextInt()	;
		return choice;
		}
	//false indicates seat is not booked,true indicates seat is booked
	public static void closeScanner() {
		sc.close();
	}
	}
	