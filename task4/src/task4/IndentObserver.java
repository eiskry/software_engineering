package task4;

import java.util.List;
import java.util.LinkedList;

public class IndentObserver implements Observer<Entry> {
//	
//	private int countDepth(Entry e) {
//        // 木構造eの中のEntryの数を返す．
//		int depth = 1;
//		for (Entry child : e.getChildren()) {
//			if (e.getChildren() != null) {
//				depth += countDepth(child);
//			}
//		}
//		return depth;
//    }
	
	
	private int countEn(Entry e) {
        // 木構造eの中のEntryの数を返す．
	int count = 1;
	for (Entry children : e.getChildren()) {
	    count += countEn(children);
	}
	return count;
    }
	
	private void printEntry(Entry e) {
	    for (Entry child : e.getChildren()) {
	    	   System.out.println(child.getName());
	    	   printEntry(child);
	       }
	    	
	    }
	

//	  private void printEntries(int depth, Entry e) {
//	    
//	  }
    
    public void update(Entry e) {
//    	int depth = countDepth(e);
    	System.out.println(countEn(e));
//    
//    	System.out.println("root");
//    	printEntry(e);
//    	System.out.println(e.size());
    }
}