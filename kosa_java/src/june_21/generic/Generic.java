package june_21.generic;
//55. 제네릭의 개념
	// 데이터 타입을 일반화(generalize)한다.
	// 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법
	// 컴파일시 미리 타입 검사(type check) 수행 장점
	// 1. 클래스나 메소드 내무에서 사용되는 객체의 타입 안정성 높일 수 있음
	// 2. 반환값에 대한 타입 변환 및 탑 검사에 들어가는 노력을 줄일 수 있음
	// 선언 방법
	// class MyArray<T> {
	//	T element;
	//	void setElement(T element) {this.element = element;}
	//  T getElement() {return element; }
	//}
	//  => T : 타입 변수(Type variable). 임의의 참조형 타입
	//		-> T 아닌 다른 문자를 사용해도 상관x, 여러 개의 타입 변수는 , 로 구분하여 명시
	//		-> 클래스에서뿐만 아니라 메소드의 매개변수나 반환값으로도 사용가능
	// 제너릭 클래스를 생성할 때 타입 변수 자리에 사용할 실제 타입을 명시해야함
	//  => ex. MyArray<Integer> myArr = new MyArray<Integer>();
	//		-> MyArray 클래스에 사용된 타입 변수로 Integer 타입을 사용
	//		-> 제네릭 클래스를 생성할 떄 사용할 실제 타입 명시하면 내부적으로는 정의된 타입변수가 명시된 실제 타입으로 변환되어 처리됨
	// 자바에서 타입 변수 자리에 사용할 실제 타입을 명시할 때 기본 타입을 바로 사용할 수는 없음
	//   -> 이때는 위에서처럼 Integer와 같이 래퍼(wrapper) 클래스를 사용해야함
	// 자바SE 7 부터 인스턴스 생성시 타입을 추정할 수 있는 경우에 타입 생략 가능
	//  => ex. MyArray<Integer> myArr = new MyArray<>(); // Java SE 7부터 가능함.
import java.util.*;

class LandAnimal {
	public void crying() {
		System.out.println("육지동물");
	}
}

class Cat extends LandAnimal {
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}

class Dog extends LandAnimal {
	public void crying() {
		System.out.println("멍멍");
	}
}

class Sparrow {
	public void crying() {
		System.out.println("짹쨱");
	}
}

class AnimalList<T> {
	ArrayList<T> al = new ArrayList<T>();
	
	void add(T animal) {
		al.add(animal);
	}
	T get(int index) {
		return al.get(index);
	}
	boolean remove(T animal) {
		return al.remove(animal);
	}
	int size() {
		return al.size();
	}
}
public class Generic {
	public static void main(String[] args) {
		AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.
		
		landAnimal.add(new LandAnimal());
		landAnimal.add(new Cat());
		landAnimal.add(new Dog());
		//landAnimal.add(new Sparrow()); // 오류 발생
		
		for(int i = 0; i < landAnimal.size(); i++) {
			landAnimal.get(i).crying();
		}
	}
}
