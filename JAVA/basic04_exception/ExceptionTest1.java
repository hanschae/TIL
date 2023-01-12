package basic04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public ExceptionTest1() {
		
	}
	public void start() {
		Scanner scan = new Scanner (System.in);
		
		try { // 예외가 발생가능한 코드 + 예외 발생가능성이 없는 코드
			System.out.print("첫번째정수=");
			int first = scan.nextInt(); //InputMismatchException
			System.out.print("두번째정수=");
			int second = scan.nextInt();
			
			System.out.printf("first=%d, second=%d\n", first, second);
			
			int result = first / second; // 어떤수를 0으로 나눌 수 없다
			System.out.println(first+"/"+second+"="+result);
			
			int data[] = {7,9,2,4,8,5};
			for(int i=0; i<data.length; i++) { // i<=data.length 시에는 0,1,2,3,4,5,6 그리고 aiob 실행
				System.out.println("data["+i+"]="+data[i]);
			}
			
		}catch(InputMismatchException ime) { // 예외발생시 처리하는 부분
			System.out.println("정수를 입력하셔야 합니다.");
			// ime변수 발생한 예외 객체가 담겨있다
			
			System.out.println(ime.getMessage()); // null
			ime.printStackTrace(); // printStackTrace 안에 Sysout은 있다
			
		}catch(ArithmeticException ae) {
			System.out.println("second변수를 값을 0으로 입력했을때");
			System.out.println(ae.getMessage()); // / by zero
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("배열 index가 잘못되었습니다.");
			System.out.println(aiob.getMessage()); 
		}finally { //예외가 발생하든 안하든 무조건 실행됨
			System.out.println("finally는 무조건 실행됨");
		}
		
				
		System.out.println("End...");
	}
	public static void main(String[] args) {
		new ExceptionTest1().start();

	}

}
/*
	try{
		예외가 발생할 가능성이 있는 코드
		
	}catch(예외종류){
		예외가 발생했을때 처리하는 곳
	}
	-->



*/