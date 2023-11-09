package com.it1311lpopquiz.uap.transactionsapi.model;

import java.util.List;

public class Customer {
	public String customerName;
	private List<Items> items;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerNname(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String customerAddress;
	
	public List<Items> getItems() {
        return items;
    }
    public void setItems(List<Items> items) {
        this.items = items;
    }
}
