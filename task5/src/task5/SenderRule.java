package task5;

public class SenderRule extends Rule{
	String senderName;
	public SenderRule(Command command, String senderName) {
		super(command);
		this.senderName = senderName;
		}
	protected boolean check(Message msg) {
		return msg.getSender().equals(senderName);
		}
}