package basic02_api;

public class StringBufferTest {

	public static void main(String[] args) {
		// String : 연산이 적은 데이터 스레드(동기화)가능
		// StringBuffer : 연산이 많고 스레드가능
		// StringBuilder : 연산이 많고 동기화를 고려하지 않을때
		
		//StringBuffer sb = new StringBuffer(30);
		//									012345678901234567890123
		StringBuffer sb = new StringBuffer("JAVA Programming Test...");
		sb.append("잘되나?"); // 마지막에 추가, sb = sb.append("잘되나?"); a = a + "ddd";
		sb.insert(4, "(자바)"); // index 4 앞에 (자바) 삽입
		
		// 01234567890
		// JAVA(자바) Programming Test...잘되나?
		// JAVA(rogramming Test...잘되나?
		sb.delete(5, 10); //문자열 지우기 5부터 10앞까지
		System.out.println(sb);
				
		// sb.reverse(); // 거꾸로 뒤집기
		// System.out.println(sb);

		// 확보한 메모리 확인	
		System.out.println("capacity->"+sb.capacity());
		
		StringBuffer first = new StringBuffer("Java");
		StringBuffer second = new StringBuffer("JAVA");
		
		// equals();
		// compareTo() : 문자와 문자를 비교하여 정수를 리턴해준다
		//			 "A"			  "B"		  "A"	-  "B"
		int result = first.compareTo(second); // "Java" - "JAVA"
		//			   "B"			    "A"		  "B"	-  "A"
		int result2 = second.compareTo(first);// "JAVA" - "Java"
		// 첫글자는 같음, a=97, A=65, 97-65=32, 순서가 정해졌기에 뒤에있는 v와 a는 신경쓰지않음
		System.out.println("result->"+result+", result2->"+result2);
		
		// 0 : 두 객체의 데이터는 같다
		// 양수 : 왼쪽객체의 데이터가 크다
		// 음수 : 왼쪽객체의 데이터가 작다		
	}

}
