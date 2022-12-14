package com.vicky.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
   public User findByUserId(Long userId);

}
