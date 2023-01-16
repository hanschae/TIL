package basic05_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// stack : 한쪽으로 객체를 담거나 꺼낸다. {FILO, LIFO}
		//		   객체를 꺼내면 Stack영역에 지워진다.
	
		Stack<String> s = new Stack<String>();
		s.push("홍길동"); // 5
		s.push("최길동"); // 4
		s.push("강길동"); // 3
		s.push("김길동"); // 2
		s.push("이길동"); // 1
		
		System.out.println("serch()->"+s.search("홍길동")); // 위의 객체부터 번호 매긴다.
		
		System.out.println("empty->"+s.empty()); // 있으면 false, 없으면 true
		System.out.println("size()->"+s.size());
		
		while(!s.empty()) {
			System.out.println(s.pop());
			System.out.println("남은객체수->"+s.size());
			
		
		}
		///
		
		
		
	}
	
	public static void main(String[] args) {
		
		new StackTest();

	}

}
