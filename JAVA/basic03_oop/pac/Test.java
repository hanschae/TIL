package pac; // 반드시 첫번째 명령어

public class Test {
	// 멤버변수 : public, protected, default, private
	int num = 250;
	public String name = "홍길동";
	private String tel = "010-1234-5678";
	public Test() {
		System.out.println("Test()생성자 메소드");
	}
	public void gugudan(int dan) {
		System.out.println("연락처->"+tel);
		for(int i=2; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		output();
	}
	
	private void output() {
		System.out.println(name+","+tel);
	}
	
	
}
