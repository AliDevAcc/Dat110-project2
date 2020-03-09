package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String topic1;
	public UnsubscribeMsg(String topic, String topic2) {
		super(MessageType.UNSUBSCRIBE, topic);
		topic1=topic2;
	}
	
	
	public String getTopic() {
		return topic1;
	}
	public void setTopic(String topic1) {
		this.topic1 = topic1;
	}
	
	public String toString() {
		return "Unsubscribed on topic: " + topic1;
	}
	
}
