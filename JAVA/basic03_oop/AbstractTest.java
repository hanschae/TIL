
// 추상클래스는 추상 메소드를 1개 이상 포함한 경우를 말한다
// 추상메소드는 반환형 왼쪽에 abstract 키워드를 붙여야한다
// 추상클래스는 class 왼쪽에 abstract 키워드를 붙여야한다
public abstract class AbstractTest {
	int num = 20;
	String name = "홍길동";
	AbstractTest(){}
	
	void setData(int num, String name) {
		this.num = num;
		this.name = name;
	}
	abstract void output(); // 미완성 메소드 : 추상메소드
	abstract void getName();
	
	
	
	
}
