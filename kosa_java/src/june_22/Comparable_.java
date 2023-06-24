package june_22;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;
//Comparable<T> 인터페이스
class Car implements Comparable<Car> {
	private String modelName;
	private int modelYear;
	private String color;
	
	Car(String mn, int my, String c) {
		this.modelName = mn;
		this.modelYear = my;
		this.color = c;
	}
	
	public String getModel() {
		return this.modelYear +"식" + this.modelName + " " + this.color;
	}
	
	public int compareTo(Car obj) {
		if(this.modelYear == obj.modelYear) {
			return 0;
		} else if(this.modelYear < obj.modelYear) {
			return -1;
		} else {
			return 1;
		}
	}
}
//Comparator<T> 인터페이스
class DescendingOrder implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2 ) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Integer c1 = (Integer)o1;
			Integer c2 = (Integer)o2;
			return c2.compareTo(c1);
		}
		return -1;
	}
}

public class Comparable_ {
	//63. Comparable
	//Comparable과 Comparator
	public static void main(String[] args) {
		//Comparable<T> 인터페이스
		// 객체를 정렬하는데 사용되는 메소드인 compareTo() 메소드 정의
		// 같은 타입의 인스턴스를 서로 비교해야한 하는 클래스 -> Comparable 인터페이스 구현
		// String, Time, Date 같은 클래스 인스턴스 모두 정렬 가능(Boolean 제외)
		// 기본정렬 순서 : 작은 값 -> 큰 값 (오름차순)
		System.out.println("Comparable<T> 인터페이스");
		//인스턴스의 비교를 위해 사용자 정의 클래스인 Car 클래스가 Comparable 인터페이스를 구현하는 예제
		Car car01 = new Car("아반떼", 2016, "노란색");
		Car car02 = new Car("소나타", 2010, "흰색");
		
		System.out.println(car01.compareTo(car02));
		
		//Comparable 인터페이스로 정렬할 때 사용하는 메소드
		//=> int compareTo(T o) : 해당 객체와 전달된 객체의 순서를 비교
		
		//Comparator<T> 인터페이스
		// 객체를 정렬하는데 사용하는 인터페이스.
		// 기본적으로 오름차순으로 정렬하는 Compable과 달리 Comparator 는 내림차순이나 다른 기준으로 정렬하고 싶을 때 사용
		//	 => 오름 차순 이외의 기준으로 정렬 가능
		// compare() 메소드 (추상메소드)를 재정의 하여 비교
		
		System.out.println("Comparator<T> 인터페이스");
		//내림차순으로 정렬하여 저장하는 TreeSet 인스턴스 생성하기 위해 Comparator 인터페이스 구현하는 예제
		TreeSet<Integer> ts = new TreeSet<Integer>(new DescendingOrder());
		
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		
		Iterator<Integer> iter = ts.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Comparator 인터페이스로 정렬할 때 사용하는 메소드
		// int compare(T o1, T o2) : 전달된 두 객체의 순서를 비교
		// boolean equals(Object obj) : 해당 comparator 와 전달된 객체가 같은지 확인
		// default Comparator<T> reversed() : 해당 comparator 의 역순인 comparator 를 반환
	
	}

}
