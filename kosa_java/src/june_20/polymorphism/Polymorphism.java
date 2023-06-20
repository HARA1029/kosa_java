package june_20.polymorphism;
//43. 다형성의 개념
//다형성 : 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미
//부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 구현
//상속, 추상화와 같이 객체 지향 프로그래밍(OOP)를 구성하는 중요한 특징 중 하나

//참조 변수의 다형성
//부모클래스 타입의 참조변수로 자식 클래스 타입의 인스턴스 참조할 수 있음
// => 참조변수가 사용할 수 있는 멤버의 개수 <= 실제 인스턴스의 멤버 개수
//특정 타입 참조 변수 : 같은 타입의 인스턴스 참조 가능
// -> 참조 변수가 사용할 수 있는 멤버 개수 == 실제 인스턴스 멤버 개수
//부모 클래스 타입의 참조 변수 : 자식 클래스 타입의 인스턴스 참조 가능
// -> 참조 변수가 사용할 수 있는 멤버의 개수 < 실제 인스턴스 멤버의 개수
//자식 클래스 타입의 참수 변수 : 부모 클래스 타입의 인스턴스 참조 불가
// -> 참조 변수가 사용할 수 있는 멤버의 개수 > 실제 인스턴스 멤버 개수
//상속을 통해 확장 o, 축소 x 
// -> 자식 클래스에서 사용할 수 있는 멤버의 개수 >= 부모클래스에서 사용할 수 있는 멤버의 개수

//참조 변수의 타입 반환
//1. 서로 상속 관계에 있는 클래스 사이에만 타입 변환을 할 수 있음
//2. 자식 클래스 타입에서 부모 클래스 타입으로의 타입 변환은 생략 가능
//3. 하지만 부모 클래스 타입에서 자식 클래스 타입으로의 타입 변환은 반드시 명시해야 함.
//문법 : (변환할타입의클래스이름) 변환할참조변수 <- 기본타입의 타입변환처럼 타입 캐스트 연산자(()) 사용

//instanceof 연산자
//참조 변수가 참조하고 있는 인스턴스의 실제타입을 확인 해줌
//문법 : 참조 변수 instanceof 클래스이름
//왼쪽에 전달된 참조 변수가 실제로 참조하고 있는 인스턴스의 타입 = 오른쪽에 전달된 클래스 타입 -> true를 반환, 아니면 false를 반환합니다.
//참조 변수가 null -> false를 반환

class Parent{}
class Child extends Parent{}
class Brother extends Parent{}

public class Polymorphism {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p instanceof Object); //true
		System.out.println(p instanceof Parent); //true
		System.out.println(p instanceof Child); //false
		System.out.println();
		
		Parent c = new Child();
		System.out.println(c instanceof Object); //true
		System.out.println(c instanceof Parent); //true
		System.out.println(c instanceof Child); //true
	}
}
