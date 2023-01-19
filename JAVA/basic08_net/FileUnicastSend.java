import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileUnicastSend {
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress ia;
	final int PORT = 15000;
	public FileUnicastSend() {
		
	}
	public void sendStart() {
		try {
			ds = new DatagramSocket();
			ia = InetAddress.getByName("192.168.50.107");
			
			//파일의 내용을 byte 배열로 읽어와 전송하기 위해 InputStream 객체를 생성한다
			File f = new File("d://img/Sunflower.jpg");
			FileInputStream fis = new FileInputStream(f);
			
			//파일명을 전송
			String sendFileName = "[*$@File&]"+f.getName(); // [*$@File&]Sunflower.jpg
			dp = new DatagramPacket(sendFileName.getBytes(), 0, sendFileName.getBytes().length, ia, PORT);
			ds.send(dp);
						
			// 파일내용을 읽어 전송
			int cnt = 0;
			while(true) {
				byte[] b = new byte[512];
				int byteCount = fis.read(b, 0, b.length);
				System.out.println(++cnt+", byte="+byteCount);
				if(byteCount <=0) break;
				dp = new DatagramPacket(b, 0, byteCount, ia, PORT);
				ds.send(dp);
				
			}
			
			// 전송을 완료
			String endMessage = "[!@#$%end]"; //10글자
			dp = new DatagramPacket(endMessage.getBytes(), 0, endMessage.getBytes().length, ia, PORT);	
			ds.send(dp);
						
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicastSend().sendStart();

	}

}
