package basic04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	
		public MyExceptionTest() {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print("숫자=");
				int n = scan.nextInt();
				// 입력받은 값이 1~100사이의 값이 아니면 MyException예외 발생
				if(n<1 || n>100) {
					// throw new MyException();// 강제 예외발생
					throw new MyException("1부터 100사이의 데이터여야합니다.");// 예외발생
				}
				sum(n);
			}catch(MyException me) {
				System.out.println(me.getMessage());
			}catch(InputMismatchException ie) {
				System.out.println("정수를 입력하여야 합니다.");
			}
	}
	public void sum(int n) {
		int tot=0;
		for(int i=1; i<=n; i++) {
			tot += i;
		}
		System.out.println("1~"+n+"까지의 합은 "+tot);
	}

	public static void main(String[] args) {
		new MyExceptionTest();

	}

}
