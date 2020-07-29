package com.arwizon.service;

import com.arwizon.model.Product;

public interface AdminInterface {
	
	public Product addProduct(String name,String description,int price,String manufacturerName,int discount,String imgUrl,int noOfUnits,String category);
	
	public Product[] search(String name,Product[] arr);

}
