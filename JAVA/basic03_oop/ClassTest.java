// package : 폴더
import java.util.Scanner;

public class ClassTest {

		// class 영역 : 선언된 변수, 상수들은 멤버변수(전역변수)
		int num = 1234; // 첫번째 아니어도 된다
		final int MAX = 100; // 상수화된 변수 : 값 변경 불가. 변수명을 모두 대문자로 한다
							 // Math.PI , Calendar.YEAR , ...
		Scanner scan = new Scanner(System.in);
		
		// 생성자 메소드 : 객체를 생성하는 방법
		// 규칙 : 메소드명이 반드시 클래스명이랑 같아야 한다
		//		 객체생성시 한번 실행 (객체생성할 때 초기환경을 만들어 줄 수 있다.)
		//		 반환값이 없다.
		ClassTest() {
			//실행문이 들어가는 곳. 변수, 수식, if, for, while, 배열, ...
			System.out.println("ClassTest()생성자 메소드");
		}
		
		ClassTest(int num) {
			this.num = num; // this : 현재 클래스
			System.out.println("ClassTest(int)생성자 메소드");
		}
		
		ClassTest(String name, int num) {
			System.out.println("이름="+name+", 나이="+num);
		}
		
		ClassTest(int num, String name) {
			// 생성자 메소드에서 다른 생성자 메소드 실행하기
			// 첫번째 줄의 실행문이여야  한다.
			this(name, num);
			System.out.println("fdfdfd");
		}
		// 메소드 : 기능구현
		//		   소문자로 시작한다.
		//		   반환값이 있을수도 없을수도 있다. 반환값이 없을때는 void 키워드로 대치한다
		//		   매개변수는 데이터형 또는 갯수가 달라야 한다.
		// 형식 : 반환값 메소드명(매개변수){실행문;}
		void sum(){ //1~100까지의 합을 구하는 기능이 있는 메소드
			int tot = 0;
			for (int i=0; i<=100; i++) {
				tot += 1;
			}
			System.out.println("1~100까지의 합은 "+tot);
		}
		String total(int a) {
			System.out.println("정수입력=");
			a = scan.nextInt();
			int tot = 0;
			for (int i=1; i<=a; i++) {
				tot = tot + i;
			}
			return "1~"+a+"까지의 합은 ->"+tot;
		}
		// 클래스의 멤버에 정의 내부클래스
		// 메소드내에 정의하는 내부클래스
		// 익명의 내부클래스
		class Test{
		
		}

}
