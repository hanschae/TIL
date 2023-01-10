package basic02_api;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar 클래스는 new로 객체 생성을 할 수 없다.
		// getInstance()메소드를 이용하여 객체를 구한다.
		
		Calendar now = Calendar.getInstance(); // 오늘날짜+시간관련정보
		
		// 날짜 변경하기
		// now.set(2023,5,12);
		// now.set(2022,10,2,10,25);
		// now.set(2022,0,13,12,00,00);
		now.set(Calendar.YEAR,2021);
		
		// Calendar 객체에서 날짜 또는 시간정보를 얻어오기
		// 2022-06-03(금) 17:15
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;// 0->1월, 1->2월, 3->4월...
		int day = now.get(Calendar.DATE);// DAY_OF_MONTH
		int week = now.get(Calendar.DAY_OF_WEEK);// 1->일, 2->월, 3->화...
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
				
		String weekName = "";
		switch(week) {
		case 1: weekName="일"; break;
		case 2: weekName="월"; break;
		case 3: weekName="화"; break;
		case 4: weekName="수"; break;
		case 5: weekName="목"; break;
		case 6: weekName="금"; break;
		case 7: weekName="토"; break;		
		}
		
		System.out.printf("%d-%d-%d(%s) %d:%d:%d\n",year,month,day,weekName,hour,minute,second);
		System.out.println(now);
		
	}

}
