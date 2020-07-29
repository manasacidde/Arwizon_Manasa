package com.arwizon.banking.model;

public class Customer {


	private static int count;
	private String name;
	private  int customerId;
	private  String address;
	private  String accountType;
	static {
		count=101;
	}

	public Customer() {
		count++;
	}


	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", address=" + address + ", accountType="
				+ accountType + "]";
	}

}
