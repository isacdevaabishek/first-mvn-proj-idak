package com.fssa.idak.day19.practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserValidationUnitTestCase {
	
	//  for valid id
	@Test
	public void testValidId() {
		Assertions.assertTrue(UserValidation.idValidator("12345678"));
	}
//  for invalid id
	@Test
	public void testInvalidId() {
		try {
			UserValidation.idValidator("998");
			Assertions.fail("Validateid failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The entered digit is invalid", ex.getMessage());
		}
	}
//  for valid name
	@Test
	public void testValidName() {
		Assertions.assertTrue(UserValidation.nameValidator("sandeepok"));
	}
//  for invalid name
	@Test
	public void testInvalidName() {
		try {
			UserValidation.nameValidator("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The name should be in minimum 2 letters", ex.getMessage());
		}
	}
//  for valid email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserValidation.emailValidator("sandeep@gmail.com"));
	}
//  for invalid email
	@Test
	public void testInvalidEmail() {
		try {
			UserValidation.emailValidator("sandeepgmail");
			Assertions.fail("Validateemail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The email is invalid", ex.getMessage());
		}
	}
//  for valid password
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserValidation.passwordValidator("sand@#99Sasn"));
	}
//  for invalid id
	@Test
	public void testInvalidPassword() {
		try {
			UserValidation.passwordValidator("sand");
			Assertions.fail("Validatepassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The password is invalid", ex.getMessage());
		}
	}
}