package task6;

public class AfterSpace implements State {
    private AfterSpace() {}
    private static AfterSpace instance = new AfterSpace();
    public static AfterSpace getInstance() { return instance; }
    public char processChar(FilterIterator f, char ch) {
    	if (! Character.isWhitespace(ch)) {
    		f.setState(Other.getInstance());
    	}
    	return ch;
    }
}