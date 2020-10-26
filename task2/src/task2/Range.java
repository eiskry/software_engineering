package task2;
import java.util.*;

public class Range implements Iterable<Integer> {
    int from, to, step;
    public Range(int from, int to, int step) {
        // fromからtoまで，step刻みで増やした整数の集合
        this.from = from;
        this.to = to;
        this.step = step;
    }
    public Range(int from, int to) {
        // stepを略すと，1を指定した扱いにする
        // 同じクラスの別のコンストラクタを呼び出すにはthisキーワードを使う
        this(from, to, 1);
    }
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }
}

class RangeIterator implements Iterator<Integer> {
    private Range r;
    private int i;
    RangeIterator(Range range) { r = range; i = r.from; }
    public boolean hasNext() {
        return i <= r.to;
    }
    public Integer next() {
        int v = i;
        i += r.step;
        return v;
    }
    public void remove() { }    // 何もしない
}