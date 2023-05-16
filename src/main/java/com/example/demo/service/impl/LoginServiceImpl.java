package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Event;
import com.example.demo.model.User;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	
	private UserRepository userRepository;

	public LoginServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return null;
	}


	@Override
	public User user(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
