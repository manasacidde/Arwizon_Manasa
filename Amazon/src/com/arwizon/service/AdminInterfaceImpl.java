package com.arwizon.service;

import com.arwizon.model.Product;

public class AdminInterfaceImpl implements AdminInterface{

	@Override
	public Product addProduct(String name, String description, int price, String manufacturerName, int discount,
			String imgUrl, int noOfUnits, String category) {
		Product p = new Product();
		p.setName(name);
		p.setDescription(description);
		p.setPrice(price);
		p.setManufacturerName(manufacturerName);
		p.setDiscount(discount);
		p.setImgUrl(imgUrl);
		p.setNoOfUnits(noOfUnits);
		p.setCategory(category);
		p.setProductId(Product.getCount());
		return p;
	}

	@Override
	public Product[] search(String name,Product[] arr) {
		Product[] arr1 = new Product[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(name.equals(arr[i].getName())) {
				arr1[j]=arr[i];
				j++;
			}
		}
 		return arr1;
	}

}
