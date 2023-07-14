package com.fssa.idak.homework;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserValidatorTest {
//  for valid Username
	

@Test
	public void testValidEventName() {
		Assertions.assertTrue(Validator.ValidateEventName("Santhus"));
	}
@Test
    public void testValidEventNameNull() {
    	try {
    		Validator.ValidateEventName("");
    		Assertions.fail("Failed");
    	}
	catch(IllegalArgumentException ex) {
		Assertions.assertEquals("UserName cannot be empty or null",
				ex.getMessage());
	}
    }
@Test
    public void testValidEventNameOnechar() {
    	
    	try {
    		Validator.ValidateEventName("a");
    		Assertions.fail("Failed");
    	}
	catch(IllegalArgumentException ex) {
		Assertions.assertEquals("EventName should be in minimum 2 letters  and maximum 30 letters",
				ex.getMessage());
	}
    	
        }

	
@Test
public void testValidEventType() {
	Assertions.assertTrue(Validator.ValidateEventType("donation"));
}
@Test
public void testValidEventTypeNull() {
	try {
		Validator.ValidateEventType("");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("EventType cannot be empty or null and more than 2 chars",
			ex.getMessage());
}
}
@Test
public void testobj() {
	UserInfo testobj=new UserInfo();
	testobj.setEventName("ProductDonation");
	LocalDate input=LocalDate.of(2023,10, 10);
	testobj.setEventDate(input);
	testobj.setContactNo("1234567890");
	testobj.setPlace("IslandGround");
	testobj.setEventType("Donation");
	Assertions.assertTrue(Validator.validate(testobj));
	
}
@Test
public void testobjnull() {
	try {
		Validator.validate(null);
	}
	catch(IllegalArgumentException ex) {
		Assertions.assertEquals("Argument Cannot be null",
				ex.getMessage());
	}
	
}
@Test

public void testValidEventTypeOnechar() {
	
	try {
		Validator.ValidateEventType("");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("EventType cannot be empty or null and more than 2 chars",
			ex.getMessage());
}
	
    }
	

@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(Validator.ValidateContactNo("1234567890"));
	}
@Test
public void testInValidPhoneNumber() {
	
	try {
		Validator.ValidateContactNo("98398347");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("Contact is: Invalid",
			ex.getMessage());
}
	
    }
	

@Test
	public void testEventDate() {
	LocalDate input=LocalDate.of(2023,10, 10);
	
		Assertions.assertTrue(Validator.ValidateEventDate(input));
	}

//public void testInValidEventDate() {
//	
//	try {
//		LocalDate input=LocalDate.of(2000,02, 30);//Invalid
//		Assertions.assertTrue(Validator.ValidateEventDate(input));//true
//		Assertions.fail("Failed");
//		 
//	}
//catch(IllegalArgumentException ex) {
//	Assertions.assertEquals("Invalid Date Date Should be YYYY-MM-DD",
//			ex.getMessage());
//}
	
//    }
@Test
public void testValidEventPlaceNull() {
	try {
		Validator.ValidateEventName("");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("UserName cannot be empty or null",
			ex.getMessage());
}
}
	
	

@Test
	public void testValidPlace() {
		Assertions.assertTrue(Validator.ValidatePlace("tirunelveli"));
	}
@Test
   void testValidPlaceNull() {
	try {
		Validator.ValidatePlace(null);
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("Place cannot be empty or null",
			ex.getMessage());
}
}
@Test
public void testValidEventPlaceOnechar() {
	
	try {
		Validator.ValidatePlace("a");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("Place is: Invalid",
			ex.getMessage());
}
	
    }

}
