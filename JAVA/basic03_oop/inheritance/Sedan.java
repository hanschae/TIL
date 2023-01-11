package inheritance;

// extends : 클래스를 상속받을때 (1개만 상속가능)
public class Sedan extends Car {
	 String color = "Red";
	public Sedan () {
		// 하위클래스의 생성자 메소드에서 상위클래스의 생성자 메소드를 호출하는 기능
		// 반드시 첫번째 실행문으로 기술
		super("Lightblue","쏘렌토"); // this()
		System.out.println("Sedan() 생성자 메소드");
	}
	public Sedan(String color) {
		// 상속관계의 this는 현재 클래스가 우선권을 갖지만,
		// 현재 클래스에 없을경우 상위 클래스에서 찾는다.
		// this.color = color;
		
		// 상위클래스 하위클래스에 같은 멤버변수가 존재할때
		// 상위클래스를 멤버변수를 지정한다.
		super.color = color;
		System.out.println(this.color+","+super.color);

	}
	
	// override : 상속관계에서 하위클래스에 메소드를 재정의
	public void speedUp() {
		speed += 10;
		if (speed>=200) speed=200;
	}
	
	// speedUp overloading
	public void speedUp (int lbl) {
		speed += lbl;
		if (speed>=200) speed=200;
	}
	
	
	
	// ------------------------------
	/*
	public static void main (String arg[]) {
		
		// 상속관계에서 생성자 메소드는 상위클래스 생성자가 먼저 실행
		
		Sedan s = new Sedan(); 
		System.out.println("color="+s.color);
		s.speedUp();
		System.out.println("speed="+s.speed);
		// ------------------------------
		Sedan ss = new Sedan("Blue");
		System.out.println("Sedan.color="+ss.color);
		
	}
	*/
}
