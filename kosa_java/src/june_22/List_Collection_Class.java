package june_22;

import java.util.*;
import java.util.Iterator;


public class List_Collection_Class {
	//58. List 컬렉션 클래스
	// List 인터페이스를 구현한 모든 List 컬렉션 클래스의 특징
	// 1. 요소의 저장 순서가 유지
	// 2. 같은 요소의 중복 저장 허용
	// List 컬렉션 클래스에 속하는 클래스
	// 1. ArrayList<E>
	// 2. LinkedList<E>
	// 3. Vector<E>
	// 4. Stack<E>

	public static void main(String[] args) {
		//ArrayLIst<E> 클래스
		// 내부 배열을 이용하여 요소 저장
		// 요소에 빠르게 접근 가능
		// 크기를 변경할 수 없는 인스턴스
		//  => 크기를 늘리기 위해서 새로운 배열을 생성. 기존 요소드을 옮겨야 함
		//		-> 자동으로 수행되는 과정이지만 복잡하고 추가 및 삭제시 시간이 많이 걸림. -> 왜냐면 요소를 하나하나 움직여야 하기 때문
		// Collections 클래스 : 컬렉션에서 동작하거나 컬렉션을 반환하는 클래스(static) 메소드만으로 구성된 클래스
		// Collection : 인터페이스, Collections : 클래스
		System.out.println("ArrayList<E>");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//add() 메소드를 이용한 요소의 저장
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		//for 문과 get() 메소드를 이용한 요소의 출력
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		
		//remove() 메소드를 이용한 요소의 제거
		arrList.remove(1);
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for(int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(arrList);
		
		//iterater() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<Integer> iter = arrList.iterator();  //외우기
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		//set() 메소드를 이용한 요소의 변경
		arrList.set(0, 20); //index[0] = 10 을 20 으로 변경
		
		for(int e:arrList) { // 타입 요소 : array 
			System.out.print(e + " ");
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("리스트의 크기 : " + arrList.size());
		
		//   => 클래스의 요소를 출력하는 방법에는 for 문과 enhanced for 문, iterator() 메소드를 이용한 방법 등 다양한 방법 사용 가능
		
		System.out.println();
		System.out.println("LinkedList<E>");
		//LinkedList<E> 클래스
		// ArrayList 클래스의 단점을 극복하기 위해 만들어짐
		// 내부적으로 연결된 리스트(linked list)를 이용하여 요소를 저장
		// 저장된 요소가 순차적으로 저장된 배열
		// 연결리스트 : 저장요소가 비순차적으로 분포 -> 요소들 사이에 링크(link)로 연결하여 구성
		// 단일 연결 리스트(singly linked list) : 단방향
		//  => 다음 요소를 가리키는 참조만을 가지는 연결리스트
		// 	=> 추가삭제 빠름. 메모리 적게 사용. but 이전 요소로 접근하기 어려움
		// 이중 연결 리스트(doubly linked list) : 양방향
		//  => 이전 요소를 가르키는 참조도 가짐 but 메모리가 주소값 만큼 늘어나서 메모리를 좀 더 많이 사용
		// List 인터페이스 구현
		
		LinkedList<String> lnkList = new LinkedList<String>();
		
		//add() 메소드를 이용한 요소의 저장
		lnkList.add("넷");
		lnkList.add("둘");
		lnkList.add("셋");
		lnkList.add("하나");
		
		//for 문과 get() 메소드를 이용한 요소의 출력
		for(int i = 0; i < lnkList.size();i++) {
			System.out.print(lnkList.get(i) + " ");
		}
		System.out.println();
		
		//remove() 메소드를 이용한 요소의 제거
		lnkList.remove(1);
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for(String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//set() 메소드를 이용한 요소의 변경
		lnkList.set(2, "둘");
		
		for(String e: lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("리스트의 크기 : " + lnkList.size());
		
		//=> ArrayList와 LinkedList 차이 :  사용법 x, 내부적으로 요소를 저장하는 방법 
		
		//Vector<E> 클래스
		// ArrayList 클래스와 같은 동작을 수행하는 클래스
		// 현재는 호환성만 남았기에 ArrayList 를 사용하는 것이 좋음
		// ArrayList아 차이 : 크기조절이 차이 있음
		
		//List 인터페이스 메소드
		// List 인터페이스는 Collection 인터페이스를 상속 받기 때문에 Collection 에서 정의한 메소드 모두 사용 가능
		/*
		boolean add(E e)	해당 리스트(list)에 전달된 요소를 추가함. (선택적 기능)
		void add(int index, E e)	해당 리스트의 특정 위치에 전달된 요소를 추가함. (선택적 기능)
		void clear()	해당 리스트의 모든 요소를 제거함. (선택적 기능)
		boolean contains(Object o)	해당 리스트가 전달된 객체를 포함하고 있는지를 확인함.
		boolean equals(Object o)	해당 리스트와 전달된 객체가 같은지를 확인함.
		E get(int index)	해당 리스트의 특정 위치에 존재하는 요소를 반환함.
		boolean isEmpty()	해당 리스트가 비어있는지를 확인함.
		Iterator<E> iterator()	해당 리스트의 반복자(iterator)를 반환함.
		boolean remove(Object o)	해당 리스트에서 전달된 객체를 제거함. (선택적 기능)
		boolean remove(int index)	해당 리스트의 특정 위치에 존재하는 요소를 제거함. (선택적 기능)
		E set(int index, E e)	해당 리스트의 특정 위치에 존재하는 요소를 전달받은 객체로 대체함. (선택적 기능)
		int size()	해당 리스트의 요소의 총 개수를 반환함.
		Object[] toArray()	해당 리스트의 모든 요소를 Object 타입의 배열로 반환함.
*/
	}
}
