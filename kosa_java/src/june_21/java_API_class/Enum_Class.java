package june_21.java_API_class;

//52. Enum 클래스
// 열거체를 정의
// 장점
//1. 열거체를 비교시에 실제 값뿐만 아니라 타입까지도 체크
//2. 열거체의 상수값이 재정의되더라도 다시 컴파일할 필요 없음

//열거체의 정의 및 사용
// enum 키워드를 사용하여 열거체를 정의할 수 있음
//문법
//enum 열거체이름 { 상수1이름, 상수2이름, ... }
//enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
//열거체 사용법
//열거체이름.상수이름 => ex. Rainbow.RED


//얼거체의 상숫값 정의 및 추가
enum Rainbow { 
	// 불규칙한 상숫값을 가지는 열거체를 설정하고 싶으면 이름옆에 괄호()에 상수값을 ㅁ여시
	RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
	//불규칙한 특정값을 설정한 경우 그 값을 저장하는 인스턴스 변수와 생성자를 별도로 추가해야함
	private final int value;
	Rainbow(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

public class Enum_Class {
	//java.lang.Enum 클래스
	// Enum 클래스는 모든 자바 열거체의 공통된 조상 클래스.
	// 열거체를 조작하기 위한 다양한 메소드가 포함
	public static void main(String[] args) {
			
		//values() 메소드
		// 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환
		//컴파일러가 자동으로 추가해줌
		Rainbow[] arr = Rainbow.values();
		for(Rainbow rb : arr) {
			System.out.println(rb);
			System.out.println(rb.getValue()); // 이렇게 하면 지정한 상수값이 반환됨
		}
		
		//value of()
		// 전달된 문자열과 일치하는 해당 열거체의 상수 반환
		
		Rainbow rb2 = Rainbow.valueOf("GREEN");
		System.out.println(rb2);
		
		//ordinal()
		// 값이 아닌 순서(index)를 반환. 상수값 자체가 아님
		
		int idx = Rainbow.YELLOW.ordinal();
		System.out.println(idx);
		
		System.out.println(Rainbow.YELLOW.ordinal()); // 불규칙한 상수값을 입력했을 때도 인덱스 값 출력
	}


}
