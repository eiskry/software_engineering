package task4;

public class CountingObserver implements Observer<Entry> {
    private int countEntries(Entry e) {
        // 木構造eの中のEntryの数を返す．
	int count = 1;
	for (Entry child : e.getChildren()) {
	    count += countEntries(child);
	}
	return count;
    }
    public void update(Entry e) {
	System.out.println(e.getName() + " contains " + countEntries(e) + " entries.");
    }
}