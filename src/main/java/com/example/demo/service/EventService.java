package com.example.demo.service;

import java.util.*;

import com.example.demo.model.Event;

public interface EventService {
	List<Event> getAllEvents();

	Event saveEvent(Event event);
	Event getEventById(Integer eventid);
	Event updateEvent(Event event);
	void deleteEventById(Integer eventid);

//	Object getById(Integer eventid);
}
