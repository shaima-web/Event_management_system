package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import com.example.demo.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;

	public EventServiceImpl(EventRepository eventRepository) {
		super();
		this.eventRepository = eventRepository;
	}

	@Override
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

	@Override
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event getEventById(Integer eventid) {
		return eventRepository.findById(eventid).get();
	}

	@Override
	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public void deleteEventById(Integer eventid) {
		eventRepository.deleteById(eventid);
	}

}
