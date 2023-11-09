package com.it1311lpopquiz.uap.transactionsapi.model;

import java.util.List;

public class TransactionRequest {
		private Customer customers;
	    public Customer getCustomers() {
			return customers;
		}
		public void setCustomers(Customer customers) {
			this.customers = customers;
		}
		public List<Items> getItems() {
			return items;
		}
		public void setItems(List<Items> items) {
			this.items = items;
		}
		private List<Items> items;

	    
}
