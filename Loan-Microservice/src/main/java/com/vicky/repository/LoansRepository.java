package com.vicky.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.Loans;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Integer> {
	
	public List<Loans> findByCustomerId(int customerId);

}
