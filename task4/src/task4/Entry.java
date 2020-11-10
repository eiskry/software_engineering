package task4;

import java.util.List;
import java.util.LinkedList;

public class Entry {
    private String name;
    private static List<Entry> empty = new LinkedList<Entry>();  // 空リスト
    protected Entry(String name) {
	this.name = name;
    }
    public String getName() { return name; }
    public List<Entry> getChildren() {
	return empty;
    }
}