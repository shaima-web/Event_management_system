package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.GuestRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan({"com.example.demo"})
public class EventManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EventManagementSystemApplication.class, args);
	}

	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private GuestRepository guestRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

	}

}
