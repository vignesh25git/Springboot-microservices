package com.vicky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.User;
import com.vicky.exception.UserNotFoundException;
import com.vicky.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		
		User user = userRepo.findById(userId)
				.orElseThrow(()->new UserNotFoundException("data illa"));
		
//		User user = userRepo.findByUserId(userId); - this is working too
		return user;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		userRepo.save(user);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	

}
