package com.vicky.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.Loans;
import com.vicky.entity.Customer;
import com.vicky.exception.CustomerNotFoundException;
import com.vicky.repository.LoansRepository;

@Service
public class LoansService {

	@Autowired
	private LoansRepository cardsRepository;

	public List<Loans> getCardsDetails(Customer customer) {

		// Optional<Cards> opt =
		// Optional.ofNullable(cardsRepository.findByCustomerId(customer.getCustomerId()))

		List<Loans> cardList = cardsRepository.findByCustomerId(customer.getCustomerId());

		Optional<List<Loans>> opt = Optional.of(cardList);

		if (opt.isEmpty()) {

			throw new CustomerNotFoundException("No cards found for this customer....");

		}
		
		return cardList;

	}
}
