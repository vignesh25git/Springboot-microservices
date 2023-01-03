package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.Cards;
import com.vicky.entity.Customer;
import com.vicky.service.CardsService;

@RestController
@RequestMapping("/myCards")
public class CardController {

	@Autowired
	private CardsService cardsService;
	
	@PostMapping("/get")
	public List<Cards> getCardsDetails(@RequestBody Customer customer) {
		
		return cardsService.getCardsDetails(customer);
		
	}
	
	@GetMapping("/get/{customerId}")
	public List<Cards> getCardsDetails(@PathVariable("customerId") Integer customerId) {
		
		return cardsService.getCardsDetails(customerId);
		
	}
}
