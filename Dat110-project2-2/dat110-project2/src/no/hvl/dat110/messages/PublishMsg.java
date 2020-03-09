package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a message 

	// TODO:
	// Implement object variables - a message and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String message;
	private String topic;
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH,user);
		this.message=message;
		this.topic=topic;
	}
	
	public String gettopic() {
		return topic;
	}

	public void settopic(String topic) {
		this.topic = topic;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message:" + message;
	}

}
