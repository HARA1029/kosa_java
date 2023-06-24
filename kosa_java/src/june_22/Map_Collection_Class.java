package june_22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

//무언갈 가지고 검색하면 hash, 키와 값으로 저장하면 map, 중복 가능 set, 
// hash 로 검색에서 시간을 줄일 수 있음

public class Map_Collection_Class {
	//61. Map 컬렉션 클래스
	public static void main(String[] args) {
		//Map 컬렉션 클래스
		// Collection 인터페이스와 다른 저장 방식
		// Map 인터페이스로 구현
		// 키와 값을 하나의 쌍으로 저장하는 방식(key-value 방식) -> key : 실질적인 값(value) 을 찾기 위한 이름의 역할
		// 특징
		// 1. 요소의 저장 순서를 유지하지 x
		// 2. 키 : 중복 x, 값 : 중복 o
		// Map 컬렉션에 속하는 대표적 클래스
		// 1. HashMap<K, V>
		// 2. Hashtable<K, V>
		// 3. TreeMap<K, V>

		//HashMap<K, V> 클래스
		// Map 컬렉션 클래스에서 가장 많이 사용되는 클래스
		// 해시 알고리즘을 사용하여 검색 속도가 매우 빠름
		// Map 인터페이스 구현 => 중복되는 키 값을 저장할 수 없지만 값은 중복해서 다른 키 값에 저장 가능
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//put() 메소드를 이용한 요소의 저장
		hm.put("삼십", 30);
		hm.put("십", 10);
		hm.put("사십", 40);
		hm.put("이십", 20);
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		// => 배열과 컬렉션 프레임워크에서 해당 인스턴스에 저장된 모든 요소를 순회할 경우 자주 사용되는 반복문
		
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		for(String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s",key, hm.get(key)));
		}
		System.out.println();
		
		//remove() 메소드를 이용한 요소의 제거
		hm.remove("사십");
		
		//iterator() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s",key, hm.get(key)));
		}
		System.out.println();
		
		//replace() 메소드를 이용한 요소의 수정
		hm.replace("이십", 200);
		
		for(String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s",key, hm.get(key)));
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("맵의 크기 : " + hm.size());
		System.out.println();
		//=> keySet() 메소드 : 해당 맵에 포함된 모든 키 값들을 하나의 집합으로 반환
		
		//HashMap<K, V> 메소드
		/*
		void clear()	해당 맵(map)의 모든 매핑(mapping)을 제거함.
		boolean containsKey(Object key)	해당 맵이 전달된 키를 포함하고 있는지를 확인함.
		boolean containsValue(Object value)	해당 맵이 전달된 값에 해당하는 하나 이상의 키를 포함하고 있는지를 확인함.
		V get(Object key)	
		해당 맵에서 전달된 키에 대응하는 값을 반환함.
		
		만약 해당 맵이 전달된 키를 포함한 매핑을 포함하고 있지 않으면 null을 반환함.
		
		boolean isEmpty()	해당 맵이 비어있는지를 확인함.
		Set<K> keySet()	해당 맵에 포함되어 있는 모든 키로 만들어진 Set 객체를 반환함.
		V put(K key, V value)	해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
		V remove(Object key)	해당 맵에서 전달된 키에 대응하는 매핑을 제거함.
		boolean remove(Object key, Object value)	해당 맵에서 특정 값에 대응하는 특정 키의 매핑을 제거함.
		V replace(K key, V value)	해당 맵에서 전달된 키에 대응하는 값을 특정 값으로 대체함.
		boolean replace(K key, V oldValue, V newValue)	해당 맵에서 특정 값에 대응하는 전달된 키의 값을 새로운 값으로 대체함.
		int size()	해당 맵의 매핑의 총 개수를 반환함.*/
		
		//Hashtable<K, V> 클래스
		// hashMap 과 비슷하게 동작
		// hashMap 이 더 빠르게 나옴. 예전 것 호환을 위해 남겨둠 => HashMap 사용하는게 좋음
		
		//TreeMap<K, V> 클래스
		// 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리(binary search tree) 형태로 저장
		//   => 추가, 삭제시 기본 동작 시간이 매우 빠름
		// 링크로 이동하기 때문에 생각보다 속도가 빠름
		// Map 인터페이스 구현 -> 중복된 키로 값 저장 불가 but 같은 값으로 다른 키에 저장 가능
		System.out.println("TreeMap<K, V>");
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		//put() 메소드를 이용한 요소의 저장
		tm.put(30, "삼십");
		tm.put(10, "십");
		tm.put(40, "사십");
		tm.put(20, "이십");
		
		//Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
		for(Integer key : tm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		System.out.println();
		
		//remove() 메소드를 이용한 요소의 제거
		tm.remove(40);
		
		//iterator() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<Integer> keys2 = tm.keySet().iterator();
		while(keys2.hasNext()) {
			Integer key = keys2.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		System.out.println();
		
		//replace() 메소드를 이용한 요소의 수정
		tm.replace(20, "twenty");
		
		for(Integer key : tm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		System.out.println();
		
		//size() 메소드를 이용한 요소의 총 개수
		System.out.println("맵의 크기 : " + tm.size());
		
		//TreeMap<K, V> 메소드
		/*
		  Map.Entry<K, V> ceilingEntry(K key)	
			해당 맵에서 전달된 키와 같거나, 전달된 키보다 큰 키 중에서 가장 작은 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.
			
			K ceilingKey(K key)	
			해당 맵에서 전달된 키와 같거나, 전달된 키보다 큰 키 중에서 가장 작은 키를 반환함.
			
			만약 해당하는 키가 없으면 null을 반환함.
			
			void clear()	해당 맵(map)의 모든 매핑(mapping)을 제거함.
			boolean containsKey(Object key)	해당 맵이 전달된 키를 포함하고 있는지를 확인함.
			boolean containsValue(Object value)	해당 맵이 전달된 값에 해당하는 하나 이상의 키를 포함하고 있는지를 확인함.
			NavigableMap<K, V> descendingMap()	해당 맵에 포함된 모든 매핑을 역순으로 반환함.
			Set<Map.Entry<K, V>> entrySet()	해당 맵에 포함된 모든 매핑을 Set 객체로 반환함.
			Map.Entry<K, V> firstEntry()	해당 맵에서 현재 가장 작은(첫 번째) 키와 그에 대응하는 값의 엔트리를 반환함.
			K firstKey()	해당 맵에서 현재 가장 작은(첫 번째) 키를 반환함.
			Map.Entry<K, V> floorEntry(K key)	
			해당 맵에서 전달된 키와 같거나, 전달된 키보다 작은 키 중에서 가장 큰 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.
			
			K floorKey(K key)	
			해당 맵에서 전달된 키와 같거나, 전달된 키보다 작은 키 중에서 가장 큰 키를 반환함.
			
			만약 해당하는 키가 없으면 null을 반환함.
			
			V get(Object key)	
			해당 맵에서 전달된 키에 대응하는 값을 반환함.
			
			만약 해당 맵이 전달된 키를 포함한 매핑을 포함하고 있지 않으면 null을 반환함.
			
			SortedMap<K, V> headMap(K toKey)	해당 맵에서 전달된 키보다 작은 키로 구성된 부분만을 반환함.
			Map.Entry<K, V> higherEntry(K key)	
			해당 맵에서 전달된 키보다 작은 키 중에서 가장 큰 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.
			
			K higherKey(K key)	
			해당 맵에서 전달된 키보다 작은 키 중에서 가장 큰 키를 반환함.
			
			만약 해당하는 키가 없으면 null을 반환함.
			
			Set<K> keySet()	해당 맵에 포함되어 있는 모든 키로 만들어진 Set 객체를 반환함.
			Map.Entry<K, V> lastEntry()	해당 맵에서 현재 가장 큰(마지막) 키와 그에 대응하는 값의 엔트리를 반환함.
			K lastKey()	해당 맵에서 현재 가장 큰(마지막) 키를 반환함.
			Map.Entry<K, V> lowerEntry(K key)	
			해당 맵에서 전달된 키보다 큰 키 중에서 가장 작은 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.
			
			K lowerKey(K key)	
			해당 맵에서 전달된 키보다 큰 키 중에서 가장 작은 키를 반환함.
			
			만약 해당하는 키가 없으면 null을 반환함.
			
			Map.Entry<K, V> pollFirstEntry()	해당 맵에서 현재 가장 작은(첫 번째) 키와 그에 대응하는 값의 엔트리를 반환하고, 해당 엔트리를 맵에서 제거함.
			Map.Entry<K, V> pollLastEntry()	해당 맵에서 현재 가장 큰(마지막) 키와 그에 대응하는 값의 엔트리를 반환하고, 해당 엔트리를 맵에서 제거함.
			V put(K key, V value)	해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
			V remove(Object key)	해당 맵에서 전달된 키에 대응하는 매핑을 제거함.
			boolean remove(K key, V value)	해당 맵에서 특정 값에 대응하는 특정 키의 매핑을 제거함.
			V replace(K key, V value)	해당 맵에서 전달된 키에 대응하는 값을 특정 값으로 대체함.
			boolean replace(K key, V oldValue, V newValue)	해당 맵에서 특정 값에 대응하는 전달된 키의 값을 새로운 값으로 대체함.
			int size()	해당 맵의 매핑의 총 개수를 반환함.
			SortedMap<K, V> subMap(K fromKey, K toKey)	
			해당 맵에서 fromKey부터 toKey까지로 구성된 부분만을 반환함.
			
			이때 fromKey는 포함되나, toKey는 포함되지 않음.
			
			SortedMap<K, V> tailMap(K fromKey)	해당 맵에서 fromKey와 같거나, fromKey보다 큰 키로 구성된 부분만을 반환함.*/
	}

}
