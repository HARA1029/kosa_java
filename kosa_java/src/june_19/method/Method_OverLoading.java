package june_19.method;

class Test {//기본생성자가 없어서 자동으로 컴파일러가 만들어줌
	//오버로딩
	static void display(int num1) {
		System.out.println(num1);
	}
	static void display(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	static void display(int num1, double num2) {
		System.out.println(num1 + num2);
	}
}

public class Method_OverLoading {
	public static void main(String[] args) {
		//32. 메소드 오버로딩
		// 메소드 시그니처 : 메소드의 선언부에 명시되는 매개변수 리스트
		// 메소드 오버로딩 : 같은 이름의 메소드를 중복하여 정의하는 것
		// 다형성을 구현하는 방법 중 하나
		// 조건 : 매개변수(인자)의 개수와 타입이 달라함. 메소드의 이름은 같아야함
		Test myfunc = new Test();
		//인자의 타입에 맞춰서 찾아서 출력해줌. 런타임에서 알아서 출력해줌
		myfunc.display(10);
		myfunc.display(10, 20);
		myfunc.display(10, 3.14);
		myfunc.display(10, 'a');
	}

}
