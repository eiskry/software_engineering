package task5;

public class AnyRule extends Rule {
    public AnyRule(Command command) {
    	super(command);
    }
    protected boolean check(Message msg) {
    	return true;
    }
}