package basic05_collection;

import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		
	}
	public void start() {
		// LinkedList : 순서를 유지한다(List)
		// 				Queue : 먼저 입력된 객체 먼저 출력되는 기능
		// 				Deque : 양쪽에서 객체를 입력 출력할 수 있다
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.offer(1234);
		ll.offer(5624);
		ll.offer(3322);
		ll.offer(654);
		
		while(!ll.isEmpty()) { // true : 비어있다, false : 객체가 있다.
			int data = ll.poll(); // 객체를 얻어오고 컬렉션에서 지운다
			System.out.println(data+", 남은객체->"+ll.size());
			
			
		}
		
		
	}
	public static void main(String[] args) {
		new LinkedListTest().start();

	}

}
