
public class Array05 {

	public static void main(String[] args) {
		// 2차원 배열의 초기값 설정하기
		int score[][] = new int [][] {{8,9,3},
									  {90,73,81},
									  {50,9,80}};
		int data [][] = {{90,50,60},
						 {50,50,60},
						 {90,80,70},
						 {80,90,50},
						 {70,80,70}};
		
		// System.out.print("국어\t영어\t수학\t총점\t평균\n");
		String title[] = {"국어","영어","수학","총점","평균"};
		
		// 확장된 반복문
		// 데이터타입 변수 : 배열, 컬렉션
		
		for (String t : title) { // title에서 차례대로 객체를 꺼내서 A에 넣겠다, title에서 꺼낼 객체가 없을때까지
			System.out.print(t+"\t");
		}
		System.out.println();
		
		for(int i=0; i<data.length; i++) {
			
			int sum=0;
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+"\t");
				sum += data[i][j];
			}
			
			int ave = sum / data[i].length;
			System.out.print(sum + "\t" + ave);
			System.out.println();
		}
		
	}

}