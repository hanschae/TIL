import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		// int a=50;
		// if(a>100) System.out.println(a);
		// 실행문이 한줄일 경우 중괄호 생략 가능
		// 실행문이 한줄일 경우 옆에 붙여 쓰기도 가능
		
		Scanner scan = new Scanner (System.in);
		
		// 문제) 임의의 값이 1~100 사이면 임의의 값을 출력하고
		//		그외의 값(양수(100초과),음수) 양수로 만들어 출력하라.
		
		System.out.print("정수입력=");
		int data = scan.nextInt();
		
		if (data>=1 && data<=100) {
			System.out.println("data-> "+data);
		}else { // 100보다 클때, 1보다 작을때
			// 음수가 들어올 경우, 부호를 양수로 변경하는 식
			/*
			if (data<0) {
			 data = -data;
			}
			*/
			data = Math.abs(data); // 절대값 구하기
			
			System.out.println("data(else)->"+data);
		}

	}

}

/*

 if(조건문){
 	//조건문이 참일때 실행문;
 	;
 	;
 	
 }else{
 	//조건문이 거짓일때 실행문;
 	;
 	;
 
 }

 */