
public class StaticTest {
	// static은 멤버변수, 메소드에 표기할 수 있다.
	// 데이터타입 왼쪽에 기술하여야 한다.
	// 객체명.멤버변수
	// 클래스명.멤버변수
	
	String name = "홍길동";
	int age = 30;
	static String addr = "강남구";
	
	//멤버영역에는 실행문을 표기할 수 없다.
	//static을 이용하면 멤버영역에 실행문을 기술할 수 있다.
	//		  같은 클래스로 객체를 여러번 생성하더라도 한번만 실행된다.
	static {
		System.out.println("실행문");
		System.out.println("멤버변수 사용불가");
		
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	StaticTest(){
		System.out.println("생성자메소드");
	}
	
	void setData(String name) {
		this.name = name;
	}
	//메소드에 static
	//객체를 생성하지 않고 외부에서 클래스명.메소드명으로 접근이 가능하다
	static void setAddr(String addr) {
		StaticTest.addr = addr;
	}
}
