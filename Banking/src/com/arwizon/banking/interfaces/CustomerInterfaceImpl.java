package com.arwizon.banking.interfaces;

import com.arwizon.banking.model.Customer;

public class CustomerInterfaceImpl implements CustomerInterface {

	@Override
	public Customer createCustomer(String name,String address,String accountType) {
		
		Customer c = new Customer();
		c.setName(name);
		c.setAddress(address);
		c.setAccountType(accountType);
		c.setCustomerId(Customer.getCount());
		return c;
	
	}

	@Override
	public Customer[] display() {
		
		return null;
	}

	@Override
	public Customer search(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
