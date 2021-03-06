package task5;

public class Message {
    private String sender; //送信者
    private String recipient; //受信者
    private String body; //本文
    
    public Message(String sender, String recipient, String body) {
		this.sender = sender;
		this.recipient = recipient;
		this.body = body;
    }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public String getBody() { return body; }
}