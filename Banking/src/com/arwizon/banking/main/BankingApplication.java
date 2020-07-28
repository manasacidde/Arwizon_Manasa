package com.arwizon.banking.main;

import java.util.Scanner;

import com.arwizon.banking.interfaces.CustomerInterface;
import com.arwizon.banking.interfaces.CustomerInterfaceImpl;
import com.arwizon.banking.model.Customer;

public class BankingApplication {


	public static void main(String[] args) {

		System.out.println("Press 1 to add new customer" 
				+"\nPress 2 to display customer details"
				+"\nPress 3 to update customer details"
				+"\nPress 4 to search for customer details"
				+"\nPress 5 to exit");

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size");
		int s = scn.nextInt();
		Customer[] cust = new Customer[s];
		while(true) {

			System.out.println("Enter your option");
			int ch = scn.nextInt();


			switch(ch) {
			case 1:
			
					System.out.println("Enter name");
					String name = scn.next();
					System.out.println("Enter address");
					String  address = scn.next();
					System.out.println("Enter Account type");
					String  accountType = scn.next();
					CustomerInterface  c = new CustomerInterfaceImpl();
					Customer c1 = c.createCustomer(name,address,accountType);
					
					for(int i=0;i<cust.length;i++) {
						if(cust[i]==null) {
							cust[i]=c1;
							break;
						}
					}

				
				break;

			case 2:
				
					for(Customer cst:cust) {
						if(cst!=null)
						System.out.println(cst);
						break;
						
					}
					break;
				

				

			case 3:
				if(cust[0]!=null) {
					System.out.println("please enter customer name");
					String name1=scn.next();
					boolean flag=false;
					for(int i=0;i<cust.length;i++) {
						if(name1.equals(cust[i].getName())) {
							System.out.println("Customer details found");
							System.out.println(cust[i]);
							flag=true;
						}
					}
					if(flag==false) {
						System.out.println("No customer with that name");
					}

				}
				break;


			case 4:System.exit(1);
			break;
			
			default:
				System.out.println("Invalid option");
			}
		}

	}

}
