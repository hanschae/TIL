package basic02_api;

public class MathTest {

	public static void main(String[] args) {
		
		// abs 절댓값
		System.out.println("abs->"+Math.abs(-9.36));
		
		// ceil 올림
		System.out.println("ceil->"+Math.ceil(41.21));
		
		// floor 버림
		System.out.println("floor->"+Math.floor(147.9));
		
		// round 반올림
		System.out.println("round->"+Math.round(14.49));
		
		// max min 둘 중 큰/작은 값
		
		int first = 300;
		int second = 400;
		if (first > second) {
			System.out.println(first);
		}else { // second
			System.out.println(second);
		}
		
		System.out.println("max->"+Math.max(first, second));
		System.out.println("min->"+Math.min(first, second));
		
		// pow 거듭제곱
		System.out.println("pow->"+(int)Math.pow(5, 3));
		// 형변환 (int)를 붙여 실수형을 정수형으로
		
		// sqrt 루트 구하기
		System.out.println("sqrt->"+Math.sqrt(9));
		
		// random 무작위숫자 난수
		System.out.println("random->"+((int)(Math.random()*6)+1));
		// random 의 범위는 0.00...01 ~ 0.99...99
		// 10을 곱하면 범위는 0~9   45를 곱하면 0~44
		// 주사위 숫자를 구하고 싶으면 6 > 0~5 에 +1
	}

}
