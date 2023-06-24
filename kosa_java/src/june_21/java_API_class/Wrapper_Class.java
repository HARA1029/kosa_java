package june_21.java_API_class;

public class Wrapper_Class {
	//51. Wrapper 클래스
	//래퍼 클래스
	//기본 타입의 데이터를 객체로 취급해야하는 경우 -> 기본 타입의 데이터를 객체로 변환 후 작업 수행
	//8개의 기본타입에 해당하는 데이터를 객체로 포장해주는 클래스
	//각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당값을 가지는 객체로 만들어줌
	//Integer 와 Character 만 자산의 기본타입과 이름이 다름
	
	//박싱, 언박싱
	// 래퍼 클래스는 산술 연산을 위해 정의된 클래스가 아니므로 인스턴스에 저장된 값을 변경할 수 없음
	// 값을 참조하기 위해 새로운 인스턴스 생성. 생성된 인스턴스 값만 참조 가능
	// 박싱(boxing) :  기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정
	// 언박싱(unboxing) : 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정
	public static void main(String[] args) {
		//오토 박싱, 오토 언박싱
		
		Integer num = new Integer(17);//박싱
		int n = num.intValue(); //언박싱
		System.out.println(n);
		
		Character ch = 'X'; //Character ch = new Character("X"); : 오토박싱
		//오토박싱을 이용하면 new 키워드를 사용하지 않고 자동으로 Character 인스턴스를 생성할 수 있음
		char c = ch;	//char c = ch.charValue(); : 오토 언박싱
		//charValue() 메소드를 사용하지 않고도, 오토 언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조 가능
		System.out.println(c);
		
		//내부적인 래퍼 클래스인 피연산자를 오토언박싱하여 기본 타입끼지 연산 수행
		Integer num1 = new Integer(7);	//박싱
		Integer num2 = new Integer(3);	//박싱
		
		int int1 = num1.intValue();		//언박싱
		int int2 = num2.intValue();		//언박싱
		
		Integer result1 = num1 + num2;
		System.out.println(result1);
		
		Integer result2 = num1 - num2;
		System.out.println(result2);
		
		Integer result3 = num1 * num2;
		System.out.println(result3);
		
		//래퍼 클래스의 비교 연산도 오토언박싱을 통해 가능.
		Integer num3 = new Integer(10); 
		Integer num4 = new Integer(20);
		Integer num5 = new Integer(10);
		
		System.out.println(num3 < num4);
		System.out.println(num3 == num5); // 인스턴스 값 비교가 아닌 주소값 비교
		System.out.println(num3.equals(num5)); // 인스턴스 저장된 값의 동등 여부 반판
	}

}
