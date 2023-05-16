package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {

	
	@Id
	@Email(message = "Please enter a valid e-mail address")
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 8, max = 50)
	private String password;
	
	
	public User() {
	}

	public User(@Email(message = "Please enter a valid e-mail address") @NotBlank String email,
			@NotBlank @Size(min = 8, max = 50) String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
