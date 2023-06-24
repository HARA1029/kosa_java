package june_22;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_And_Queue {
	//59.Stack 과 Queue
	public static void main(String[] args) {
		//Stack<E> 클래스
		// List 컬렉션 클래스의 Vector 클래스를 상속받아, 전형적인 스택메모리 구조의 클래스를 제공
		// 메모리 구조 = > LIFO(Last In First Out) 후입선출
		//  -> 나중에 저장(push)된 데이터가 가장 먼저 인출(pop) 되는 구조
		// 맨 밑을 bottom 맨 위를 top 이라고 함
		// Vector 클래스에서 상속받은 메소드 5가지
		//	boolean empty() : 비어 있으면 true, 않으면 false
		// 	E push(E item)  : 새로운 전달 요소 상단에 넣음 
		//  E pop() : 상단에 있는 요소(맨마지막 저장요소) 빼기 
		//  E peek() : 상단에 있는 요소(맨마지막 저장요소) 반환
		//	int search(Object o) 전달될 객체가 존재하는 위치 인덱스 반환
		//		-> 제일 상단에 있는 요소부터 index[0]
		// 더욱 복잡하고 빠른 스택을 구현하고 싶으면 Deque(양방향으로 넣을 수 있는 것) 인터페이스 구현하는 ArrayDeque 사용
		//		=> Deque<Integer> st = new ArrayDeque<Integer>();
		
		System.out.println("Stack<E> 클래스");
		//Stack 메소드 이용하여 스택 메모리 구조를 구현
		Stack<Integer> st = new Stack <Integer>(); //스택의 생성
		//Deque<Integer> st = new ArrayDeque<Integer>();
		// ArrayDeque 는 search() 메소드를 지원하지 않음
		
		//push() 메소드를 이용한 요소의 저장
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);
		
		//peek() 메소드를 이용한 요소의 반환
		System.out.println(st.peek()); // 가장 위에 있는 것 반환
		System.out.println(st); // 전체 출력
		
		//pop() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(st.pop());
		System.out.println(st);
		
		//search() 메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println();
		
		//Queue<E> 인터페이스
		// 큐 메모리 구조는 클래스가 아닌 인터페이스 형태로 제공
		// Queue 인터페이스를 상속받는 하위인터페이스
		//	1. Deque<E>
		//  2. BlockingDeque<E>
		//  3. BlockingQueue<E>
		//  4. TransferQueue<E>
		// 직간접적으로 Queue 인터페이스를 구현하는 클래스는 많지만 그중에서 Deque 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조 구현시 가장 많이 사용됨
		// 선형 메모리 공간에 데이터 저장 -> 선입선출(FIFO) 시멘틱을 따르는 자료 구조
		//  -> 가장 먼저 저장(push)된 데이터가 가장 먼저 인출(pop) 되는 구조
		// Collection 인터페이스에서 상속받은 메소드
		/* 		
		boolean add(E e): 해당 큐의 맨 뒤에 전달된 요소 삽입. 삽입에 성공 true 반환, 큐에 여유 공간이 없어 삽입에 실패시 IllegalStateException을 발생.
		E element() : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소 반환
		boolean offer(E e) : 해당 큐의 맨 뒤에 전달된 요소 삽입
		E peek() : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소 반환. 만약 큐가 비어있으면 null 반환
		E poll() : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소 반환 후 해당 요소 큐에서 제거. 만약 큐가 비어있으면 null 반환
		E remove() : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소 제거
		 */
		
		System.out.println("Queue<E> 인터페이스");
		
		LinkedList<String> qu = new LinkedList<String>(); //큐의 생성
		//Deque<String> qu = new ArrayDeque<String>(); 
		//  => 더욱 복잡하고 빠른 큐를 구현하고 싶을 때 Deque 인터페이스 구현한 ArrayDeque 클래스 사용
		//  => ArrayDeque 클래스는 스택과 큐 메모리 구조를 모두 구현하는데 적합한 클래스
		
		//add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");
		
		//peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);
		
		//poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);
		
		//remove() 메소드를 용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);
		
		
	}

}
