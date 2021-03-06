package task4;

import java.util.List;
import java.util.LinkedList;

public class IndentObserver implements Observer<Entry> {

	//深さを調べるメソッド
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
	
	
//	Entry名をプリントする
//	private void printEntries(Entry e) {
//	    for (Entry child : e.getChildren()) {
//	    	   System.out.println(child.getName());
//	    	   printEntries(child);
//	       }
//	    	
//	    }
	
//	字下げして表示するメソッド
	private void printEntries(int depth, Entry e) {
	    for (Entry child : e.getChildren()) {
	    	for (int i = 0; i < depth; i++) {
	    		System.out.print(" ");
	    	}
	    	depth = depth + 1;
	    	System.out.println(child.getName());
	    	printEntries(depth, child);
	    	depth = depth - 1;
	    	
	       }
	    	
	    }
    
    public void update(Entry e) {
    	int depth = 3;
//    
    	System.out.println("root");
//    	printEntries(e);
    	printEntries(depth, e);
    }
}