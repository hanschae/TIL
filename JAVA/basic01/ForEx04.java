import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 수 = ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=1;;i++) {
			sum += i; // sum = sum + i;
			if (sum>=num) {
				System.out.printf("1~%d까지의 합은 %d\n", i, sum);
				break;
			}
			
		}
		
	}
	
}

/*
 
 실행결과
 임의의 수 = 25326
 1~____까지의 합은 25400
 
*/