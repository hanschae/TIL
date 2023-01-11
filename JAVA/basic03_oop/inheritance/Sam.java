package inheritance;

public class Sam {
	public static void main(String[] args) {
		System.out.println(Ex.add(10, 5));
		// System.out.println(Test.add(5, 15));
	}

}

class Test{
	protected static int add(int a, int b) {
		return a+b;
	}
}

class Ex extends Test{
	protected static int add (int a, int b) {
		int x = Test.add(10, 5); // super은 에러. Test에 add 메소드가 없어서 안됨
		return x;
	}
}