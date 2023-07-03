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
		Assertions.assertEquals("Name cannot be empty or null",
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
	Assertions.assertEquals("EventType cannot be empty or null",
			ex.getMessage());
}
}
@Test
public void testValidEventTypeOnechar() {
	
	try {
		Validator.ValidateEventType("a");
		Assertions.fail("Failed");
	}
catch(IllegalArgumentException ex) {
	Assertions.assertEquals("The EventType is: Invalid",
			ex.getMessage());
}
	
    }
	

@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(Validator.ValidateContactNo("9095297688l"));
	}
	

@Test
	public void testEventDate() {
	LocalDate input=LocalDate.of(2023,10, 10);
	
		Assertions.assertTrue(Validator.ValidateEventDate(input));
	}
	

@Test
	public void testValidPlace() {
		Assertions.assertTrue(Validator.ValidatePlace("Tirunelveli"));
	}
	

}
