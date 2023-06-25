package testFiles;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import classFiles.Contact;
import classFiles.ContactService;

public class ContactServiceTest {
	@Test
	//Testing functionality for adding a contact
	void addContactTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		assertEquals(true, contactTest.addContact(contact));
	}
	
	@Test
	//Testing assertion throw for adding contact with same ID
	void addSameContactIdTest() {
		ContactService contactTest = new ContactService();
		Contact contact1 = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		Contact contact2 = new Contact("123", "Jayne", "Dee", "0987654321", "321 Cloudy Drive");
		assertEquals(true, contactTest.addContact(contact1));
		assertEquals(false, contactTest.addContact(contact2));
	}

	@Test
	//Testing functionality for updating first name
	void updateFirstNameTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contactTest.addContact(contact);
		assertEquals(true, contactTest.updateFirstName("123", "Jane"));
	}

	@Test
	void updateLastNameTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contactTest.addContact(contact);
		assertEquals(true, contactTest.updateLastName("123", "Smith"));
	}
	
	@Test
	void updateNumberTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contactTest.addContact(contact);
		assertEquals(true, contactTest.updateNumber("123", "0987654321"));
	}
	
	@Test
	void updateAddressTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contactTest.addContact(contact);
		assertEquals(true, contactTest.updateAddress("123", "321 Cloudy Drive"));
	}
	
	@Test
	//Testing functionality for deleting a contact
	void deleteContactTest() {
		ContactService contactTest = new ContactService();
		Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Sunny Ln");
		contactTest.addContact(contact);
		assertEquals(true, contactTest.deleteContact("123"));
		assertEquals(false, contactTest.deleteContact("321"));//Testing assertion throw for deleting a non-existing contact
	}
}	

