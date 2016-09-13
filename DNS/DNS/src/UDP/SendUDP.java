package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendUDP {
	
	public void send(String dest, int port,String message)  throws IOException  {
		
		InetAddress destination = InetAddress.getByName(dest);
		
		byte[] msg = message.getBytes();
		
		DatagramPacket packet = new DatagramPacket(msg,msg.length,destination,port);
		DatagramSocket socket = new DatagramSocket();
		
		socket.send(packet);
		socket.close();
	}
	
	public void sendDNS(String dest,int port, byte[] request) throws IOException {
		
		InetAddress destination = InetAddress.getByName(dest);
		DatagramPacket packet = new DatagramPacket(request, request.length,destination,port);
		DatagramSocket socket = new DatagramSocket();
		socket.send(packet);
		socket.close();
	}
}
