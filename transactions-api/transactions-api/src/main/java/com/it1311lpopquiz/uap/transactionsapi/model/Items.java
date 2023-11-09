package com.it1311lpopquiz.uap.transactionsapi.model;

public class Items {
	int barcode;
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getItem_name() {
		return itemName;
	}
	public void setItem_name(String item_name) {
		this.itemName = item_name;
	}
	public int getUnit_price() {
		return unitPrice;
	}
	public void setUnit_price(int unit_price) {
		this.unitPrice = unit_price;
	}
	public int getQuantity_purchased() {
		return quantityPurchased;
	}
	public void setQuantity_purchased(int quantity_purchased) {
		this.quantityPurchased = quantity_purchased;
	}
	String itemName;
	int unitPrice;
	int quantityPurchased;
	
	
	
	
}
