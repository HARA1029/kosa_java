package june_20.polymorphism;
//45. 인터페이스
//인터페이스란
// 클래스를 이용하여 다중 상송을 할 경우 메소드 출처의 모호성 등 여러문제가 발생 -> 자바는 다중상속 x
// 자바는 다중상속이 안되기 때문에 인터페이스를 통해 다중 상속을 지원
// 다른 클래스를 작성할 때 기본이 되는 틀을 제공. 다른 클래스 사이의 중간 매개 역할 담당 -> 추상클래스
//   => 추상 메소드, 생성자, 필드, 일반 메소드 를 포함하는 추상클래스와 달리 인터페이스는 추상메소드와 상수만 포함
// 틀은 클래스랑 비슷
// 추상메소드와 상수만 포함

//인터페이스 선언
// 접근제어자와 함꼐 interface 키워드 이용
//문법
// 접근제어자 interface 인터페이스이름 {
//    public static final 타입 상수이름 = 값;  -> 모든 필드
// ...
// public abstract 메소드이름(매개변수목록);  -> 모든 메소드
// ...
// }
//생략된 생성자는 컴파일러가 자동으로 추가

//인터페이스의 구현
// 직접 인스턴스 생성 불가. -> 인터페이스가 포함하고 있는 추상메소드를 구현해 줄 클래스 작성
// 문법
// class 클래스이름 implements 인터페이스이름 {...}
// 모든 추상메소드를 구현하지 않으면 abstract 키워드를 사용하여 추상 클래스로 선언
// 상속과 구현을 동시에 가능
// class 클래스이름 extends 상위클래스이름 implements 인터페이스이름 {...}
// 인터페이스는 인터페이스로부터만 상속 받을 수 있음. 여러 인터페이스 상속가능

//인터페이스의 장점
// 1. 대규모 프로젝트 개발 시 일관되고 정형화된 개발을 위한 표준화가 가능
// 2. 클래스의 작성과 인터페이스의 구현을 동시에 진행 가능. -> 개발 시간 단축
// 3. 클래스와 클래스 간의 관계를 인터페이스로 연결 -> 클래스마다 독립적인 프로그래밍이 가능

interface Animal2 {
	public abstract void cry();
}

/*
interface Pet {
	public abstract void play();
}

class Cat2 implements Animal2, Pet {
	public void cry() {
		System.out.println("나옹냐옹!");
	}
	public void play() {
		System.out.println("쥐 잡기 놀이하자~!");
	}
}
class Dog2 implements Animal2,Pet {
	public void cry() {
		System.out.println("멍멍!");
	}
	public void play() {
		System.out.println("산책가자~!");
	}
}

*/

interface Cat2 extends Animal2{
	public abstract void cry();
}
interface Dog2 extends Animal2{
	public abstract void cry();
}

class MyPet implements Cat2, Dog2 {
	public void cry() {
		System.out.println("멍멍! 냐옹냐옹!");
	}
}


public class Interface {
	public static void main(String[] args) {
		
		/*
		Cat2 c = new Cat2();
		Dog2 d = new Dog2();
		
		c.cry();
		c.play();
		d.cry();
		d.play();
		*/
		
		MyPet p = new MyPet();
		p.cry();
	}

}
