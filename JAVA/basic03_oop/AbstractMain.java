// 추상클래스는 반드시 상속받아 추상메소드를 오버라이딩하여 사용하여야 한다
public class AbstractMain extends AbstractTest{

	AbstractMain(){}	
	
	// 추상메소드 오버라이딩(메소드 재정의)
	
	void output() {
		System.out.println("번호="+num);
		System.out.println("이름="+name);
	}
	void getName() {}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		am.output();
		

	}

}
