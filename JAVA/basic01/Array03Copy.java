
public class Array03Copy {

	public static void main(String[] args) {
		// 배열의 복사
		// 배열은 생성 후 크기를 변경할 수 없다.
		
		int arr[] = {60,80,61,85,95,34,26,94};
		
		int arr2[] = new int [10];
		
		System.arraycopy(arr, 1, arr2, 2, 4); // arr의 1번인덱스를 arr2의 2번인덱스로 4개
		
		for(int i=0; i<arr2.length; i++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println();
		
		System.arraycopy(arr, 0, arr2, 0, 8); // arr의 0번인덱스를 arr2의 0번인덱스로 8개
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}

	}

}