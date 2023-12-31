package june_20.polymorphism;

public class Inner_Class {
//46. 내부 클래스
// 하나의 클래스 내부에 선언된 또 다른 클래스
// 외부 클래스에 대해 두 개의 클래스가 서로 긴밀한 관계를 맺고 있을 때 선언
// 문법
// class Outer {     // 외부 클래스
//    ...
//    class Inner { // 내부 클래스
//        ...
//    }
//    ...
//}

//내부 클래스의 장점
//1. 외부클래스에 손쉽게 접근 가능
//2. 서로 관련있는 클래스를 논리적으로 묶어 표현 -> 코드의 캡슐화 증가
//3. 외부에서 내부 클래스에 접근 불가. 코드의 복잡성을 줄일 수 있음

//내부 클래스의 종류
//1. 정적(static) 클래스 :  대부분 외부클래스의 클래스 메소드에 사용될 목적으로 선언
//2. 인스턴스(instance) 클래스 : 외부 클래스 영역에서 선언된 클래스 중에서 static 을 가지지 않는 클래스
	// 외부클래스의 인스턴스 변수나 인스턴스 메소드에 사용될 목적으로 선언
//3. 지역(local) 클래스 : 외부클래스의 메소드나 초기화 블록에 선언된 클래스. 선언된 블록 내에서만 사용가능
//4. 익명(anonymous) 클래스
	// 이름을 가지지 않는 클래스. 클래스 선언과 동시에 객체 생성. 단 하나의 객체만을 생성하는 일회용 클래스
	// 생성자 선언 x. 단 하나의 클래스나 단 하나의 인터페이스를 상속받거나 구현할 수 있음
	// 매우 제한적인 용도에 사용. 구현해야하는 메소드가 매우 적은 클래스를 구현시 사용
	// 문법
	// 익명 클래스는 선언과 동시에 생성하여 참조변수에 대입함.
	//클래스이름 참조변수이름 = new 클래스이름(){
	    // 메소드의 선언
	//};



}
