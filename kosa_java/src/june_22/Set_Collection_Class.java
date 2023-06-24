package june_22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


class Animal {
	String species;
	String habitat;
	
	Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}
	
	public int hashCode() {
		return (species + habitat).hashCode();
	}
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal temp = (Animal)obj;
			return species.equals(temp.species)&&habitat.equals(temp.habitat);
		} else {
			return false;
		}
	}
}

public class Set_Collection_Class {
	//60. Set 컬렉션 클래스
	// Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
	// 1. 요소의 저장순서를 유지 하지 않음
	// 2. 같은 요소의 중복 저장을 허용하지 않음
	public static void main(String[] args) {
		//HashSet<E> 클래스
		// 가장 많이 사용되는 클래스 중 하나
		// 해시 알고리즘을 사용하여 처리속도가 빠름
		// 내부적으로 HashMap 인스턴스를 이용하여 요소를 저장
		// Set 인터페이스를 구현 -> 요소를 순서에 상관없이 저장하고 중복된 값은 저장하지 않음
		//  => 저장순서 유지해야한다면 LinkedHashSet 클래스를 사용
		
		// 여러 HashSet 메소드를 이용하여 집합을 생성하고 조작하는 예제
		HashSet<String> hs01 = new HashSet<String>();
		HashSet<String> hs02 = new HashSet<String>();
		
		//add() 메소드를 이용한 요소의 저장
		hs01.add("홍길동");
		hs01.add("이순신");
		System.out.println(hs01.add("임꺽정"));
		System.out.println(hs01.add("임꺽정"));//증복된 요소 저장 => 저장하지 않고 false 반환
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for(String e : hs01) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//add() 메소드를 이용한 요소의 저장
		hs02.add("임꺽정");
		hs02.add("홍길동");
		hs02.add("이순신");
		
		//iterator() 메소드를 이용한 요소의 출력
		// => Collection 인터페이스에서 Iterator 인테페이스를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근
		Iterator<String> iter02 = hs02.iterator();
		while(iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("집합의 크기 : " + hs02.size());

		System.out.println();
		//=> 저장 순서를 바꿔도 저장되는 순서에는 영향을 미치지 않음
		
		// HashSet에 이미 존재하는 요소인지 파악하기 위한 과정
		// 1. 해당요소에서 hashCode() 메소드를 호출하여 반환된 해시값을 검색할 범위를 결정
		// 2. 해당 범위 내의 요소들을 equals() 메소드로 비교
		// HashSet 에서 add() 메소드를 사용하여 중복 없이 새로운 요소를 추가하기 위해 hashCode() 와 equal() 메소드를 상황에 맞게 오버라이딩 해야함
		
		
		System.out.println("사용자가 정의한 Animal 클래스의 인스턴스를 HashSet에 저장하기 위해 hashCode()와 equals() 메소드를 오버라이딩");
		HashSet<Animal> hs = new HashSet<Animal>();
		
		hs.add(new Animal("고양이", "육지"));
		hs.add(new Animal("고양이", "육지"));
		hs.add(new Animal("고양이", "육지")); // 같은 값을 가지는 인스턴스를 여러 번 저장해도 1개만 저장됨
		
		System.out.println(hs.size());
		
		//iterator
		Iterator<Animal> iter03 = hs.iterator();
		while(iter03.hasNext()) {
			Animal animal = iter03.next();
			System.out.println(animal.species + " ");
		}
		System.out.println();
		
		//해시 알고리즘(hash algorithm)
		// 해시 함수를 사용하여 데이터를 해시 테이블에 저장하고 다시 검색하는 알고리즘
		// 해시 알고리즘을 이용한 자료구조는 배결과 연결 리스트로 구현
		//  => 저장할 데이터의 키값을 해시 함수에 넣어 반환되는 값으로 배열의 인덱스값을 구함
		//    => 해당 인덱스에 저장된 연결 리스트에 데이터를 저장
		// 주소를 테이블로 만들어서(해시테이블) 주소값을 저장하여 요소를 더 빠르게 찾을 수 있음
		// 검색에 최적화되어있음. 자료가 많아서 검색보단 빠름
		
		//TreeSet<E> 클래스
		// 데이터 정렬상태로 저장되는 이진 검색 트리
		// 컴퓨터에서는 이진트리를 많이 사용 => 데이터 추가, 제거 등 기본 동작시간이 매우빠름
		// 검색이 빨라짐
		// 노드가 2개 => 3개가 되면 검색하기 힘듬
		// Set 인테페이스 구현 -> 요소를 순서에 상관없이 저장. 중복값 저장 x
		
		System.out.println("TreeSet<E> 클래스");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//add() 메소드를 이용한 요소의 저장
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (int e : ts) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//remove() 메소드를 이용한 요소의 제거
		ts.remove(40);
		
		//iterator() 메소드를 이용한 요소의 출력 - 반복
		Iterator<Integer> iter = ts.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("이진 검색 트리의 크기 : " + ts.size());
		
		//subSet() 메소드를 이용한 부분 집합의 출력
		//=> TreeSet 인스턴스에 저장되는 요소가 모두 정렬된 상태이기에 동작 가능한 해당트리의 부분집합만 보여주는 메소드
		System.out.println(ts.subSet(10, 20)); // 10이상 20미만
		// => 원형 : public NavigableSet<E> subSet(E fromElement, E toElement)
		//    -> 첫 번째 매개변수에 해당되는 요소 ~ 두 번째 매개변수로 전달된 값에 해당하는 요소 바로 직전까지 반환
		
		System.out.println(ts.subSet(10, true, 40, true));
		// => 원형 : public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
		//	  -> 두 번째 매개변수 : 첫 번째 매개변수에 해당되는 요소를 출력할 포함(이상) true 안하면(초과) false
		//    -> 네 번째 매개변수 : 세 번째 매개변수에 해당되는 요소를 출력할 포함(이하) true 안하면(미만) false
		// => 그치만 40으로 true 를 해도 40이 remove 되었기에 30까지만 출력
		
		//=> TreeSet 인스턴스에 저장되는 요소들은 모두 정렬된 상태로 저장됨
		
		//Set 인터페이스 메소드
		// Collection 인터페이스를 상속받음. -> Collection 인터페이스에서 정의한 메소드 모두 사용 가능
		// 주요 메소드
		/*
		boolean add(E e)	해당 집합(set)에 전달된 요소를 추가함. (선택적 기능)
		void clear()	해당 집합의 모든 요소를 제거함. (선택적 기능)
		boolean contains(Object o)	해당 집합이 전달된 객체를 포함하고 있는지를 확인함.
		boolean equals(Object o)	해당 집합과 전달된 객체가 같은지를 확인함.
		boolean isEmpty()	해당 집합이 비어있는지를 확인함.
		Iterator<E> iterator()	해당 집합의 반복자(iterator)를 반환함.
		boolean remove(Object o)	해당 집합에서 전달된 객체를 제거함. (선택적 기능)
		int size()	해당 집합의 요소의 총 개수를 반환함.
		Object[] toArray()	해당 집합의 모든 요소를 Object 타입의 배열로 반환함.*/
	}

}
