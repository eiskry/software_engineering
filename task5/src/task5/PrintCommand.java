package task5;

public class PrintCommand implements Command{
	public void run(Message msg) {
    	System.out.println("From: " + msg.getSender() + ", To: " + msg.getRecipient() +", Body: "+ msg.getBody());
    }
}
