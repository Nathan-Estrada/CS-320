package classFiles;

public class Contact {
	//Public declaration of variables
	private String id;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	//Constructor
	public Contact(String id, String firstName, String lastName,
			String number, String address) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		//Use later defined setters if variables fit the requirements
		this.id = id;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setNumber(number);
		this.setAddress(address);
	}
	
	//Public definition of getters and setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length()>10) {  
			throw new IllegalArgumentException("Invalid First Name");  
	        }  
	    this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}
	public void setNumber(String number) {
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		//Loop through all characters in string to ensure only digits are entered
		for (int i = 0; i < number.length(); i++) {
			if (!Character.isDigit(number.charAt(i))) {
				throw new IllegalArgumentException("Invalid phone number");
			}
		}
		this.number = number;
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
}
