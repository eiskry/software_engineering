package task7;

import junit.framework.TestCase;

public class BookShelfTest extends TestCase {
	
	private static BookShelf bookShelf;
	
	public void setUp() {
		bookShelf = new BookShelf(3);
		bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
	}

	public void testGetLength() {
		assertEquals(3, bookShelf.getLength());
	}

	public void testIterator() {
		String[] test = new String [3];
		int i =0;
		for (Book book : bookShelf) {
			test[i] = book.getName();
			i = i+1;
		}
		assertTrue("A"==test[0] && "B" ==test[1] && "C" ==test[2]);
	}
	
	public void testRemoveAt() {
		bookShelf.removeAt(1);
		assertEquals(2, bookShelf.getLength());
		
	}
}
