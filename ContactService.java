package classFiles;
import java.util.*;

public class ContactService {
	private static List<Contact> contacts;
	
	//Constructor
	public ContactService() {
		contacts=new ArrayList<>();
	}
	
	public boolean addContact(Contact contact) {
		//For all contacts, if contact being added has same ID, display error message
		for(Contact i: contacts) {
			if (i.getId().equals(contact.getId())) {
				System.out.println("Contact ID already exists");
				return false;
			}
		}
		//If ID is unique, add contact
		contacts.add(contact);
		System.out.println("Contact added");
		return true;
	}
	public boolean deleteContact(String id) {
		//For all contacts, if matching ID is found, delete contact
		for (Contact i: contacts) {
			if(i.getId()== id) {
			contacts.remove(i);
			System.out.println("Contact deleted");
			return true;
			}
		}
		//If no matching contact ID is found, display error message
		System.out.println("Contact not found");
		return false;
	}
		
	public boolean updateFirstName(String id, String firstName) {
		for(Contact i: contacts) {
			if (i.getId().equals(id)) {
				i.setFirstName(firstName);
				System.out.println("First name updated");
				return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}
	
	public boolean updateLastName(String id, String lastName) {
		for(Contact i: contacts) {
			if (i.getId().equals(id)) {
				i.setLastName(lastName);
				System.out.println("Last name updated");
				return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}
	
	public boolean updateNumber(String id, String number) {
		for(Contact i: contacts) {
			if (i.getId().equals(id)) {
				i.setNumber(number);
				System.out.println("Phone number updated");
				return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}
	
	public boolean updateAddress(String id, String address) {
		for(Contact i: contacts) {
			if (i.getId().equals(id)) {
				i.setAddress(address);
				System.out.println("Address updated");
				return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}
}
