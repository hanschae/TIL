
public class Array02 {

	public static void main(String[] args) {
		// 배열의 생성과 동시에 데이터를 설정하는 방법
		
		int data[] = new int[] {12,8,6,4,9,78};
		int data2[] = {52,12,25};
		String data3[] = {"홍길동","이순신"};
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i +"]=" + data[i]);
			
		}

	}

}
