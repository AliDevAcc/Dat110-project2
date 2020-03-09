package no.hvl.dat110.messages;

public class DisconnectMsg extends Message {
	
	// message sent from the client when disconnecting from the broker
	private String bruker;
	public DisconnectMsg(String user) {
		super(MessageType.DISCONNECT, user);
		bruker=user;
	}
	
	public String toString() {
		return "User " + bruker + " Disconnected";
	}
	
}
