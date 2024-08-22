package contactService.contactService;

public class Contact {
	private String contactID; //unique contact ID string
	private String firstName; // first name of the contact
	private String lastName; // last name of the contact
	private String phoneNumber; // phone number of the contact
	private String contactAddress; // Address of the contact
	
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress) {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.contactAddress = contactAddress;
	}
	
	//setters a getters for each element
	
	public String getContactID() {
		return contactID;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
	
}
