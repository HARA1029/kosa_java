package june_20.java_API_class;
//47. Object 클래스

//java.lang 패키지
// 기본적인 동작을 수행하는 클래스들의 집합 -> import 문 없이 클래스 이름으로 사용 가능

//java.lang.Object 클래스
// 가장 많이 사용되는 클래스. 모든 자바의 최고 조상 클래스
// 모든 클래스는 Object 의 모든 메소드를 바로 사용할 수 있음. 필드를 가지지 않음

//toString() 메소드
// 해당 인스턴스에 대한 정보를 문자열로 반환
// 반환 되는 문자열 => 클래스이름 + @ + 16진수 해시코드(인스턴스의 주소값)

//equals() 메소드
// 주소값으로 비교
// 해당 인스턴스를 매개변수로 전달받는 참조 변수와 비교하고 결과 반환
// 참고 변수가 가리키는 값을 비교 => 서로 다른 두 객체는 false 반환
// 각 API 클래스마다 자체적으로 오버라이딩을 통해 재정의 되어 있음

//clone 메소드 => 나중에 다시 함. 알아만 두기
// 해당 인스턴스 복제 후 새로운 인스턴스 생성하여 반환
// 필드 값만 복사 => 필드의 값이 배열 or 인스턴스 일 경우 제대된 복제 불가
//   => 이 경우 해당클래스에서 clone() 메소드를 오버라이딩. 복제가 제대로 이루어지도록 재정의
// 데이터 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 사용가능

class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	
	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car() {
		this("아반떼", 2016, "흰색", 200);
	}
	
	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}
public class Object_Class {

	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		
		System.out.println(car01.toString());
		System.out.println(car02.toString());
		System.out.println(car01.equals(car02));
		car01 = car02; // 두 참조 변수가 같은 주소를 가리킴
		System.out.println(car01.equals(car02));
		System.out.println(car01.toString());
		System.out.println(car02.toString()); // 같은 주소값으로 변경됨

	}

}
