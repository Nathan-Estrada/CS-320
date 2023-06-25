package testFiles;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classFiles.Contact;

public class ContactTest {
	@Test
	//Test to ensure Contact constructor is working as intended
	void testContact() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		assertTrue(contact.getId().equals("123"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Sunny Ln"));
	}
	@Test
	void testIdTooAssertions() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678901", "John", "Doe", "1234567890", "123 Sunny Ln"); //ID too long
		});
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact(null, "John", "Doe", "1234567890", "123 Sunny Ln"); //ID is null
		});
	}
	
	@Test
	void testFirstNameAssertions() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "Joooooooooooohn", "Doe", "1234567890", "123 Sunny Ln"); //First name too long
		}); 
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", null, "Doe", "1234567890", "123 Sunny Ln"); //First name null
		});
	}
	
	@Test
	void testLastNameAssertions() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Dooooooooooooooooooooooooooooe", "1234567890", "123 Sunny Ln"); //Last name too long
		});
		Assertions.assertThrows (IllegalArgumentException.class, () -> {
			new Contact("123", "John", null, "1234567890", "123 Sunny Ln"); //Last name null
		});
	}
	
	@Test
	void testNumberAssertions() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", "12345abcde", "123 Sunny Ln"); //Number contains non-digits
		});
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", "12345", "123 Sunny Ln"); //Number too short
		});
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", "1234567890000000", "123 Sunny Ln"); //Number too long
		});
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", null, "123 Sunny Ln"); //Number is null
		});
	}
	
	@Test
	void testAddressAssertions() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", "1234567890", "123 Sunny AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		});
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123", "John", "Doe", "1234567890", null);
		});
	}
	
	@Test
	//Testing getter for ID
	void testIDGetter() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		assertTrue(contact.getId().equals("123"));
	}
	
	@Test
	//Testing getter and setter for first name
	void testFirstNameGetterSetter() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contact.setFirstName("Steve");
		assertTrue(contact.getFirstName().equals("Steve"));
	}
	
	@Test
	//Testing getter and setter for last name
	void testLastNameGetterSetter() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contact.setLastName("McGee");
		assertTrue(contact.getLastName().equals("McGee"));
	}
	
	@Test
	//Testing getter and setter for phone number
	void testNumberGetterSetter() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contact.setNumber("0987654321");
		assertTrue(contact.getNumber().equals("0987654321"));
	}
	
	@Test
	//Testing getter and setter for address
	void testAddressGetterSetter() {
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contact.setAddress("321 Cloudy Drive");
		assertTrue(contact.getAddress().equals("321 Cloudy Drive"));
	}
}