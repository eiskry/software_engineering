package task2;
import java.util.Iterator;

public class TreeTest {
	public static void main(String[] args) {
		Tree root = new Tree("A", 
	                             new Tree("B",
	                                      new Tree("C", null, null),
	                                      new Tree("D", null, null)),
	                             new Tree("E",
	                                      new Tree("F", null, null),
	                                      null));
	        Iterator<Tree> i = root.iterator();
	        while (i.hasNext()) {
	            System.out.println(i.next().label);
	        }
	    }
}
