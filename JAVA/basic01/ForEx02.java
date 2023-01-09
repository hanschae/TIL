
public class ForEx02 {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {// i=1,2,3,4,5,...,100
			
			// 3의 배수아님 && 5의 배수아님
			if (i%3!=0 && i%5!=0) {
				System.out.println(i);
			}
			
		}

	}

}

 /*
  
  실행
  1
  2
  4
  7
  8
  11
  13
  14
  16
  17
  : 
  :
  100

 */