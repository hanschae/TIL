
public class For01 {

	public static void main(String[] args) {
		for(int i=3; i<=10; i+=3) {
			System.out.println(i);
		}
		
		for(int i=3; i<=10; i++) {
			if(i%3==0) { // 3 6 9
				System.out.println(i);
			}
		}
		System.out.println("-------------------------");
		
		for(int i=10; i>=1; i--) { // 10 9 8 7 6 5 4 3 2 1
			
			System.out.println(i);
		}
		
		//for(; ;) {
			//System.out.println("실행중...");
		//}
	}	

}
/*
 1
 2
 3
 4
 5
 
 for(초기값 ; 최종값(조건식) ; 증감식){
 	실행문;
 	if, switch
	출력문
	계산식
	변수선언
	:	
 }


*/