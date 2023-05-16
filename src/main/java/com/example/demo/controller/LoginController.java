package com.example.demo.controller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Event;
import com.example.demo.model.User;
import com.example.demo.service.LoginService;

@Controller
public class LoginController {

	private LoginService loginService;

	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
	}
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signup";
	}
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User user) {
		loginService.saveUser(user);
		return "redirect:/";
		
	}
	
	@GetMapping("/users")
	public String listUsers(Model model ) {
		model.addAttribute("users", loginService.getAllUsers());
		return "users";
	}
	
//	@PostMapping("/login")
//		public String login(@ModelAttribute("user") User user) {
//		User oauthUser = loginService.user(user.getEmail(), user.getPassword());
//		
//		System.out.print(oauthUser);
//		if(Objects.nonNull(oauthUser)) {
//			return "redirect:/";
//		}else {
//			return "redirect:/home";
//		}
//	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET)
    public String getIndex(@ModelAttribute("user") User user){
        return "Login";
    }
}
