
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// 배열의 값을 크기순으로 정렬하기
		int arr[] = {45,32,43,74,64,3,89,53,1,20};
		
		// 정렬전
		System.out.print("정렬전 -> ");
		for (int i=0; i<arr.length; i++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n-----구분선-----");
		
		for(int j=0; j<arr.length-1; j++) { // 라운드는 배열의 크기-1번 진행
			// 라운드를 진행할 때마다 뒤에서 한개씩 정렬되기에, 한번씩 줄여가며 비교
			// 정렬					10-1-0, 10-1-1, 10-1-2, ...
			for (int i=0; i<arr.length-1-j; i++) { // 가장 큰값이 맨 뒤로 가기에 맨 뒤는 비교불필요
				if(arr[i] > arr[i+1]) { // 0번째 값과 1번째 값과 비교하여 0번째 값이 더 크면 교환
					// < 로 하면 내림차순 정렬, >로 하면 올림차순 정렬
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.print("정렬후 -> ");
			for (int i=0; i<arr.length; i++) { // 0,1,2,3,4,5,6,7,8,9
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		
	}

}
