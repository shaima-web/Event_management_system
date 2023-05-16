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
@Table(name = "guests")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer guestid;
	@Email(message = "Please enter a valid e-mail address")
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 3, max = 50)
	private String guestname;
	
	
	
public Guest() {
		
	}

public Guest(String guestname, String email) {
	super();
	this.guestname = guestname;
	this.email = email;
}

public Integer getGuestid() {
	return guestid;
}

public void setGuestid(Integer guestid) {
	this.guestid = guestid;
}

public String getGuestname() {
	return guestname;
}

public void setGuestname(String guestname) {
	this.guestname = guestname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
