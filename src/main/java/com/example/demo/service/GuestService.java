package com.example.demo.service;

import java.util.*;

import com.example.demo.model.Event;
import com.example.demo.model.Guest;

public interface GuestService {
	List<Guest> getAllGuests();

	Guest saveGuest(Guest guest);
	Guest getGuestById(Integer guestid);
	Guest updateGuest(Guest guest);

}
