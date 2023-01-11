
public class Overloading {

	public Overloading() {
		
	}
	// 오버로딩 : 같은 클래스 내에서 같은 메소드명이 여러개 존재하는 것을 말한다.
	//			매개변수의 갯수나 데이터형이 달라야한다.
	// 1~100까지 합
	public void sum () {
		System.out.println("1~100까지의 합은 5050");
	}
	// 1~?까지 합
	public void sum(int max) {
		int tot = 0;
		for (int i=1; i<=max; i++) {
			tot +=i;
		}
		System.out.println("1~"+max+"까지의 합은 "+tot);
	}
	// 1~?까지 홀수합
	public void sum(int max, String msg) {
		int tot = 0;
		for (int i=1; i<=max; i+=2) {
			tot +=i;
		}
		System.out.println("1~"+max+"까지의 홀수 합은 "+tot);
	}
	// 1~?까지 짝수합
	public void sum(String msg, int max) {
		int tot = 0;
		for (int i=2; i<=max; i+=2) {
			tot +=i;
		}
		System.out.println("1~"+max+"까지의 짝수 합은 "+tot);
	}
	
	
	
		//------------------------------
	
	
	
	public static void main(String[] args) {
		Overloading o = new Overloading ();
		
		o.sum(343);
		o.sum(100,""); // 홀수의 합
		
	}

}
