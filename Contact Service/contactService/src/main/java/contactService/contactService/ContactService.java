package contactService.contactService;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts;
	
	public ContactService() {
		this.contacts = new HashMap<>();
	}
	
	public void addContact(Contact contact) {
		contacts.put(contact.getContactID(), contact);
	}
	
	public void deleteContact(String contactID) {
		contacts.remove(contactID);
	}
	
	public void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress) {
		if (contacts.containsKey(contactID)) {
			Contact contact = contacts.get(contactID);
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setPhoneNumber(phoneNumber);
			contact.setContactAddress(contactAddress);
		}
	}
	
	public Contact getContactByID(String contactID) {
		return contacts.get(contactID);
	}
}
