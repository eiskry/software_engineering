package task2;
//ファイルTree.java

import java.util.*;

public class Tree implements Iterable<Tree> {
	String label;
	Tree left, right;
	public Tree(String label, Tree left, Tree right) {
		this.label = label;
		this.left = left;
		this.right = right;
	}
	public Iterator<Tree> iterator() {
		return new TreeIterator(this);
	}
}

class TreeIterator implements Iterator<Tree> {
	protected Tree[] stack;
	protected int stackPointer;
	private void push(Tree node) {
		stack[stackPointer++] = node;
	}
	private Tree pop() {
		return stack[--stackPointer];
	}
	public TreeIterator(Tree tree) {
		stack = new Tree[5];
		stackPointer = 0;
		push(tree);         // 木の根だけpushしておく．
	}
	public boolean hasNext() {
		return stackPointer > 0;
	}
	public Tree next() {
		Tree node = pop();   // これから調べるノードをpopする．
		// 子供があれば，将来nextが呼ばれた時に調べるようpushする
		if(node.right != null) {
			 push(node.right);
		}
		if(node.left != null) {
			 push(node.left);
		}
		
		return node;         // 最初にpopしたノードを返す．
	}
	public void remove() { } // 何もしない(remove操作はサポートしない)
}