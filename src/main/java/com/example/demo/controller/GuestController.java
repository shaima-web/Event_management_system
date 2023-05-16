package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Guest;
import com.example.demo.service.GuestService;


@Controller
public class GuestController {
	
	private GuestService guestService;

	public GuestController(GuestService guestService) {
		super();
		this.guestService = guestService;
	}
	
	
	//handler method to handle list guests and return model and view
	@GetMapping("/guests")
	public String listGuests(Model model ) {
		model.addAttribute("guests", guestService.getAllGuests());
		return "guests";
	}
	
	@GetMapping("/guests/new")
	public String createGuestForm(Model model) {
		Guest guest = new Guest();
		model.addAttribute("guest", guest);
		return "add";
	}
	
	@PostMapping("/guests")
	public String saveGuest(@ModelAttribute("guest") Guest guest) {
		guestService.saveGuest(guest);
		return "redirect:/guests";
		
	}

}
