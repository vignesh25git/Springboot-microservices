package com.vicky.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.Account;
import com.vicky.entity.Customer;
import com.vicky.exception.CustomerNotFoundException;
import com.vicky.repository.AccountRepository;
import com.vicky.repository.CustomerRepository;

@Service
public class AccountService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountRepository accountRepository;

	public Account getAccountDetails(Customer customer) {
		
		Optional<Customer> opt = customerRepository.findById(customer.getCustomerId());
		
		Customer existingCustomer;
		
		if (opt.isPresent()) {
			
			 existingCustomer = opt.get();
		} 
		else {
			
			throw new CustomerNotFoundException("Customer not found, please try a different customer id");
		}
		
		return accountRepository.findByCustomerId(existingCustomer.getCustomerId());
	}
	
	public Account getAccountDetails(Integer customerId) {
		
		Optional<Customer> opt = customerRepository.findById(customerId);
		
		Customer existingCustomer;
		
		if (opt.isPresent()) {
			
			 existingCustomer = opt.get();
		} 
		else {
			
			throw new CustomerNotFoundException("Customer not found, please try a different customer id");
		}
		
		return accountRepository.findByCustomerId(existingCustomer.getCustomerId());
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
