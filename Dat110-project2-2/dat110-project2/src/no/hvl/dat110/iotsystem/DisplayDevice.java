package no.hvl.dat110.iotsystem;


import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.PublishMsg;


public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		// TODO - END
		
	
		
		Client client= new Client("DisplayDevice", Common.BROKERHOST, Common.BROKERPORT);
		String topic=Common.TEMPTOPIC;
		client.connect();
		client.createTopic(topic);
		client.subscribe(topic);
		for(int i=0; i < COUNT; i++) { 
			PublishMsg msg = (PublishMsg) client.receive();
			System.out.println("Display:" + msg.getMessage());
		}
		
		client.unsubscribe(topic);
		client.disconnect();
		
		System.out.println("Display stopping ... ");
		
	
		
	}
}
