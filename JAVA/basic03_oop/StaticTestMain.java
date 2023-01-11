
public class StaticTestMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		st.name = "이순신";
		
		System.out.println("st.name->"+st.name);
		System.out.println("st2.name->"+st2.name);
		
		//static변수의 값변경
		st.addr = "송파구";
		System.out.println("st.addr->"+ st.addr);
		System.out.println("st2.addr->"+ st2.addr);
		
		//static 멤버변수는 객체를 생성하지 않고 사용할 수 있다.
		//				   Math.PI	-> public static final double PI = 3.141592...
		System.out.println(StaticTest.addr);
		
		st2.setData("세종대왕"); // 객체명.메소드
		StaticTest.setAddr("종로구"); // 클래스명.메소드		static때문에 가능
		System.out.println(StaticTest.addr);
	}

}
