package task6;
import java.util.Iterator;

public class Main {
    public static void print(Iterator<Character> ic) {
	char ch;
	while (ic.hasNext()) {
	    ch = ic.next();
	    System.out.print(ch);
	}
    }
    public static void main(String[] args) {
        // 本当は，'\n'を改行文字と同一視すると，環境によっては正しく動かない．
	String s = "The quick brown fox jumps over a lazy dull dog.\n";
	print(new StringIterator(s));
	print(new FilterIterator(new StringIterator(s)));
    }
}
