package com.vicky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	public Account findByCustomerId(int customerId);

}
