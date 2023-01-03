package com.vicky.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.Cards;
import com.vicky.entity.Customer;
import com.vicky.exception.CustomerNotFoundException;
import com.vicky.repository.CardsRepository;

@Service
public class CardsService {

	@Autowired
	private CardsRepository cardsRepository;

	public List<Cards> getCardsDetails(Customer customer) {

		// Optional<Cards> opt =
		// Optional.ofNullable(cardsRepository.findByCustomerId(customer.getCustomerId()))

		List<Cards> cardList = cardsRepository.findByCustomerId(customer.getCustomerId());

		Optional<List<Cards>> opt = Optional.of(cardList);

		if (opt.isEmpty()) {

			throw new CustomerNotFoundException("No cards found for this customer....");

		}
		
		return cardList;

	}
	
	public List<Cards> getCardsDetails(Integer customerId) {

		// Optional<Cards> opt =
		// Optional.ofNullable(cardsRepository.findByCustomerId(customer.getCustomerId()))

		List<Cards> cardList = cardsRepository.findByCustomerId(customerId);

		Optional<List<Cards>> opt = Optional.of(cardList);

		if (opt.isEmpty()) {

			throw new CustomerNotFoundException("No cards found for this customer....");

		}
		
		return cardList;

	}
}
