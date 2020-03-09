package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	private String topic;
	
	
	
	public DeleteTopicMsg(String user, String topic2) {
		super(MessageType.DELETETOPIC, user);
		topic=topic2;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "topic: " + topic + " Deleted";
	}
}
