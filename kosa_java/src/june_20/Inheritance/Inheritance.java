package june_20.Inheritance;

		//40. 상속의 개념
		// 기존 클래스 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것
		// 캡슐화, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나
		// 상속을 이용하면 기존에 정의되어 있는 클래스의 모든 필드와 메소드를 물려받아, 새로운 클래스를 생성할 수 있다.
		// => 그렇다고 모든 걸 사용할 수 있는 건 아님
		//기존 정의되어 있던 클래스 => 부모(parent) 클래스, 상위(super) 클래스, 기초(base) 클래스
		//상속을 통해 새롭게 작성되는 클래스 => 자식(child) 클래스, 하위(sub) 클래스, 파생(derived) 클래스
		
		//장점
		//1. 기존에 작성된 클래스를 재활용할 수 있음
		//2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됨		
		//3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련
		
		//자식 클래스 : 부모 클래스의 모든 특성을 물려받아 새롭게 작성된 클래스
		//class 자식클래스이름 extend 부모클래스이름 { ... }
		//부모 클래스를 확장(extend)해서 자식클래스를 만듦 -> 따라서 부모클래스는 자식 클래스에 포함되어 있음
		//부모클래스에 새로운 필드 추가하면 자식클래스에도 자동으로 필드추가되는 것처럼 동장
		//생성자와 초기화 블록은 상속되지 않음. 필드와 메소드만 상속됨
		//private, default -> 상속 o, 접근 x
		//단 한 개의 클래스만 상속받는 단일 상속 가능 -> 부모가 여러명이면 변수명 충돌이나 중복된 클래스 상속으로 객체지향이 무너질 수 있음

class Parent {
	private int a = 10;		//private 필드
	public int b = 20;		//public 필드
}

class Child extends Parent {
	public int c = 30;		//public 필드
	void display() {	
		//System.out.println(a);	//상속받은 private 필드 참조 => 접근불가
		System.out.println(b);		//상속받은 public 필드 참조
		System.out.println(c);		//자식클래스에서 선언한 public 필드 참조
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();		
	}

}
