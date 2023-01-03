package com.vicky.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {
	
	public List<Cards> findByCustomerId(int customerId);

}
