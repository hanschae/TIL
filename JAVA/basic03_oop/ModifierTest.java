import pac.Test;

public class ModifierTest {
	public static void main (String args[]) {
		// public > protected > default(생략했을시) > private
		
		// public : 공용
		// default : 같은 패키지 내에 있는 클래스에게 접근을 허용한다
		
		Test t = new Test ();
		// num은 default이므로 다른 패키지의 클래스에서 접근불가
		// System.out.println(t.num);
		System.out.println(t.name);
		
		t.gugudan(8);
		//System.out.println(t.tel);
		// t.output();
		
	}
}
