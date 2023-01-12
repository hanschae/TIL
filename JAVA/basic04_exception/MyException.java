package basic04_exception;

// 예외클래스를 생성하기 위해서는 Exception 상속받아 만들수 있다
public class MyException extends Exception{

	public MyException() {
		// 상위클래스인 Exception에 생성자메소드를 호출하여 에러 메세지를 세팅한다
		super("1~100사이의 값의 범위를 벗어났습니다.");
		
	}
	public MyException (String msg) {
		super(msg);
		
	}
}
