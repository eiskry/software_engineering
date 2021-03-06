package task6;

public class Other implements State{
	private Other() {}
    private static Other instance = new Other();
    public static Other getInstance() { return instance; }
    public char processChar(FilterIterator f, char ch) {
	    if (Character.isWhitespace(ch)) {
			f.setState(AfterSpace.getInstance());
			return ch;
		}
		return '.';
    }
}
