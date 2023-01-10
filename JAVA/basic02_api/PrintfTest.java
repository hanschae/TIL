package basic02_api;

public class PrintfTest {

	public static void main(String[] args) {
		// 출력시 문자열 또는 숫자를 자릿수를 지정하여 출력할 수 있다.
		
		// InputStream 클래스의 print(), println(), printf()
		
		// format 의 f
		
		// 제어문자 : \", \', \t:tap, \n:줄바꿈
		// 나의 이름은 채한준입니다.
		// 나의 이름은 "채한준"입니다.
		
		System.out.println("나의 이름은\n \"채한준\"입니다.");
		// \n 으로 줄바꿈
		
		
		int a = 125;
		double b = 235.2356485;
		String name = "홍길동";
		System.out.println(a);
		
		//               (pattern, 변수);
		//decimal 십진수   정수:%d 실수:%f 문자열:%s 1문자:%c
		
		System.out.printf("a변수의 값은 %-10d입니다.\n",a); // printf에는 줄바꿈없음
		System.out.printf("%10.3f\n", b); // 소숫점 포함 10칸, 소숫점 밑 3자리
		System.out.printf("나의\t이름은 \"%5s\"입니다.", name ); // 이름포함 5칸
		System.out.printf("\n%5s", "ABC");
		System.out.printf("\n%4c", 'z');
		
		System.out.printf("\na=%5d, b=%7.2f, name=%s",a,b,name);
	}

}