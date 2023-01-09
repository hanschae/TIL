import java.util.Scanner;

public class IfElseIfEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 국어, 영어, 수학점수
		int k, e, m, t;
		double a;
		String grade;
		
		System.out.print("국어점수=");
		k = scan.nextInt();
		System.out.print("영어점수=");
		e = scan.nextInt();
		System.out.print("수학점수=");
		m = scan.nextInt();
		
		t = k + e + m;
		a = (double) t / 3;
		
		if (a>=90) {
			grade = "A";			
		}else if (a>=80) {
			grade = "B";
		}else if (a>=70) {
			grade = "C";
		}else if (a>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
	
		System.out.println("총점="+t);
		System.out.println("평균="+a);
		// 평균은 소수이하 2자리까지 출력하라.
		System.out.printf("평균=%.2f\n", a); // 총 자릿수를 지정안해도 됨
		System.out.println("학점="+grade);
	}

}

/*  문제
	
	90~100 A
	80~89  B
	70~79  C
	60~69  D
	0~50   F
	
	실행결과
	국어점수=80
	영어점수=90
	수학점수=80
	총점=250
	평균=83.3
	학점=B

*/