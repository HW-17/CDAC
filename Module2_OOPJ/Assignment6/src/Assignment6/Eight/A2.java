package Assignment6.Eight;

import java.util.Scanner;
public class A2 {
public static void main(String[] args) {
	SetArray a1=new SetArray();
Scanner sc=new Scanner(System.in);
	int choice;	
while((choice=SetArray.menuList(sc))!=0) {
switch(choice) {
case 1:
	a1.acceptElement();break;
case 2:
	a1.printElement();break;
default:System.out.println("Exiting menu list");break;
			}	
		}
System.out.println("Thank you");
	}
}

