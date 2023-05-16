package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import com.example.demo.service.EventService;

@Controller
public class EventController {

	private EventService eventService;

	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	
	//handler method to handle list events and return model and view
	@GetMapping("/events")
	public String listEvents(Model model ) {
		model.addAttribute("events", eventService.getAllEvents());
		return "events";
	}
	
	@GetMapping("/events/new")
	public String createEventForm(Model model) {
		Event event = new Event();
		model.addAttribute("event", event);
		return "create";
	}
	
	@PostMapping("/events")
	public String saveEvent(@ModelAttribute("event") Event event) {
		eventService.saveEvent(event);
		return "redirect:/events";
		
	}
	
	@GetMapping("/events/edit/{eventid}")
	public String editEventForm(@PathVariable Integer eventid, Model model) {
		model.addAttribute("event",eventService.getEventById(eventid));
		return "edit_ev";
	}
	
	@GetMapping("/events/delete/{eventid}")
	public String deleteEvent(@PathVariable Integer eventid) {
		eventService.deleteEventById(eventid);
		return "redirect:/events";
	}

	
	@PostMapping("/events/{eventid}")
	public String updateEvent(@PathVariable("eventid") Integer eventid, 
			@ModelAttribute("event") Event event, Model model) {
		Event existingEvent = eventService.getEventById(eventid);
		existingEvent.setEventid(eventid);
		existingEvent.setEventname(event.getEventname());
		existingEvent.setDescription(event.getDescription());
		existingEvent.setDate(event.getDate());
		existingEvent.setType(event.getType());
		existingEvent.setVenue(event.getVenue());
		eventService.updateEvent(existingEvent);
		return "redirect:/events";
		
	}
	
//	@ApiOperation(value = "Gets event by ID", 
//	        response = Event.class, 
//	        notes = "Event must exist")
//	@GetMapping("/{eventid}")
//	   public ResponseEntity<Event> getCustomer(@PathVariable("eventid") Integer eventid) {
//	       return ResponseEntity.ok(eventService.getById(eventid));
//	}
	
	
	private Object searchEventSpecification(String search) {
	// TODO Auto-generated method stub
	return null;
}


	@RequestMapping( value = "/home", method = RequestMethod.GET)
    public String getIndex(){
        return "Home";
    }
	
}
