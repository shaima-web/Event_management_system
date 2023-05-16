package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Event;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


public interface LoginService{
		List<User> getAllUsers();

	
	User saveUser(User user);
	User getUserByEmailAndPassword(String email, String password);
	User user(String email, String password);

}
