import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();
		// 로또번호 생성기
		do {
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			for(int i=1;i<=cnt;i++) { // 1,2,3,...,cnt
				int lottery [] = new int [7]; // 로또번호+보너스번호를 담을 공간
				
				for(int j=0;j<lottery.length;j++) { // 0,1,2,3,4,5,6
					//		 0
					lottery [j] = random.nextInt(45)+1 ; //번호 생성 1~45 (45-1+1) +1
					
					// 현재 번호 이전에 만들어진 번호와 현재 생성된 번호와 중복검사
					for (int c=0; c<j; c++) {
						if (lottery[j] == lottery[c]) {
							j--; // 1->0; 2->1;
							break;
							
						}						
					}
				}
				// 게임 정렬 (보너스는 정렬 제외)
				
				Arrays.sort(lottery, 0, 6); // index가 0에서 6이전까지만 정렬
				//System.out.println(Arrays.toString(lottery));
				System.out.println(i+" 게임 = "+Arrays.toString(Arrays.copyOfRange(lottery, 0, 6))+" , bonus = "+lottery[6]);
				
			}
						
			System.out.println("계속하시겠습니까? (1.예, 2.아니오)");
			int qna = scan.nextInt();
			
			if(qna!=1) break; // 1외의 값이 들어오면 프로그램을 중지한다
			
		}while(true);
		
	} // main

}
