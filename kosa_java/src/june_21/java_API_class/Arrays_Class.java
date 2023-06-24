package june_21.java_API_class;

import java.util.Arrays; // 클래스 메소드(static method) : 객체 생성하지 않고 바로 사용가능

//53. Arrays 클래스
//java.util 패키지
// java.lang 패키지와 달리 import 해서 사용해야 함 
//  => 그렇지 않으면 사용 불가


public class Arrays_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//다른 것과 달리 객체형이기 때문에 좀 더 편히 사용할 수 있음
		//binarySearch() 메소드
		// 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘 사용하여 검색 후 해당 위치 반환
		// 알고리즘을 사용하기 때문에 sort() 메소드 등을 사용하여 미리 정렬되어 있어야만 제대로 동작
		
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++)
		arr[i] = i;
		System.out.println(Arrays.binarySearch(arr, 437));
		
		//copyOf()
		// 전달받은 배열의 특정 길이만큼 새로운 배열로 복사하여 반환
		// 첫 번째 매개변수 : 원본 배열 , 두 번째 매개변수 : 원본 배열에서 새로운 배열로 복사할 요소의 개수
		// 원본 배열과 같은 타입의 복사된 새로운 배열 반환
		// 새로운 배열 길이 > 원본 배열 길이 => 나머지 요소 : 배열 요소의 타입에 맞게 기본값으로 채워짐
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOf(arr1, 3);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		int[] arr3 = Arrays.copyOf(arr1, 10);
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		//copyOfRange()
		//전달받은 배열의 특정 범위에 해당하는 요소만 새로운 배열로 복사 반환
		//첫 번째 매개변수 : 복사의 대상이 될 원본 배열
		//두 번째 매개변수 : 원본 배열에서 복사할 시작 인덱스
		//세 번째 매개변수 : 마지막으로 복사될 배열 요소의 바로 다음 인덱스 전달 -> n-1까지 복사
		int[] arr4 = {1, 2, 3, 4, 5};
		
		int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
		for(int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		//fill()
		// 전달받은 배열의 모든 요소를 특정 값으로 초기화해줌
		// 첫 번째 매개변수 : 초기화할 배열
		// 두 번째 매개변수 : 초기값
		
		int[] arr6 = new int[10];
		
		Arrays.fill(arr6, 7);
		for(int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + " ");
		}
		System.out.println();
		
		//sort()
		// 전달받은 배열의 모든 요소를 오름차순으로 정렬
		// 매개변수 : 정렬할 배열
		// => 원본 배열의 순서 변경
		
		int[] arr7 = {5, 3, 4, 1, 2};
		
		Arrays.sort(arr7);
		for(int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + " ");
		}
	}
	
	

}
