package task5;

public class Main {
    public static void main(String[] args) {
        Rule rule;
	/* ここでルールを組み立てる． */

        Message[] msgs = {  // Messageの配列
            new Message("alice", "me", "Hello, this is Alice."),
            new Message("bob", "me", "Hello from Bob."),
            new Message("charlie", "me", "Hi, it's Charlie.")
        };
        for (Message m : msgs) {
            /* ここでメッセージmについてルールを実行する． */
        	rule1.setNext(rule2).setNext(rule3);
        }
    }
}