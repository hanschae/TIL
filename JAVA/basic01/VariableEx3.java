import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("메뉴(1.사각형의 넓이, 2.사각형의 둘레)?");
		int menu = scan.nextInt();
		
		System.out.print("가로(밑변)=");
		int w = scan.nextInt();
		
		System.out.print("세로(높이)=");
		int h = scan.nextInt();
		
		int result = (menu == 1)? w*h : (w+h)*2 ;
		
		String label = (menu == 1)? "넓이" : "둘레" ;
		
		System.out.println("사각형의" + label + " = " + result);
		
		
		
		
		
	}

}

/*
 사각형의 넓이 = 가로 * 세로
 사각형의 둘레 = (가로+세로)*2



 실행결과
 메뉴(1.사각형의 넓이, 2.사각형의 둘레)?	1
 가로(밑변)=6
 세로(높이)=5
 사각형의 넓이 = 30
 
 ----------------------------------------
 
 실행결과
 메뉴(1.사각형의 넓이, 2.사각형의 둘레)?	2
 가로(밑변)=6
 세로(높이)=5
 사각형의 둘레 = 22
 

*/
