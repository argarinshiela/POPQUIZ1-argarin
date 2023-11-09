package com.it1311lpopquiz.uap.transactionsapi.repository;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.it1311lpopquiz.uap.transactionsapi.model.Customer;
import com.it1311lpopquiz.uap.transactionsapi.model.Items;


@Mapper
public interface TransactionsMybatisRepository {
	@Insert("INSERT INTO transactions(customer_name, customer_address) VALUES (#{customerName}, #{customerAddress})")
	public int insertCustomer(Customer customer);
	
	@Insert("INSERT INTO transaction_items(barcode, item_name, unit_price, quantity) VALUES (#{barcode}, #{itemName}, #{price}, #{quantity})")
	public int insertItem(List<Items> item);

}
