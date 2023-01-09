
public class Array04 {

	public static void main(String[] args) {
		// 2차원 배열 선언하기
		// 데이터 타입이 같은 변수를 선언할 때
		
		int data[][] = new int [4][3];
		int[][] data2;
		
		data[2][1] = 60;
		data[1][0] = 80;
		
		System.out.println(data[2][1]);
		
		System.out.println("-----구분선-----");
		
		// data.length : 2차원배열의 행의 수
		for(int i=0; i<data.length ;i++) { // 행 0,1,2,3
			//data[i].length : i행의 칸수	
			for(int j=0; j<data[i].length; j++) { // 열 0,1,2
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
