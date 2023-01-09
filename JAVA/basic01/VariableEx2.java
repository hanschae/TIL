import java.util.Scanner;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		  임의의 정수를 입력받아 1~100 사이의 값이면
		  입력받은 값에 100을 곱하여 출력하고
		  그 외의 값은 0을 출력하라.
		 
			문제풀이
			
			Scanner scan = new Scanner (System.in);
			
			System.out.print("정수를 입력하시오 : ");
			int num = scan.nextInt();
			
			int result = (num>=1 && num<=100)? num*100 : 0;
			
			System.out.println("결과는 = "+ result);
		*/

		
		Scanner s = new Scanner(System.in);
		// 데이터
		int num = s.nextInt();
		// 계산
		num = (num>=1 && num<=100)? num*100 : 0 ;
		// 출력
		System.out.println(num);
	
		
	}

}
