package task5;

public abstract class Rule {
    private Command command;
    private Rule next = null;
    
    public Rule(Command command) {
    	this.command = command;
    }
    
    protected abstract boolean check(Message msg); //　オーバーライドする
    
    final public Rule setNext(Rule next) { // たらい回し先を設定
    	this.next = next;
    	return next;
    }
    final public void handle(Message msg) { //　トラブル解決の手順
    	if (check(msg)) {
    		command.run(msg);
    	} else if (next != null) {
    		next.handle(msg);
    	}
    }
}