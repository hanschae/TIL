package basic02_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.print("이메일=");
			String email = scan.nextLine();
			
			// @필요, .필요, @. 불가
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			if (atMark<3 || point<atMark || Math.abs(atMark-point)<=2) { // 잘못된 이메일 찾기
				System.out.println(email+"은 잘못된 메일입니다.");
			}else{ // 정상 이메일
				// split(), substring(), StringTokenizer
				// split
				/*
				String emailSplit [] = email.split("@");
				System.out.println("아이디="+emailSplit[0]);
				System.out.println("도메인="+emailSplit[1]);
				*/
				
				// substring()
				/*
				String id = email.substring(0, atMark);
				String domain = email.substring(atMark+1);
				System.out.println("아이디="+id);
				System.out.println("도메인="+domain);
				*/
				
				// StringTokenizer
				StringTokenizer emailobj = new StringTokenizer(email, "@");
				String id = emailobj.nextToken();
				String domain = emailobj.nextToken();
				System.out.println("아이디="+id);
				System.out.println("도메인="+domain);
			}
			System.out.println("계속하시겠습니까? (Y,N)");
			if(!scan.nextLine().equalsIgnoreCase("Y")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}while(true);
		
	}

}

/*

	실행
	
	이메일=legochj@naver.com
	아이디=legochj
	도메인=naver.com
	다시하시겠습니까?(Y,N)
	
	이메일=addd.@com
	잘못된 이메일주소입니다.
	다시하시겠습니까?(Y,N)


*/