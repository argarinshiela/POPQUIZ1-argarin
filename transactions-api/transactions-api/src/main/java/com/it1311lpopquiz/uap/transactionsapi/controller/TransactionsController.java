package com.it1311lpopquiz.uap.transactionsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it1311lpopquiz.uap.transactionsapi.model.Customer;
import com.it1311lpopquiz.uap.transactionsapi.model.Items;
import com.it1311lpopquiz.uap.transactionsapi.model.TransactionResponse;
import com.it1311lpopquiz.uap.transactionsapi.repository.TransactionsMybatisRepository;



@RestController
public class TransactionsController {
	
	@Autowired
	TransactionsMybatisRepository transactionRepo;
	
	@PostMapping("/event/insert")
	public TransactionResponse insert(@RequestBody Customer customer, @RequestBody List<Items> item) {
		int total = 0;
		transactionRepo.insertCustomer(customer);
		transactionRepo.insertItem(item);
		
		for(Items list: item) {
			total =+ list.getUnit_price() * list.getQuantity_purchased();
		}
		
		TransactionResponse response = new TransactionResponse();
		
		response.setTotalPrice(total);
		response.setTransactionId(0);
		return response;
	}

	
}
