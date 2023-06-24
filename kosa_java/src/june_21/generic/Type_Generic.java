package june_21.generic;
//56. 다양한 제네릭 표현
//타입 변수의 제한
// T와 같은 타입 변수를 사용하여 타입을 제한 -> extends 키워드를 사용. -> 타입 변수에 특정 타입만을 사용하도록 제한
//  => ex. class AnimalList<T extends LandAnimal> {...}
//		-> 타입변수에 제한을 걸어놓으면 클래스 내부에서 사용된 모든 타입 변수에 제한 이 걸림
//			-> 이때는 클래스가 아닌 인터펭스를 구현할 경우에도 implements 아닌 extends 를 사용해야함
// interface WarmBlood{...}
// ...
// class AnimalList<T extends WarmBllod> {...} // implements 키워드를 사용해서는 안됨.
// 클래스와 인터페이스를 동시에 상속받고 구현해야한다면 엠퍼센터(&)기호 사용
//  =>ex. class AnimalList<T extends LandAnimal & WarmBlood> {...}

import java.util.ArrayList;

class LandAnimal2 {
	public void crying() {
		System.out.println("육지동물");
	}
}

class Cat2 extends LandAnimal2 {
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}

class Dog2 extends LandAnimal2 {
	public void crying() {
		System.out.println("멍멍");
	}
}

class Sparrow2 {
	public void crying() {
		System.out.println("짹쨱");
	}
}

/*
 * class AnimalList2<T extends LandAnimal2> { // 없어도 돌아가지만 타입의 명확성을 위해 사용
 * ArrayList<T> al = new ArrayList<T>();
 * 
 * void add(T animal) { 
 * al.add(animal); 
 * } T get(int index) { 
 * return al.get(index); 
 * } 
 * boolean remove(T animal) { 
 * return al.remove(animal); 
 * } 
 * int size() { return al.size(); 
 * } 
 * }
 */


//제네릭 메소드
// 메소드의 선언부에 타입 변수를 사용한 메소드
// 타입변수 선언은 메소드 선언부에서 반환 타입 바로 앞에 위치
//  => ex. public static <T> void sort(...) {...}
// 제네릭 클래스에서 정의된 타입 변수 T 와 제네릭 메소드에서 사용된 타입 변수 T는 전혀 별개의 것
//  => ex. class AnimalList<T> {
//			....
//				public static <T> void sort(List<T> list, Comparator<? super T> comp) {
//				...
//				}
//			...
//}

//와일드카드의 사용
// 와일드카드(wild card) : 이름에 제한을 두지 않음을 표현하는데 사용되는 기호
//  => 제네릭에서 물음표(?)를 사용햐여 와일드 카드 사용가능
//  => <?>: 타입 변수에 모든 타입을 사용할 수 있음
//  => <? extends T>: T타입과 T타입을 상속 받는 자손 클래스 타입만을 사용할 수 있음
//  => <? super T>: T타입과 T타입이 상속 받은 조상 클래스 타입만을 사용할 수 있음

// 클래스(static) 메소드인 cryingAnimalList() 메소드의 매개변수의 타입을 와일드 카드를 사용하여 제한하는 예제
class AnimalList2<T> {
	ArrayList<T> al2 = new ArrayList<T>();
	
	public static void cryingAnimalList(AnimalList2<? extends LandAnimal2> al2) {
		LandAnimal2 la2 = al2.get(0);
		la2.crying();
	}
	
	void add(T animal2) {
		al2.add(animal2);
	}
	T get(int index) {
		return al2.get(index);
	}
	boolean remove(T animal2) {
		return al2.remove(animal2);
	}
	int size() {
		return al2.size();
	}
}
public class Type_Generic {
	public static void main(String[] args) {
		AnimalList2<LandAnimal2> landAnimal2 = new AnimalList2<>(); // Java SE 7부터 생략가능함.
		
		landAnimal2.add(new LandAnimal2());
		landAnimal2.add(new Cat2());
		landAnimal2.add(new Dog2());
		//landAnimal.add(new Sparrow()); // 오류 발생
		
		for(int i = 0; i < landAnimal2.size(); i++) {
			landAnimal2.get(i).crying();
		}
	}
}
