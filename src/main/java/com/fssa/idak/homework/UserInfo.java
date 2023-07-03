package com.fssa.idak.homework;

import java.time.LocalDate;

public class UserInfo {
    String EventName;
    String EventType;
    LocalDate EventDate;
	String Place;
  String ContactNo;
    
    public String getEventName() {
		return EventName;
	}
	public void setEventName(String EventName) {
		this.EventName = EventName;
	}
	public String getEventType() {
		return EventType;
	}
	public void setEventType(String EventType) {
		this.EventType = EventType;
	}
	public LocalDate getEventDate() {
		return EventDate;
	}
	public void setEventDate(LocalDate EventDate) {
		this.EventDate = EventDate;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String Place) {
		this.Place = Place;
	}

	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String ContactNo) {
		this.ContactNo= ContactNo;
	}
}
