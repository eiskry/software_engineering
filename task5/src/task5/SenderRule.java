package task5;

public class SenderRule extends Rule{
	public SenderRule(Command command) {
		super(command);
	    }
	protected boolean check(Message msg) {
		return msg.getSender().equals( msg.getSender());
	    }
}