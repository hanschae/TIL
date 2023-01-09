import java.util.Calendar;
import java.util.Scanner;

public class ConsoleCalendarTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) { // 무한루프
			System.out.print("년도=");
			int year = scan.nextInt();
			
			System.out.print("월=");
			int month = scan.nextInt();
			
			if(month>=1 && month<=12) {
			
				System.out.printf("\t\t%d년 %d월\n", year, month);
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				
				Calendar date = Calendar.getInstance(); // 오늘날짜와 시간
				date.set(year, month-1, 1); // 입력받은 년월 1일로 변경
				
				int week = date.get(Calendar.DAY_OF_WEEK); // 요일구하기 1=일, 2=월, 3=화, ...
		
				// 마지막날 구하기
				// 31 : 1, 3, 5, 7, 8, 10, 12 
				// 30 : 4, 6, 9, 11
				
			/* 
				int lastDay = 31;
				switch(month) {
				case 4: case 6: case 9: case 11:
					lastDay = 30; break;
				case 2:
					// 년도가 4의 배수이고 100으로 나눠지지 않을 때 윤년
					// 년도가 400의 배수이면 윤년
					if (year%4==0 && year%100!=0 || year%400==0) {
						lastDay=29;
					}else{
						lastDay=28;
					}
				}
			*/
				
				int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH); // Calendar.DATE 넣어도 무방
										
				// 달력출력
				// 공백
				for(int space=1; space<week; space++) {
					System.out.print("\t");
				}
				
				// 날짜
				for(int day=1; day<=lastDay; day++) {
					System.out.print(day+"\t");
					// 1줄에 7개(공백포함)가 출력되면 줄바꾸기
					if((week-1+day)%7==0) {
						System.out.println();
					}
				}
				System.out.println();
				
				int y = date.getActualMaximum(Calendar.YEAR);
				System.out.println("마지막 년도 >"+y);

			}else{
				System.out.println("월을 잘못입력하였습니다.");
			}
			
		}

	}
	
}
