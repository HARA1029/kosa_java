package june_22;

import java.util.ListIterator;
import java.util.*;

public class Iterator {
	//62. Iterator
	//Iterator와 ListIterator
	public static void main(String[] args) {
		//Iterator<E> 인터페이스
		// Iterator 인터페이스로 컬렉션에 저장된 요소를 읽어오는 방법을 표준화함
		// Collection 인터페이스에서 Iterator 인터페이스를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근
		//  => Collection 인터페이스를 상속받는 List 와 Set 인터페이스에서도 iterator() 메소드 사용 가능
		// Iterator 인터페이스로 컬렉션 각 요소에 접근 할 수 있는 메소드
		/*
		 boolean hasNext()	해당 이터레이션(iteration)이 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
		 E next()	이터레이션(iteration)의 다음 요소를 반환함.
		 default void remove()	해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거함. (선택적 기능)
		 */
		// Enhanced for문 : 같은 성능을 유지하면서도 코드의 명확성을 확보하고 발생할 수 있는 버그를 예방해줌
		
		//Enumeration<E>
		// 기존코드의 호환성을 위해 남겨놓은 것. 이걸 보면 Iterator 사용하면 됨
		
		//ListIterator<E> 인터페이스
		// Iterator 를 상속받아 여러 기능을 추가한 인터페이스
		// 한 방향만 이동할 수 있는 Iterator 인터페이스와는 달리 양방향 이동 지원
		//  -> 컬렉션 요소 대체, 추가, 인덱스 검색 등을 위한 작업
		// List 인터페이스를 구현한 List 컬렉션 클래스에서만 listIterator() 메소드를 통해 사용 가능
		
		// 리스트의 모든 요소를 순방향, 역방향으로 출력하는 예제
		LinkedList<Integer> lnkList = new LinkedList<Integer>();
		
		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);
		
		ListIterator<Integer> iter = lnkList.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		while(iter.hasPrevious()) { // 역방향
			System.out.print(iter.previous() + " ");
		}
		
		//ListIterator 인터페이스로 컬렉션 각 요소에 접근 할 수 있는 메소드
		/*
		void add(E e)	해당 리스트(list)에 전달된 요소를 추가함. (선택적 기능)
		boolean hasNext()	이 리스트 반복자가 해당 리스트를 순방향으로 순회할 때 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
		boolean hasPrevious()	이 리스트 반복자가 해당 리스트를 역방향으로 순회할 때 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
		E next()	리스트의 다음 요소를 반환하고, 커서(cursor)의 위치를 순방향으로 이동시킴.
		int nextIndex()	다음 next() 메소드를 호출하면 반환될 요소의 인덱스를 반환함.
		E previous()	리스트의 이전 요소를 반환하고, 커서(cursor)의 위치를 역방향으로 이동시킴.
		int previousIndex()	다음 previous() 메소드를 호출하면 반환될 요소의 인덱스를 반환함.
		void remove()	next()나 previous() 메소드에 의해 반환된 가장 마지막 요소를 리스트에서 제거함. (선택적 기능)
		void set(E e)	next()나 previous() 메소드에 의해 반환된 가장 마지막 요소를 전달된 객체로 대체함. (선택적 기능)*/

	}

}
