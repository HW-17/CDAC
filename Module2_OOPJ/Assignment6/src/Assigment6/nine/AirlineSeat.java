package Assigment6.nine;

import java.util.Scanner;

public class AirlineSeat {

	public static void main(String[] args) {
				Airline p1=new Airline();
			int choice;
			Scanner sc=new Scanner(System.in);
			while((choice=Airline.menuList(sc))!=0) {
			switch(choice){
			case 1:
				p1.bookCancelSeat();break;
			case 2:
				p1.showSeatBooking();break;
			default:System.out.println("Exiting menu list");break;
			}
			}
			System.out.println("Thank you");

				}
	}


