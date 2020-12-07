package task6;

import java.util.Iterator;

public class StringIterator implements Iterator<Character>{
	private String str;
	private int index = 0;
	public StringIterator(String s) {
		str = s;
	}
	public boolean hasNext() {
		return index < str.length();
	}
	public Character next() {
		return str.charAt(index++);
	}
	public void remove() {}
}

	  