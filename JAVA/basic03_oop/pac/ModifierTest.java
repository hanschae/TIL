package pac;

public class ModifierTest {
	Test t = new Test();
	ModifierTest(){
		// 같은 클래스에서만 접근이 가능한 변수이기 때문에 사용이 불가능하다
		// System.out.println(t.tel);
		// t.output();
	}
}
