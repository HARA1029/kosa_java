package june_21.java_API_class;

public class StringBuffer_Class {
	//49. StringBuffer 클래스
	
	//java.lang.StringBuffer 클래스
	//String 클래스 : 인스턴스 한 번 생성되면 값 읽기 o, 변경 x
	//	=> + 로 인스턴스 문자열 결합 -> 내용이 합쳐진 새로은 String 인스턴스 생성
	//  	=> 많이 결합할수록 공간 낭비 & 속도 매우 느림
	//StringBuffer 클래스 : 인스턴스 값 변경 & 추가 o
	//	=> 내부적으로 buffer 라는 독립적 공간을 가짐.
	//	=> buffer 기본값 : 16개 문자를 저장할 수 있는 크기. 생성자를 통해 크기 별도 설정 가능
	//		=> 인스턴스 생성시 설정한 크기보다 16개 문자 저장할 수 있도록 여유있는 크기로 생성
	//	=> 문자열 바로 추가 가능 -> 공간 낭비 x, 속도도 빨라짐
	
	//불변 클래스(immutable class) & 가변 클래스(mutable class)
	//불변 클래스 : 인스턴스가 생성된 후에 값을 변경할 수 없음 => String 클래스
	//	=> append(), insert() 와 같이 값을 변경하는 set 메소드 포함 x
	//	=> 멀티 스레드 환경에서 객체가 변화되는 상황에서 사용하면 좀 더 신뢰할 수 있는 코드 작성 가능
	//	=> 하나의 객체에 접근하면서 각각의 객체가 서로 영향을 주면 안되는 경우 사용
	//가변 클래스 : 인스턴스 생성된 후에도 값을 자유롭게 변경 가능 => StringBuffer 클래스

	public static void main(String[] args) {
		
		//append() 메소드
		// 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가
		// String클래스의 concat()과 같은 결과 반환 but 내부처리 속도 훨씬 빠름
		
		StringBuffer str = new StringBuffer("Java");
		System.out.println("원본 문자열 : " + str);
	
		System.out.println(str.append("수업"));
		System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);
		
		//capacity() 메소드
		// StringBuffer 인스턴스의 현재 버퍼 크기를 반환
		
		StringBuffer str01 = new StringBuffer();
		StringBuffer str02 = new StringBuffer("Java");
		// => 4인 문자열로 인스턴스 생성 => 여유버퍼크기 16 + 문자길이 4 = 20개 문자를 저장할 수 있는 버퍼 생성
		//	=> 글을 추가할 때 미리 여유공간을 잡아두기 때문에 다 늘어가지 않고 잡아둔 바이트보다 더 넘어갈 경우 여유 공간을 더 잡아서 더 추가됨
		System.out.println(str01.capacity());
		System.out.println(str02.capacity());
		
		//delete() 메소드
		//전달된 인덱스에 해당하는 부분 문자열을 제거
		//deleteCharAt() : 특정 위치의 문자 한 개만 제거
		
		StringBuffer str2 = new StringBuffer("Java Oracle");
		System.out.println("원본 문자열 : " + str2);
		
		System.out.println(str2.delete(4,8)); // 인덱스 4~7 삭제
		System.out.println(str2.deleteCharAt(1));
		System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str2);
		
		//insert() 메소드
		// 인수로 전달된 값을 문자열로 반환 후 해당 문자열의 지정된 인덱스 위치에 추가
		// 전달된 인덱스와 해당문자열의 길이가 같으면 append 메소드와 같은 결과 반환
		
		StringBuffer str3 = new StringBuffer("Java 만세!!");
		System.out.println("원본 문자열 : " + str3);
		
		System.out.println(str3.insert(4,  "Script"));
		System.out.println("insert() 메소드 호출 후 원본 문자열 : " + str3);
		
		//reverse() 메소드
		// 해당문자열의 인덱스를 역순으로 재배열함
	}

}
