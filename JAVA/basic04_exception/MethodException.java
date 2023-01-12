package basic04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodException {

	public MethodException() throws InputMismatchException, ArithmeticException{
		start();
	}
	public void start() throws InputMismatchException, ArithmeticException{
		sum();
	}
	public void sum() throws InputMismatchException, ArithmeticException {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
		inData();
	}
	public void inData() throws InputMismatchException, ArithmeticException {
		Scanner s = new Scanner (System.in);
		System.out.print("정수입력=");
		int i = s.nextInt();//0
		result(i);
	}
	public void result(int i) throws ArithmeticException {
		int output = 100 / i;
		System.out.println("output="+output);
	}
	
	public static void main(String[] args) {
		try {
			new MethodException();
		}catch(InputMismatchException ie) {
			System.out.println("InputMismatchException가 발생함.");
		}catch(ArithmeticException a) {
			a.printStackTrace();
		}
		
	}

}
