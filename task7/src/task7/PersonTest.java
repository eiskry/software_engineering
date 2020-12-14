package task7;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testGetOfficeTelephoneNumber() {
		Person p = new Person("name", "company", "officeAreaCode", "officeNumber");
		assertEquals("officeAreaCode-officeNumber", p.getOfficeTelephoneNumber());
		}
}
