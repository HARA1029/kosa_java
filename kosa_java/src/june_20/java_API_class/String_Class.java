package june_20.java_API_class;

public class String_Class {

	public static void main(String[] args) {
		//48. String 클래스
		// import 없이 기본패키지(java.lang)에서 포함되어 사용가능
		// 불변 객체(immutable object) : 한 번 생성된 인스턴스는 값을 읽기만 가능. 변경 x
		//  => 덧셈(+) 연산자를 이용하여 문자 결합하면 변경이 아닌 합쳐진 새로운 String 인스턴스 생성

		//charAt() 메소드
		// 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
		//   => 해당 문자길이보다 크거나 작으면 IndexOutOfBoundsException 발생
		
		String str = new String("Java");
		System.out.println("원본 문자열 : " + str);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		for( char ch : str.toCharArray()) { // 향상된for 문
			System.out.print(ch + " ");
		}
		System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);
		System.out.println();
		
		
		//compareTo() 메소드
		// 해당 문자열을 인수로 전달된 물자열과 사전편찬순으로 비교
		// 문자열 비교시 대소문자를 구분하여 비교
		// 같으면 0, 해당문자열 < 인수로 전달된 문자열 : - . 해당문자열 > 인수로 전달된 문자열 : + 반환.
		// 대소문자 구분 없이 하려면  compareToIgnoreCase() 사용
		
		String str2 = new String("abcd");
		System.out.println("원본 문자열 : " + str2);
		
		System.out.println(str2.compareTo("bcef"));
		System.out.println(str2.compareTo("abcd"));
		
		System.out.println(str2.compareTo("Abcd"));
		System.out.println(str2.compareToIgnoreCase("Abcd"));
		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str2);

		//concat() 메소드
		// 두 문자열을 병합시에 사용
		// 해당 문자열 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환
		// ex. 인수에 전달된 문자열의 length = 0 -> 그대로 반환
		String str3 = new String("Java");
		System.out.println("원본 문자열 : " + str3);
		
		System.out.println(str.concat("수업"));
		System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str3);
		
		//indexOf() 메소드
		// 해당된 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환
		// 포함되지 않은 문자 or 문자열 : -1 반환
		// 대소문자 구분
		
		String str4 = new String("Oracle Java");
		System.out.println("원본 문자열 : " + str4);
		
		System.out.println(str4.indexOf('o'));
		System.out.println(str4.indexOf('a'));
		System.out.println(str4.indexOf("Java"));
		System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + str4);

		//trim() 메소드
		// 해당 문자열 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거
		
		String str5 = new String(" Java     ");
		System.out.println("원본 문자열 : " + str5);
		
		System.out.println(str5 + '|');
		System.out.println(str5.trim() + '|');
		System.out.println("trim() 메소드 호출 후 원본 문자열 : " + str5);

		//toLowerCase() 와 toUpperCase() 메소드
		// toLowerCase() : 해당 문자열의 모든 문자를 소문자로 변환
		// toUpperCase() : 해당 문자열의 모든 문자를 대문자로 변환
		
		String str6 = new String("Java");
		System.out.println("원본 문자열 : " + str6);
		
		System.out.println(str6.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("두 메소드 호출 후 원본 문자열 : " + str6);
	
	}

}
