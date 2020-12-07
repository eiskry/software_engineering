package task7;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testGetName() {
	    Book b = new Book("Foo");
	    assertEquals("Foo", b.getName());
	  }

}
