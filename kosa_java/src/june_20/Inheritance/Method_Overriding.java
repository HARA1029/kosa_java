package june_20.Inheritance;

//42. 메소드 오버라이딩 : 상속받은 부모 클래스의 메소드를 재정의하여 사용하는 것을 의미
//오버라이딩(overriding):상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의하는 것
//자식 클래스 : 부모클래스의 private 멤버를 제외한 모든 메소드 상속받음 
// => 그대로 사용 or 필요한 동작을 위해 재정의하여 사용 => 메소드 오버라이딩

//오버라이딩 조건
//1. 오버라이딩 : 메소드의 동작만을 재정의하는 것 
// -> 메소드의 선언부는 기존 메소드와 완전히 같아야 함
// but 메소드의 반환 타입 : 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경 가능
//2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경할 수 없음
//3. 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없음

//메소드 오버라이딩
// 메소드 오버라이딩을 통해 상속받은 부모 클래스의 메소드를 자식 클래스에서 직접 재정의 가능

//오버로딩과 오버라이딩
//오버로딩 : 새로운 메소드를 정의. 여러 개 만들 수 있음
//오버라이딩 : 상속받은 기존의 메소드 재정의. 수정액으로 덮어쓰는 느낌
class Parent2 {
	void display() {
		System.out.println("부모 클래스의 display() 메소드 입니다.");
	}
}

class Child2 extends Parent2 {
//	void display() {
//		System.out.println("자식 클래스의 display() 메소드 입니다.");
//	}
	//오버라이딩된 display() 메소드
	void display() {
		System.out.println("자식 클래스의 display() 메소드 입니다.");
	}
	void display(String str) {
		System.out.println(str); //오버로딩된 display() 메소드
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
//		Parent2 pa = new Parent2();
//		pa.display();
//		Child2 ch = new Child2();
//		ch.display();
//		Parent2 pc = new Child2();
//		pc.display(); //Child cp = new Parent();
//		//세 번째와 같은 인스턴스 참조가 허용되는 이유 -> 자바의 다형성 
		
		Child2 ch = new Child2();
		ch.display();
		ch.display("오버로딩된 display() 메소드입니다.");
	}

}
