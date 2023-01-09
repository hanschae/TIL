
class Operator01 {

	public static void main(String[] args) {
		// 산술 : +, =, *, /(나누기), %(나머지)

		int num1 = 10;
		int num2 = 3;
		
		// 정수+정수 = 정수
		// 정수+실수 = 실수
		// 실수+실수 = 실수
		
		int result = num1 / num2; // 3
		double result2 = num1 / (double)num2; // 3.33333
		int result3 = (int)(num1 / (double)num2); // 3
		
		System.out.println(result+", "+result2+", "+result3);
		
		// 증감연산자 : ++,--
		
		int a = 10;
		
		// 1 증가
		// a++; 나 ++a; 나 단독사용시 증감연산자가 어디있든 결과는 같음
		// a = a+1; // a = 1 + a;
		a += 1;
		
		System.out.println("a="+a);
		
		// 1 감소
		// a--;
		// --a;
		// a = a - 1;
		a -= 1;
		System.out.println("a="+a);
		
		int b = 5;
		
		int r1 = b++ + 100; // b = 6, r1 = 105
		System.out.println("b="+b+", r1="+r1);
		
		int r2 = ++b + 100; // b = 7, r2 = 107
		System.out.println("b="+b+", r2="+r2);
		
		// 연산자 ++가 대입문 내 수식으로 들어갈때, 위치에 따라 차이가 있음
		// b++ 처럼 변수 오른쪽에 위치 시 산술계산 후 ++이 진행
		// ++b 처럼 변수 왼쪽에 위치 시 ++증감 후 산술계산
		// 괄호가 있으면 괄호우선
		
		int t = 3;
		int r = 5 / 7 + 10 % 2 - 3 + t++ * 2;
		System.out.println("t=" + t + ", r=" + r);
		
		// 비교(관계)연산자 ==, !=, >, <, >=, <=
		
		boolean r3 = b >= t; // true or false b=7, t=4
		System.out.println("r3="+r3);
		
		boolean r4 = a > b + t * 2; // a= 10, b=7, t=4 false
		System.out.println("r4="+r4);
		
		System.out.println("-----구분선-----");
		
		// 논리 연산자 : &&(and), ||(or) *and가 or보다 우선
		// 1~100 값이면 true, 아니면 false의 식을 세워보자
		// 1<= data <= 100
		
		int data = 50;
		
		boolean r5 = data>=1 && data<=100;
		System.out.println("r5="+r5);
		
		// 삼항연산자 : 변수 = (조건식)? 참 : 거짓 ;
		// (조건식)?A:B 조건에 따라 A나 B를 선택
		
		int x = 5;
		String r6 = (x%2==1)?"odd":"Even"; // 홀짝 판별기
		// String r6 = (x/2==x/2.0)?"Even":"Odd"; 도 가능
		
		System.out.println("r6="+r6);
		
		// 짝수일때는 100 곱하고 홀수일땐 -100 하기
		int r7 = (x%2==1)? x-100 : x*100 ;
		System.out.println("r7="+r7);
		
		// 양수 : "positive:, 음수 : "Negative:, 0 : "Zero"
		// 삼항연산자 안에 삼항연산자를 사용가능
		String r8 = (x>0) ? "Positive" : (x<0)? "Negative" : "Zero" ;
		System.out.println("r8="+r8);
		
		
	}

}
