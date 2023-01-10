package basic02_api;

public class WrapperClass {

	public WrapperClass() {
		int i = 500;
		// Wrapper 클랫
		// Byte,  Short, Integer, Long
		// Float, Double
		// Character
		
		// i를 객체로 만들기
		Integer intObj = Integer.valueOf(i); // new Integer(i); < 취소선 = 권장하지 않는다
		int x = intObj.intValue();
		
		System.out.println(intObj.MAX_VALUE); // Integer.BYTES
		System.out.println(intObj.MIN_VALUE);
		
		Integer intObj2 = i; // 기본데이터형이 객체화됨, 오토박싱
		//  int   Integer
		int con = intObj; // 오토언박싱
		
		String data = "254";
		// 문자열을 숫자로 변경
		Integer y = new Integer(data);
		int z1 = Integer.parseInt(data);// int
		Integer z2 = Integer.valueOf(data);// Integer
		int z3 = Integer.valueOf(data); // Integer
		System.out.println(z1*2);
		System.out.println(z2*3);
	}

	public static void main(String[] args) {
		new WrapperClass();

	}

}
