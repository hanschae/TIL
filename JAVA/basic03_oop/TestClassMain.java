
public class TestClassMain {

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();

		ClassTest ct2 = new ClassTest(5000);
	
		ClassTest ct3 = new ClassTest("홍길동", 26);
	
		ClassTest ct4 = new ClassTest(99, "이순신");
	
		//객체내의 메소드를 호출 : 객체명.메소드명
		ct.sum();
		System.out.println(ct2.total(50));
	
		//객체내의 멤버변수를 접근하고 싶다.
		// 객체명.멤버변수
		System.out.println("ct2.num->"+ct2.num);
		System.out.println("ct3.MAX->"+ct3.MAX); // Math.Pi
	
	
	
	}

}
