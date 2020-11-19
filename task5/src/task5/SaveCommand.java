package task5;

public class SaveCommand implements Command {
    public void run(Message msg) {
    	System.out.println("Message from " + msg.getSender() + " saved.");
    }
}