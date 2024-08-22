package contactService.contactService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
	
	@Test
	public void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		contactService.addContact(contact);
		
		assertEquals(contact, contactService.getContactByID("99999"));
	}
	
	@Test
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		contactService.addContact(contact);
		contactService.deleteContact("99999");
		
		assertNull(contactService.getContactByID("99999"));
	}
	
	@Test
	public void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		contactService.addContact(contact);
		contactService.updateContact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		assertEquals("Nick", contactService.getContactByID("99999").getFirstName());
		assertEquals("Wyrwas", contactService.getContactByID("99999").getLastName());
		assertEquals("8183459183", contactService.getContactByID("99999").getPhoneNumber());
		assertEquals("123 John Doe Ave", contactService.getContactByID("99999").getContactAddress());
	}
}
