package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReceiveUDP {
	
	public void receiver() throws IOException  {

		DatagramSocket socket = new DatagramSocket();
		
		
		DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
		
		socket.receive(packet);
		
		String tmp = new String(packet.getData());
		System.out.println(tmp);
		socket.close();
		
	}
	
}
