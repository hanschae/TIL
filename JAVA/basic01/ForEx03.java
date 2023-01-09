import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 내 버전
		System.out.print("임의의 정수=");
		int max = scan.nextInt();
		
		int sum = 0; // 정수의 합
		int osum = 0; // 홀수의 합
		int esum = 0; // 짝수의 합
		
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		
		for(int j=1; j<=max; j+=2) {
			osum += j;
		}
		
		for(int k=2; k<=max; k+=2) {
			esum += k;
		}
		
		System.out.printf("1~%d까지의 합은 %d\n", max, sum);
		System.out.printf("1~%d까지의 홀수의 합은 %d\n", max, osum);
		System.out.printf("1~%d까지의 짝수의 합은 %d\n", max, esum);
		*/
		
		// 강사님 버전
		System.out.print("임의의 정수=");
		int max = scan.nextInt();
		
		// 합을 구해서 누적시킬 변수들
		int sum=0, oddSum=0, evenSum=0;
		
		for(int i=1; i<=max; i++) { // 1
			// sum = sum + i; // ==전체합 sum+=i;
			if (i%2==0) { // 짝수
				evenSum +=i;
			}else { // 홀수
				oddSum += i;
			}
		}
		sum = evenSum + oddSum;

		System.out.println("1~"+max+"까지의 합은 "+sum);
		System.out.println("1~"+max+"까지의 홀수의 합은 "+oddSum);
		System.out.println("1~"+max+"까지의 짝수의 합은 "+evenSum);
	}
	
}

/*
	실행
	임의의 정수=100
	1~100까지의 합은5050
	1~100까지의 홀수의 합은 2500
	1~100까지의 짝수의 합은 2550
*/