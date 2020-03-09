package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	private String topic1;
	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		topic1=topic;
	}
	
	
	public String getTopic() {
		return topic1;
	}
	public void setTopic(String topic1) {
		this.topic1 = topic1;
	}
	
	public String toString() {
		return "Subscribed on topic: " + topic1;
	}
}
