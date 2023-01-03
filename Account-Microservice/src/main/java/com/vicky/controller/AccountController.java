package com.vicky.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.config.AccountsConfiguration;
import com.vicky.dto.Card;
import com.vicky.dto.CustDetails;
import com.vicky.entity.Account;
import com.vicky.entity.Customer;
import com.vicky.feignclient.CardFeignClient;
import com.vicky.service.AccountService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/myAccount")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountsConfiguration accountsConfiguration;
	
	@Autowired
	private CardFeignClient cardFeignClient;
	
	@PostMapping("/get")
	@Operation(summary = "Responsible for getting the Account information")
	public Account getAccountDetails(@RequestBody Customer customer) {
		
		return accountService.getAccountDetails(customer);
		
		
	}
	
	@PostMapping("/addcust")
	@Operation(summary = "Responsible for added the Customer information")
	public Customer addCustomer(@RequestBody @Valid  Customer customer) {
		
		return accountService.addCustomer(customer);
		
		
	}
	
	// call to another micro service 
	@GetMapping("/mycust/{customerId}")
	public CustDetails fetchMyCustomerDetails(@PathVariable("customerId") Integer customerId) {
		
		var account = accountService.getAccountDetails(customerId);
		List <Card> cardlist = cardFeignClient.getCardsDetails(account.getCustomerId());
		CustDetails custDetails = new CustDetails();
		custDetails.setAccount(account);
		custDetails.setCardList(cardlist);
		
		return custDetails;
				
	}
	
	@GetMapping("/city")
	public String getCity() {
		return accountsConfiguration.getCity();
	}
}
