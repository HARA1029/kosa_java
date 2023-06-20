package june_20.Inheritance;
//41. super 와 super()
// super 키워드 : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수
//부모 클래스의 멤버와 자식 클래스의 멤버 이름이 같을 경우 super 키워드를 사용하여 구별
//this와 마찬가지로 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메소드뿐이며, 클래스 메소드에서는 사용할 수 없음

//super() 메소드 : super();
//this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면, super() 메소드는 부모 클래스의 생성자를 호출할 때 사용
//자식 클래스의 인스턴스 생성 -> 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만 아니라 부모클래스의 모든 멤버까지도 포함
// 부모 클래스의 멤버를 초기화 -> 자식클래스의 생성자에서 부모클래스의 생성자까지 호출 -> 최상위 클래스 Object 클래스 생성자까지 거슬러올라가면서 수행
// 자바 컴파일러는 부모 클래스의 생성자를 명시적으로 호출하지 않는 모든 자식 클래스의 생성자 첫 줄에 자동으로 다음과 같은 명령문을 추가. 부모 클래스의 멤버를 초기화할 수 있도록 해줌

class Parent1 { 
	//부모 클래스에 매개변수를 가지는 생성자가 하나라도 선언되어 있으면 기본생성자가 자동으로 추가되지 않음
	int a = 10;
	Parent1() { // 이렇게 기본 생성자를 명시적으로 선언해야됨
		a = 10;
	}
	Parent1(int n) {
		a = n;
	}
}

class Child1 extends Parent1 { // 로컬주소로 구분되기 때문에 같은 변수이름으로 사용가능
//지역변수와 this 참조 변수는 자식 클래스에서 대입된 값을 출력하며, super 참조 변수만이 부모변수 클래스에서 대입된 값 출력
	//int a = 20;
	int b;
	Child1() {
		super(40);// 부모클래스의 기본생성자 호출 => 오류발생 => 부모클래스에 기본생성자 추가되지 않음
		//super(40) 주석처리하면 a 는 10으로 초기화 되어 출력됨
		// 해제하면 두번째 생성자에 의해 초기화 되어 40 출력
		b =20;
	}
	void display() {
//		int a = 30;
//		System.out.println(a); //30
//		System.out.println(this.a); //20
//		System.out.println(super.a); //10
		
		System.out.println(a); //40
		System.out.println(b); //20
	}
}
public class Super {
	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.display();
	}

}
