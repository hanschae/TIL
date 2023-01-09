
public class For03 {

	public static void main(String[] args) {
		
		// break : 반복문의 실행을 중지시킨다.
		
		for(int i=1;;i++) {
			System.out.println(i);
			if(i>=10) {
				break;
			}
		}
		
		System.out.println("--------------------");
		
		// continue : 반복문내의 실행문을 한번 건너뛴다.
		
		for(int i=1;i<=100;i++) {
			if(i>=10) {
				continue;
			}
			System.out.println(i);
			
		}
	}
}

