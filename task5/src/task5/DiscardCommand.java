package task5;

public class DiscardCommand implements Command {
    public void run(Message msg) {
    	System.out.println("Message from " + msg.getSender() + " discarded.");
    }
}