package inheritance;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		double n = 5.25;
		int i = (int)n;
		
		Sedan s = new Sedan ();
		Car c= new Car ();
		Car cc = new Sedan ();
		// Sedan ss = new Car (); 에러
		Object obj = new Sedan ();
		
		// 하위클래스의 오버라이딩은 상위클래스로 형변환 되어도 하위클래스의 메소드 기능이 구현된다.
		
		cc.speedUp ();
		System.out.println("cc.speed ="+cc.speed);
		
		// cc.speed(20); 에러
		
		Sedan sss = (Sedan)cc;
		sss.speedUp(30);
		
		 Object oo = new Sedan ();
		 // oo.speedUp(); 에러
		 Sedan ssss = (Sedan)oo;
		 ssss.speedUp();
		 
		 // Object는 전부 담기 가능
		 Object o1 = new String();
		 Object o2 = new Scanner (System.in);
		 
		// o2.nextInt(); 에러
		 Scanner scan = (Scanner)o2;
		 scan.nextInt();
	}

}
