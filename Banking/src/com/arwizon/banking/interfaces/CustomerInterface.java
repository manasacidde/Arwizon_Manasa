package com.arwizon.banking.interfaces;

import com.arwizon.banking.model.Customer;

public interface CustomerInterface {
	
	public Customer createCustomer(String name,String address,String accountType);
	public Customer[] display();
	public Customer search(String name);

}
