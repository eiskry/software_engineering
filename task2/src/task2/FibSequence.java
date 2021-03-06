package task2;

//ファイルFibSequence.java
import java.util.Iterator;

public class FibSequence implements Iterable<Integer> {
	 // 長さnumのフィボナッチ数列を表すクラス
	 int num;
	 public FibSequence(int num) { this.num = num; }
	 public Iterator<Integer> iterator() { return new FibIterator(num); }
}

class FibIterator implements Iterator<Integer> {
	private int num, i, j;
	FibIterator(int num) { 
		this.num = num;
		i = 0; j = 1;
	}
	public boolean hasNext() {
		return num > 0;
	}
	public Integer next() {
	// iとjを使って次の値を計算して返す
	// i, j, numを更新する
		int value = j;
		int sum = i+j;	
		i = j;
		j = sum;
		num = num-1;
		return value;
	}
 public void remove() { } // 何もしない
}
