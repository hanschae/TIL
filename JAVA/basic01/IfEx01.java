import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액입력 = ");
		int money = scan.nextInt();
		
		if (money>=10000) {
			
			// int result = (money%10==0)? money : money-(money%10) ;
			// 코딩은 간단한게 최고
			int result = money/10*10; // 정수형이므로 나누기 시 소숫점 사라짐
			
			System.out.println("결과 = "+result);
		}

	}

}

/*
if문 사용하기
입력받은 값이 10000 이상일때만 마지막자리값을 0으로 바꿔서 출력하라.

실행
금액입력 = 26315
결과 = 26310

금액입력 = 568259
결과 = 568250

*/
