package task6;

import java.util.Iterator;

public class FilterIterator implements Iterator<Character> {
    private Iterator<Character> original;
    
    public FilterIterator(Iterator<Character> original) {
    	this.original = original;
    }
    public boolean hasNext() {
    	return original.hasNext();
    }
    private State currentState = AfterSpace.getInstance();
    
    public void setState(State s) {
    	currentState = s;
    }
    public Character next() {
		char ch = original.next();
	    return currentState.processChar(this, ch);
    }
    public void remove() {
    	original.remove();
    }
}