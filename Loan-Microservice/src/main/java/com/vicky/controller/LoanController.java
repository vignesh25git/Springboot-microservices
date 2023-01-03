package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.Loans;
import com.vicky.entity.Customer;
import com.vicky.service.LoansService;

@RestController
@RequestMapping("/myLoans")
public class LoanController {

	@Autowired
	private LoansService cardsService;
	
	@PostMapping("/get")
	public List<Loans> getCardsDetails(@RequestBody Customer customer) {
		
		return cardsService.getCardsDetails(customer);
		
		
	}
}
