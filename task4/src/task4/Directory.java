package task4;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Directory extends Entry implements Subject<Entry> {
	public Directory(String name) {
		super(name);  // 親クラスのコンストラクタを呼び出す．
	    }
	private List<Entry> children = new LinkedList<Entry>();
    public List<Entry> getChildren() {
	return children;
    }
    public void add(Entry e) {
	children.add(e);
	notifyObservers();
    }
	
    //観察者リスト
    private List<Observer> observerList = new LinkedList<Observer>();

	public void addObserver(Observer o) {
		observerList.add(o);
	}

	public void notifyObservers() {
		Iterator<Observer> it = observerList.iterator();
        while (it.hasNext()) {
            ((Observer)it.next()).update(this);
        }
	}
}