

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		
	}
	public void start() {
		//ip에 관련된 객체를 생성한다
		//내컴퓨터의 아이피정보를 얻어오기
		try {
			InetAddress ia = InetAddress.getLocalHost();
			String ip = ia.getHostAddress(); // 컴퓨터 ip
			String name = ia.getHostName(); // 컴퓨터이름 또는 URL주소
			System.out.println("ia.address->"+ip);
			System.out.println("ia.name->"+name);
			
			// 도메인 이용한 InetAddress를 얻어오기
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println("ia2.address->"+ia2.getHostAddress());
			System.out.println("ia2.name->"+ia2.getHostName());
			
			// 아이피를 이용한 InetAddress를 얻어오기
			InetAddress ia3 = InetAddress.getByName("223.130.200.107");
			System.out.println("ia2.address->"+ia3.getHostAddress());
			System.out.println("ia2.name->"+ia3.getHostName());
			System.out.println("-------------------------");
			
			//여러개의 netAddress객체 얻어오기
			InetAddress[] ia4 = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i:ia4) {
				System.out.println("ia4.address->"+i.getHostAddress());
				System.out.println("ia4.address->"+i.getHostName());
								
			}
						
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		InetAddressTest it = new InetAddressTest();
		it.start();

	}

}
