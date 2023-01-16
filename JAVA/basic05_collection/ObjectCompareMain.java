package basic05_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {
	List<MemberVO> list = new ArrayList<MemberVO>();
	public ObjectCompareMain() {
		
	}
	public void start() {
		list.add(new MemberVO(1200,"홍길동","기획부","010-1234-6953"));
		list.add(new MemberVO(2000,"이순신","총무부","010-1111-3434"));
		list.add(new MemberVO(5000,"세종대왕","인사부","010-5981-6953"));
		list.add(new MemberVO(3000,"장영실","교무부","010-4321-8555"));
		list.add(new MemberVO(1000,"류승룡","외교부","010-9897-6953"));
		
		System.out.println("==========정렬전==========");
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========사원번호를 오름차순으로==========");
		Collections.sort(list, new CompareNumAsc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========사원번호를 내림차순으로==========");
		Collections.sort(list,new CompareNumDesc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========사원명으로 오름차순으로==========");
		Collections.sort(list, new CompareUsernameAsc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========사원명으로 내림차순으로==========");
		Collections.sort(list, new CompareUsernameDesc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
	}
	
	
	
	//사원명을 내림차순으로 정렬
	class CompareUsernameDesc implements Comparator<MemberVO>{
		
		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//			이순신						홍길동
			return v2.getUsername().compareTo(v1.getUsername());
		}
		
	}
	
	//사원명(문자열)을 오름차순으로 정렬
	class CompareUsernameAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			// 0  : 교환안함
			// 1  : 교환
			// -1 : 교환안함
			//		홍길동						이순신
			return v1.getUsername().compareTo(v2.getUsername());
		}
		
	}
		
	// 사원번호를 내림차순정렬
	class CompareNumDesc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//		1000		1200
			return (v1.getNum()<v2.getNum())? 1 : (v1.getNum()>v2.getNum())? -1 : 0;
		}
		
	}
	
	// 사원번호를 오름차순으로 정렬하는 내부 클래스 (인터페이스 : Comparator)
	class CompareNumAsc implements Comparator<MemberVO>{
		
		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//0							> 교환안함
			// 양수  1200-1000 = 200		> 교환
			// 음수  1000-1200 = -200		> 교환안함
			
			//		1200		2000
			return (v1.getNum()<v2.getNum())? -1 : (v1.getNum()>v2.getNum())? 1 : 0;
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectCompareMain().start();
	}

}
