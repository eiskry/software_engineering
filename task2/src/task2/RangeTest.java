package task2;

import java.util.Iterator;

public class RangeTest {
    public static void main(String[] args) {
        // 1から10まで，2おきに繰り返す
        Iterator<Integer> i = (new Range(1, 10, 2)).iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
	System.out.println("----");
        // 別の書き方： 1から4まで，1おきに繰り返す
        for (int j : new Range(1, 4)) {
            System.out.println(j);
        }
    }
}