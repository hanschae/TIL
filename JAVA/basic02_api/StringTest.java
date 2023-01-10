package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "채한준";
		String name2 = "채한준";
		
		String addr = new String("서울시 서초구 서초동");
		String addr2 = new String("서울시 서초구 서초동");
	
		// == : 같으냐
		if(name==name2) {
			System.out.println("name과 name2는 같다");
		}else {
			System.out.println("name과 name2는 다르다");
		}
		
		if(addr==addr2) {
			System.out.println("addr과 addr2는 같다");
		}else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		String addr3 = addr2;
		if(addr2==addr3) {
			System.out.println("addr2와 addr3는 같다");
		}else {
			System.out.println("addr2와 addr3는 다르다");
		}
		
		// equals() : 객체내의 값을 비교해준다. (대소문자 구별)
		String addr4 = new String("서울시 서초구 서초동(dong)");
		String addr5 = new String("서울시 서초구 서초동(Dong)");
		
		boolean boo = addr5.equals(addr4); // = addr4.equals(addr5)
		if (boo) {
			System.out.println("addr4 와 addr5는 같다");
		}else {
			System.out.println("addr4 와 addr5는 다르다");
		}
		// equalsIgnoreCase() : 값을 비교해준다. (대소문자 구별 X)
		if (addr4.equalsIgnoreCase(addr5)) {
			System.out.println(("같다(대소문자구별X)"));
		} else {
			System.out.println("다르다(대소문자구별O)");
		}
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt()->" + addr4.charAt(5)); // index 위치의 문자를 반환한다
		
		System.out.println("concat()->" + addr4.concat(name)); // 문자연결
		addr4 = addr4.concat(name);
		System.out.println("concat()->" + addr4.concat(name));
		
		
		String txt = "Hello!";
		byte txtCode [] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
		// 아스키코드 H:72 e:101 l:108 o:111 !:33
		
		int idx = addr4.indexOf("서"); // 서울시 서초구 서초동(dong)채한준
		System.out.println("indexOf->"+idx);
		System.out.println("lastIndexOf->"+addr.lastIndexOf("서"));
		System.out.println("indexOf->"+addr4.indexOf("서",5)); // index5 이후로 서를 찾아라
		System.out.println("indexOf->"+addr4.indexOf("강남구")); // 없는 문자일때 -1
		System.out.println("length->"+addr4.length());
		System.out.println(("repeat->"+addr4.repeat(4)));
		System.out.println("*".repeat(50));
		
		addr4= addr4.replaceAll("서초구", "SeoChoGu");
		System.out.println("replaceALL->"+addr4);
		
		String tel = "010---1234-5678";
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit));
		
		// substring : 문자열에서 일부의 문자열을 얻을 때
		//							 012345678901234 567
		String addrsub = new String("Seoul SeoChoGu 서초동");
		String sub1 = addrsub.substring(6, 14); // 시작위치 6, 끝위치 13
		System.out.println("substring(int, int)->"+sub1);
		String sub2 = addrsub.substring(10);
		System.out.println("substring(int)->"+sub2); // 시작위치 10, 끝까지 구한다
		
		System.out.println("lower->"+addrsub.toLowerCase()); // 문자열을 소문자로 변환해 반환
		System.out.println("upper->"+addrsub.toUpperCase()); // 문자열을 대문자로 변환해 반환
		
		// "2500"				  2500
		String x = String.valueOf(2500)+ 500; // 객체를 String으로 형변환
		System.out.println(x);
		
		char c[] = {'J', 'a', 'v', 'a'}; // "Java"
		System.out.println(c); //밑에 int d[] 처럼 출력되지 않는다
		System.out.println(String.valueOf(c));
		
		int d[] = {23,45,67,88};
		System.out.println(d);
		
		String data = "		Test		Programming		";
		System.out.println("data->"+data.trim()+"?"); // 양쪽 끝의 공백문자를 지운다
	}

}
