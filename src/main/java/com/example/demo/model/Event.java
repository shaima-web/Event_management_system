package com.example.demo.model;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "events")
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventid;
	@NotBlank
	private String eventname;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String date;
	@NotBlank
	private String venue;
	@NotBlank
	private String description;
	@NotBlank
	private String type;
	
public Event() {
		
	}

	
	public Event(String eventname, String date, String venue, String description, String type) {
		super();
		this.eventname = eventname;
		this.date = date;
		this.venue = venue;
		this.description = description;
		this.type = type;
	}
	
	public Integer getEventid() {
		return eventid;
	}
	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	public List<Event> findAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

}
