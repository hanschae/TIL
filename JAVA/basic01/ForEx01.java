import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// 중첩 for 문
		for(;;) {
			System.out.print("단을 입력하여주십시오(2~9)");
			int dan = scan.nextInt();
			
			if(dan>=2 && dan<=9) {
				for(int i=2 ; i<=9 ; i++) {
					int result = dan*i;
					System.out.println(dan + " * " + i + " = " + result);
				}	
			}else {
				System.out.println("단을 잘못 입력하였습니다.");
			}
		}
	}
}

 /*
  	2~9외의 단을 입력한 경우 단을 잘못입력하였다는 메세지 출력
  	
	실행
	단 = 6
	6*2=12
	6*3-18
	:
	:
	6*9=54

 */