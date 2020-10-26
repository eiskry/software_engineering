package task2;

//ファイルBookShelfIterator.java
import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
	protected BookShelf bookShelf;
	protected int index;
	public BookShelfIterator(BookShelf bookShelf) {
	this.bookShelf = bookShelf;
	this.index = 0;
	}
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}
	public Book next() {	
		return bookShelf.getBookAt(index++);
	}
	public void remove() { } // 省略．何もしない．
}