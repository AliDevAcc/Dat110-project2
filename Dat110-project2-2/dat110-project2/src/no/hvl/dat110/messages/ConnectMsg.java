package no.hvl.dat110.messages;

public class ConnectMsg extends Message {
	
	// message sent by the client when connecting to the broker
	private String bruker;
	public ConnectMsg (String user) {
		super(MessageType.CONNECT, user);
		bruker=user;
	}
	public String getBruker() {
		return bruker;
	}
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}
	
	public String toString() {
		return bruker + " has connected";
	}
}
