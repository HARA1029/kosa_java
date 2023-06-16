package june_16;

import java.util.Arrays;

public class Array {//배열

	public static void main(String[] args) {
		/*
		 
		 
		//22. 메모리 구조
		//메모리
		//힙 영역 
		//스택 영역 : 메소드가 호출될 때 메소드의 스택 프레임이 저장되는 영역
		
		//23. 1차원 배열
		//1. 타입[] 배열이름;
		//2. 타입 배열이름[];
		
		//배열 : 같은 타입의 변수들로 이루어진 유한 집합
		//배열 요소(element) : 배열을 구성하는 값
		//인덱스(index) : 배열에서의 위치를 가리키는 숫자. 0부터 시작. 양의 정수만 가짐
		
		int[] grade1 = new int[3];	//길이가 3인 int 형 배열의 선언 및 생성
		int[] grade2 = new int[3];	//길이가 3인 int 형 배열의 선언 및 생성
		
		grade1[0] = 85; //인덱스를 이용한 배열의 초기화
		grade1[1] = 65;
		grade1[2] = 90;
		
		grade2[0] = 85;	//배열의 길이보다 적은 수의 배열 요소만 초기화
		
		for(int i = 0; i < grade1.length; i++) {
			System.out.print(grade1[i] + " ");	//인덱스를 이용한 배열로의 접근
		}
		System.out.println();
		for(int i = 0; i < grade2.length; i++) {
			System.out.print(grade2[i] + " ");//인덱스를 이용한 배열로의 접근	
		}
		
		//배열의 초기화 : 초기화 블록 타입과 배열 타입은 일치해야함
		int[] grade1 = {70, 90, 80};	//배열 선언과 동시에 초기화 할 수 있음
		int[] grade2 = new int[] {70, 90, 80};	//배열 선언과 동시에 초기화 할 수 있음
		int[] grade3;
		//grade3 = {70, 90, 80};	//이미 선언된 배열을 이 방법으로 초기화 하면 오류 발생
		int[] grade4;
		grade4 = new int[] {70, 90, 80};		//이미 선언된 배열은 이 방법으로만 초기화할 수 있음
		
		int[] grade = new int[] {85, 65, 90}; //길이가 3인 int 형 배열을 선언과 동시에 초기화
		
		int sum = 0;
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " "); //인덱스를 이용한 배열로 접근
			
			sum += grade[i];
		}
		System.out.println();
		System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");
		System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");
		
		//24. 다차원 배열 : 2차원 이상의 배열
		// 2차원 배열
		//1. 타입[][] 배열이름; : 자바식
		//2. 타입 배열이름[][]; : c언어식
		//3. 타입[] 배열이름[]; : 잘 안씀
		
		int[][] arr = new int[2][3];
		
		int k = 10;
		for (int i = 0; i < arr.length; i++) { // arr : 2차원 배열
			for (int j = 0; j < arr[i].length; j++) { //arr[i] 각 배열요소. 1차원 배열
				arr[i][j] = k;	//인덱스를 이용한 초기화
				k += 10;
			}
		}
		
		for (int i = 0; i < arr.length; i++) { //arr.length : 2차원 배열인 arr 의 배열 요소의 총 개수
			for(int j = 0; j < arr[i].length; j++) { //arr[i].length : arr의 각 배열 요소인 1차원 배열이 가지고 있는 배열 요소의 총 개수
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 배열의 선언과 동시에 초기화하는 방법
		//타입 배열이름[행의길이][열의길이] = {
			  //{배열요소[0][0], 배열요소[0][1], ...},
			  //{배열요소[1][0], 배열요소[1][1], ...},
			  //{배열요소[2][0], 배열요소[2][1], ...},
			  //...

			//};
		int[][] arr = {
				{10, 20, 30},
				{40, 50, 60}
		};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//가변 배열: 2차원 배열을 생성할 떄 열의 길이를 명시하지 않고 행마다 다른 길이의 배열을 저장할 수 있는 배열
		
		int[][] arr = new int[3][];  // 두 번쨰 첨자를 생략하여 가변 배열을 만들 수 있음
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[1];
		
		int[][] arr = {
				{10, 20},
				{10, 20, 30, 40},
				{10}
		};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//25. 배열의 활용
		// 배열의 복사
		//1. System 클래스의 arraycopy() 메소드
		//2. Arrays 클래스의 copyOf() 메소드  : 크기 변경가능
		//3. Object 클래스의 clone() 메소드	  : 크기 변경 불가
		//4. for 문과 인덱스를 이용한 복사
		//=> 3을 제외한 나머지는 길이를 변경 가능
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int newLen = 10;
		
		//1. System 클래스의 arraycopy() 메소드
		int[] arr2 = new int[newLen];
		//System.arraycopy(arr1, newLen, arr2, newLen, newLen);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//2. Arrays 클래스의 copyOf() 메소드
		int[] arr3 = Arrays.copyOf(arr1, 10);
		//int[] arr3 = Arrays.copyOf(arr2, newLen)
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		//3. Object 클래스의 clone() 메소드
		int[] arr4 = (int[])arr1.clone();
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		//4. for 문과 인덱스를 이용한 복사
		int[] arr5 = new int[newLen];
		for (int i = 0; i < arr1.length; i++) {
			arr5[i] = arr1[i];
		}
		
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
		
		
		//Enhanced for 문 : 향상된 for 문
		//for(타입 변수이름 : 배열이나 컬렉션이름) {
		// 배열의 길이 만큼 반복적으로 실행하고자 하는 명령문;
		//}
		// 명시한 배열이나 컬렉션의 길이만큼 반복되어 실행. 참조시에만 사용하는 것이 좋으며, 요소의 값을 변경하는 것에는 적합하지 않음
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
		*/
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;		//각 배열 요소에 10을 더함
			System.out.print(arr1[i] + " "); // arr1의 모든 배열 요소 출력
			
		}
		System.out.println();
		for(int e : arr2) { 
			e += 10;		 //각 배열 요소에 10을 더함
		}
		
		// arr2의 모든 배열 요소 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " "); // 값에 변함 없음
		}
		
	}
}
