import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MulticastReceive {
	MulticastSocket ms;
	DatagramPacket dp;
	InetAddress ia;
	
	final int PORT = 20000;
	
	public MulticastReceive() {
		try {
			ms = new MulticastSocket(PORT);
			ia = InetAddress.getByName("235.150.50.7");
			
			InetSocketAddress isa = new InetSocketAddress(ia,PORT);
			NetworkInterface ni = NetworkInterface.getByName("ggm");
			ms.joinGroup(isa, ni);
			
			byte data[] = new byte[512];
			dp = new DatagramPacket(data, data.length);
			ms.receive(dp);
			
			System.out.println(new String(dp.getData(), 0, dp.getLength()));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MulticastReceive();

	}

}
