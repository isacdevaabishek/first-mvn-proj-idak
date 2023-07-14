package com.fssa.idak.homework;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 class Validator {
	public static boolean validate(UserInfo obj) {
		if(obj==null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}	
		ValidateEventName(obj.getEventName());//
		ValidateEventType(obj.getEventType());
		ValidatePlace(obj.getPlace());
		ValidateContactNo(obj.getContactNo());
		ValidateEventDate(obj.getEventDate());	
		return true;
		
	}
	
	// name validate
		public static boolean ValidateEventName(String EventName)throws IllegalArgumentException {
			if (EventName == null || "".equals(EventName.trim())) {
				throw new IllegalArgumentException("UserName cannot be empty or null");
			} 
			
			String nameregex=  "^[a-zA-Z]{3,}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(EventName);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("EventName should be in minimum 2 letters  and maximum 30 letters");
				
			}
			return true;
			
		}

		public static boolean ValidateEventType(String EventType) throws IllegalArgumentException {
			if (EventType == null || "".equals(EventType.trim())||EventType.length()<=2) {
				throw new IllegalArgumentException("EventType cannot be empty or null and more than 2 chars");
			}
			
			String nameregex= "^[a-zA-Z]{3,}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(EventType);
			Boolean isMatch = matcher.matches();
			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("The EventType is: Invalid");
			}
		}
		// PhoneNumber validate
		public static boolean ValidatePlace(String Place) throws IllegalArgumentException {
			if (Place == null || "".equals(Place.trim())) {
				throw new IllegalArgumentException("Place cannot be empty or null");
			}
			String nameregex= "^[A-Za-z]{3,}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(Place);
			Boolean isMatch = matcher.matches();
			

			if (isMatch) {//"null"
				return true;
			} else {
				throw new IllegalArgumentException("Place is: Invalid");
			}
			
		}
		// Pincode validate
		public static boolean ValidateContactNo(String ContactNo) throws IllegalArgumentException {
			String regex = "^[1-9][0-9]{9}$";//9
			Pattern pattern = Pattern.compile(regex);
			
			Matcher matcher = pattern.matcher(ContactNo);
			Boolean isMatch = matcher.matches();
			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("Contact is: Invalid");
			}
		}
		// Place validate
		public static boolean ValidateEventDate(LocalDate date )throws IllegalArgumentException {
			if (date == null) {
				throw new IllegalArgumentException("Place cannot be empty or null");
			}
			
			String nameregex= "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
			Pattern pattern = Pattern.compile(nameregex);
			String dates= String.valueOf(date);
			Matcher matcher = pattern.matcher(dates);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("Invalid Date Date Should be YYYY-MM-DD");
				
			}
			return true;
			
		}
		
}
public class UserDetailsValidator{
	public static void main(String [] args) {
		UserInfo obj=new UserInfo();
		obj.setEventName("ProductDonation");
		LocalDate input=LocalDate.of(2023,10,10);
		obj.setEventDate(input);
		obj.setContactNo("7305836758");
		obj.setPlace("IslandGround");
		obj.setEventType("Donation");
	    System.out.println(Validator.validate(obj));
	}
}
