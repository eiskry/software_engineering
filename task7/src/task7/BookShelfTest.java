package task7;

import junit.framework.TestCase;

public class BookShelfTest extends TestCase {
	
	private static BookShelf bookShelf;
	
	public void setUp() {
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
	}

	public void testGetLength() {
		assertTrue(3 == bookShelf.getLength());
		
	}

	public void testIterator() {
		
	}

}
