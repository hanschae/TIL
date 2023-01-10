package basic02_api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 이용해 처리한다
		
		int data [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		int data3 [] = {85, 24, 76, 52, 14, 4, 43, 32, 1};
		
		// toString() : 배열의 값을 문자로 만들어 리턴해준다
		
		String lst = Arrays.toString(data); // [85, 24, 76, 52, 14, 4, 43, 1, 32]
		System.out.println(lst);
		
		// System.out.println(Arrays.toString(data)); // 이렇게도 가능
		
		// 오름차순으로 정렬
		// Arrays.sort(data);
		// Arrays.sort(data,2,6); // index 2부터 6앞까지
		
		// 내림차순으로 정렬
		Integer data2 [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		Arrays.sort(data2, Collections.reverseOrder());
		
		System.out.println("정렬 후 -> "+Arrays.toString(data2));
		
		// 배열의 복사
		int copy [] = Arrays.copyOfRange(data, 2, 6);
		System.out.println("copy = "+Arrays.toString(copy));
		
		// 배열의 비교
		System.out.println(Arrays.equals(data, data3));
	}

}
