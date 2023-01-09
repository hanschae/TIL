import java.util.Scanner;

public class StandardWeightTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 기본 데이터 구하기
		System.out.print("나이->");
		int age = scan.nextInt();
		System.out.print("성별(1.남, 2.여)->");
		int gender = scan.nextInt();
		System.out.print("키(cm)->");
		double height = scan.nextDouble();
		System.out.print("몸무게(kg)->");
		double weight = scan.nextDouble();
				
		// 2. 계산
		// - 표준체중
		double standardWeight = 0.0;
		
		if (age<=35 && gender==2) { // 35세 이하 여성
			standardWeight = (height-100) * 0.85;
		}else if (age>=36 && gender==1) { // 36세 이상 남성
			standardWeight = (height-100) * 0.95;			
		}else {
			standardWeight = (height-100) * 0.9;
		}
		
		// - 표준체중지수
		double standardIndex = (weight/standardWeight) * 100;
		
		String body="";
		if(standardIndex<86) {
			body = "마른형";
		}else if(standardIndex<96) {
			body = "조금마른형";
		}else if(standardIndex<116) {
			body = "표준형";
		}else if(standardIndex<126) {
			body = "조금비만형";
		}else{
			body = "비만형";
		}
		
		// 3. 결과출력
		System.out.println("표준체중="+standardWeight);
		System.out.printf("당신의 표준체중지수는 %f로 %s입니다.", standardIndex, body);
	}

}
