package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Guest;
import com.example.demo.repository.GuestRepository;
import com.example.demo.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {

	private GuestRepository guestRepository;

	public GuestServiceImpl(GuestRepository guestRepository) {
		super();
		this.guestRepository = guestRepository;
	}

	@Override
	public List<Guest> getAllGuests() {
		return guestRepository.findAll();
	}

	@Override
	public Guest saveGuest(Guest guest) {
		return guestRepository.save(guest);
	}

	@Override
	public Guest getGuestById(Integer guestid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guest updateGuest(Guest guest) {
		// TODO Auto-generated method stub
		return null;
	}

}
