package com.arwizon.main;

import java.util.Scanner;
import com.arwizon.model.Product;
import com.arwizon.service.AdminInterface;
import com.arwizon.service.AdminInterfaceImpl;

public class TestAmazon {
	
	public static void main(String[] args) {
		
		System.out.println("Press 1 to add product" 
				+"\nPress 2 to display product details"
				+"\nPress 3 to search product details"
				+"\nPress 4 to update for product details"
				+"\nPress 5 to delete the product");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size");
		int s = scn.nextInt();
		Product[] arr =new Product[s] ;
		while(true) {
			System.out.println("Please choose  your option");
			int ch = scn.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter name");
				String name = scn.next();
				System.out.println("Enter description");
				String description = scn.next();
				System.out.println("Enter price");
				int price = Integer.parseInt(scn.next());
				System.out.println("Enter Manufacturer name");
				String  manufacturerName = scn.next();
				System.out.println("Enter discount");
				int discount = Integer.parseInt(scn.next());
				System.out.println("Enter Image Url");
				String imgUrl = scn.next();
				System.out.println("Enter no of Units");
				int noOfUnits = Integer.parseInt(scn.next());
				System.out.println("Enter category");
				String category = scn.next();
				AdminInterface  a = new AdminInterfaceImpl();
				Product p = a.addProduct(name,description,price,manufacturerName,discount,imgUrl,noOfUnits,category);
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==null) {
						arr[i]=p;
						break;
					}
				}

			break;
			case 2:
				
				for(Product pro:arr) {
					if(pro!=null)
			
						System.out.println(pro);
					
					
				}
				break;
				
			case 3:
				
					System.out.println("please enter product name");
					String name1=scn.next();
					AdminInterface ad = new AdminInterfaceImpl();
					Product[] product = ad.search(name1,arr);
					if(product[0]==null) {
						System.out.println("product not found");
					}
					else {
						for(Product pro:product) {
							if(pro==null) {
								break;
							}else {
								System.out.println(pro);
							}
						}
					}

				
				break;


			
			
			default:
				System.out.println("Invalid option");
			
			
			
			}
			}
			
			
		}
	
	

}
