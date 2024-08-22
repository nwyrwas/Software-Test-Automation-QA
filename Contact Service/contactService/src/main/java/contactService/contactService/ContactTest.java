package contactService.contactService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
	
	@Test
	public void testContactInitialization() {
		Contact contact = new Contact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		assertEquals("99999", contact.getContactID());
		assertEquals("Nick", contact.getFirstName());
		assertEquals("Wyrwas", contact.getLastName());
		assertEquals("8183459183", contact.getPhoneNumber());
		assertEquals("123 John Doe Ave", contact.getContactAddress());
	}
	
	@Test
	public void testContactUpdate() {
		Contact contact = new Contact("99999", "Nick", "Wyrwas", "8183459183", "123 John Doe Ave");
		
		contact.setFirstName("Nick");
		contact.setLastName("Wyrwas");
		contact.setPhoneNumber("818459183");
		contact.setContactAddress("123 John Doe Ave");
		
		assertEquals("99999", contact.getContactID());
		assertEquals("Nick", contact.getFirstName());
		assertEquals("Wyrwas", contact.getLastName());
		assertEquals("8183459183", contact.getPhoneNumber());
		assertEquals("123 John Doe Ave", contact.getContactAddress());
	}
}
