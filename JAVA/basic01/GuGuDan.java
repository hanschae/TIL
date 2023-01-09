
public class GuGuDan {

	public static void main(String[] args) {
		System.out.println("\t备备窜");
		for(int i=1; i<10; i+=3) { // i=1, 4, 7
			// 窜力格
			for(int j=i; j<i+3; j++) { // i=1 > 1,2,3 i=4 > 4,5,6 i=7 > 7,8,9
				System.out.print("==" + j + "窜==\t");
			}
			System.out.println();
			
			// 备备窜
			for(int x=2; x<=9; x++) { // 2,3,4,5,6,7,8,9
				for(int y=i; y<i+3; y++) {
					System.out.print(y+"*"+x+"="+(y*x)+"\t");
				}
				System.out.println();
			}
			
		}
		
	}
	
}