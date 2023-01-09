import java.util.Scanner;

public class VariableEx {

	public static void main(String[] args) {
		// 바구니에 사과를 담을 경우 한바구니에는 사과를 10개를 담을 수 있다.
		// 사과가 31개일 때 바구니 수를 구하라.
		
		/*
		int apple = 31;
		
		int basket = (apple % 10 == 0) ? apple/10 : apple/10 + 1;
		System.out.println(basket);
		
		 * 다른방법
		int basketSize = 10; // int b = c = 5 이런 방식도 가능
		int apple = 31;
		
		int basket = (apple%basketSize==0) ? apple/basketSize : apple/basketSize+1 ;
		System.out.println("바구니수 : " + basket);
		*/
		
		//사과의 갯수와 바구니 크기를 입력받아라
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("바구니용량=");
		int basketSize = scan.nextInt();
		System.out.print("사과갯수=");
		int apple = scan.nextInt();
		
		int basket = (apple%basketSize==0) ? apple/basketSize : apple/basketSize+1 ;
		System.out.println("바구니수 : " + basket);
	}

}
