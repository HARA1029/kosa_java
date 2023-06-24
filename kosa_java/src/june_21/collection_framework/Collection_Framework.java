package june_21.collection_framework;

import java.util.*;

public class Collection_Framework {//~6/22
	//57. 컬렉션 프레임워크의 개념
	//컬렉션 프레임워크
	// 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
	// 데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해놓은 것
	// 자바의 인터페이스에서 사용하여 구현
	// 자료구조를 두개를 모아놓은 것
	
	//컬렉션 프레임워크 주요 인터페이스
	// 다중 상속 가능
	// List Collection 인터페이스를 상속 받음. 순서가 있는 데이터 집합. 중복 허용
	// Set Collection 인터페이스를 상속 받음. 순서가 없는 데이터 집합. 중복 x
	// Map kvp(key value pair). Collection 인터페이스를 상속 별도 정의.  
	
	//주요 인터페이스 간의 상속관계
	// Iterable<E> : 반복할 수 있는
	// E : Element
	
	//주요 인터페이스의 간략한 특징
	// List<E>
	//	vector 입력순으로 저장됨. 메모리의 일직선으로 되어 있기 때문에 요소를 찾기 쉬움
	//    중간에 수정 삭제를 하면 중간에 새로운 자료를 수정에서 넣을 경우 그 자리 비우고 한칸뛱 뒤로 복사해서 밀어서 넣음. 따라서 처리속도가 느림
	//	  검색 작업이 많을 때 사용
	//    맨뒤에서 넣었다 뻈다 넣었다 하는 경우엔 사용하기 좋음
	//    한방향으로 넣었다(push) 뺐다(pob) 하는 경우 : stack을 만듬
	//  LinkedList 요소를 찾기 위해서는 벡터보다 시간이 오래 걸림. 왜냐면 검색시에 맨처음 요소부터 차례대로 찾아야하기 때문
	// 	 수정 삭제는 빠름(중간에 노드를 넣어서 앞뒤를 연결해주면 됨)
	//	 수정.삭제 많은 자료에 사용. 단방향
	//   양방향으로 쓰는 doubleLinkedList 있음
	//  Queue
	//    FIFO
	// Set<E>
	//  HashSet
	//    공식에 의해서 주소값을 바로 계산 할수 있기 때문에 처리속도가 빠름. 검색이 빠름
	//  TreeSet
	// Map<K,V>
	//  그래프는 복잡하기 때문에 제외
	// TreeMap : 나무구조
	
	
	public static void main(String[] args) {
		//collection 클래스
		//  컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스
		//	모든 컬랙션 클래스는 List, Set, Map 인터페이스 중 하나의 인터페이스를 구현
		//  클래스 이름에도 구현한 인터페이스의 이름이 포함되어 바로 구분 가능
		//  vactor나 hashtable 도 아직 남아있지만 ArrayList 나 HashMap 사용하는 것이 성능면에서 더 좋음
		
		// 리스트 생성
		ArrayList<String> arrList = new ArrayList<String>();
		
		//리스트에 요소 저장
		arrList.add("넷");
		arrList.add("셋");
		arrList.add("둘");
		arrList.add("하나");
		
		//리스트 요소 출력
		for(int i = 0; i < arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		//collection 인터페이스
		// 컬렉션을 다루는데 가장 기본적인 동작들을 정의하고 메소드로 제공
		/* boolean add(E e)	해당 컬렉션(collection)에 전달된 요소를 추가함. (선택적 기능)
			void clear()	해당 컬렉션의 모든 요소를 제거함. (선택적 기능)
			boolean contains(Object o)	해당 컬렉션이 전달된 객체를 포함하고 있는지를 확인함.
			boolean equals(Object o)	해당 컬렉션과 전달된 객체가 같은지를 확인함.
			boolean isEmpty()	해당 컬렉션이 비어있는지를 확인함.
			Iterator<E> iterator()	해당 컬렉션의 반복자(iterator)를 반환함.
			boolean remove(Object o)	해당 컬렉션에서 전달된 객체를 제거함. (선택적 기능)
			int size()	해당 컬렉션의 요소의 총 개수를 반환함.
			Object[] toArray()	해당 컬렉션의 모든 요소를 Object 타입의 배열로 반환함.*/

	}

}
