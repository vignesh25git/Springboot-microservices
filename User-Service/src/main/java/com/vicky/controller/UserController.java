package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.User;
import com.vicky.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserDetails(@PathVariable("userId") Long userId) {
		//ResponseEntity.ok().build()
		//return userService.getUser(userId);
		
		return new ResponseEntity<User>(userService.getUser(userId),HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		
		return new ResponseEntity<String>("User object saved successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<List<User>> getAllUser() {
		
		List <User> userList = userService.getAllUser();
		
		return new ResponseEntity <List<User>>(userList,HttpStatus.ACCEPTED);
		
	}

}
