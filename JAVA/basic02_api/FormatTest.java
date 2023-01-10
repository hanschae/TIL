package basic02_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		// 정수(int)를 문자열로 만들기
		int won = 5475483; // 5,475,483원
		
		// won의 값을 화폐단위로 만들기
		DecimalFormat fmt = new DecimalFormat("###,###원");
		String wonResult = fmt.format(won);
		System.out.println(wonResult);
		
		// 문자데이터를 숫자로 바꾸기
		try {
			NumberFormat nf = NumberFormat.getInstance();
			Number n = nf.parse(wonResult);
			int result = n.intValue();
			System.out.println(result);
		}catch(ParseException pe) {
			System.out.println(pe.getMessage());
		}
		
		// 날짜 패턴
		// 2022-06-15(수) 16:52:22
		// 2022-06-15(수) 04:52:22 오후
		Calendar now = Calendar.getInstance();
		
		SimpleDateFormat dateFmt = new SimpleDateFormat ("yyyy-MM-dd(E) hh:m:ss a");
		String dateTxt = dateFmt.format(now.getTime());
		System.out.println(dateTxt);
		
		// 이름 : 홍길동, 연락처 : 010-1234-5678, 주소 : 서울시 강남구 역삼동
		String name = "홍길동";
		String tel = "010-1234-5678";
		String addr = "서울시 강남구 역삼동";
		// print(), println(), printf()
		// static String 	format(String pattern, Object ... arguments)
		String msg = MessageFormat.format("이름 : {0}\n연락처 : {1}\n주소 : {2}", name, tel, addr);
		System.out.println(msg);
	}

	public static void main(String[] args) {
		new FormatTest();

	}

}
