package com.vicky.service;

import java.util.List;

import com.vicky.entity.User;

public interface UserService {
	
	public User getUser(Long userId);
	public User saveUser(User user);
	public List<User> getAllUser();
	
}
