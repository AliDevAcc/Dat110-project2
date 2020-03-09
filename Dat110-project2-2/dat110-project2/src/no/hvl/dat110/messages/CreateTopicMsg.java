package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
    // as described in the project text
	private String topic;
	
	
	
	public CreateTopicMsg( String user, String topic2) {
		super(MessageType.CREATETOPIC, user);
		topic=topic2;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "New topic: " + topic + " Created";
	}
}
