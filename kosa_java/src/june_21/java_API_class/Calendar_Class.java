package june_21.java_API_class;

import java.util.Calendar;

public class Calendar_Class {
	//54. Canlendar 클래스
	// 인덱스로 쓰기 때문에 0~11 로 사용
	
	//java.util.Calendar 클래스
	//  자바에서 날짜와 시간에 대한 데이터를 손쉽게 처리할 수 있도록 제공해주는 추상클래스
	//    => 추상클래스인 이유 : 나라마다 사요하는 달력체계가 조금씩 다름
	// 모든 필드는 클래스 변수(static variable) -> 객체 생성하지 않고 바로 사용 가능
	
	//java.util.GregorianCalendar 클래스
	
	
	public static void main(String[] args) {
		//add() 메소드
		// 특정 시간을 기준으로 일정 시간 전후의 날짜와 시간을 알 수 있음 
		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		
		time.add(Calendar.SECOND, 120);
		System.out.println(time.getTime());
		
		//before(), after()
		// 두 시간상 전후 관계만 알고 싶을 때 사용
		// before() : 현재 Calendar 인스턴스가 전달된 객체가 나타나는 시간보다 앞서는지 판단
		// after() : 현재 Calendar 인스턴스가 전달된 객체가 나타나는 시간보다 나중인지 판단
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		
		time2.set(1982, 2, 19);
		time3.set(2027, 2, 19);
		
		System.out.println(time1.before(time2));
		System.out.println(time1.before(time3));
		
		System.out.println();
		
		//get() 
		// Calendar 필드에 저장된 값 반환
		
		Calendar time4 = Calendar.getInstance();
		System.out.println(time4.getTime());
		System.out.println(time4.get(Calendar.DAY_OF_WEEK));
		System.out.println(time4.get(Calendar.MONTH) + 1); // 월은 0~ 11 로 표현되기 때문에  + 1 gowna
		System.out.println(time4.get(Calendar.DAY_OF_MONTH));
		System.out.println(time4.get(Calendar.MINUTE));
		System.out.println(time4.get(Calendar.SECOND));
		System.out.println(time4.get(Calendar.YEAR));
		
		
		
		//roll()
		// 일정한 시간만큼 더하거나 빼줌.
		// add() 와 달리 Calendar 필드에는 영향을 주지 않음.
		// 계산 결과가 해당필드의 최댓값, 최소값을 넘어가도 다른 필드에 영향을 주지 않음
		
		Calendar time5 = Calendar.getInstance();
		Calendar time6 = Calendar.getInstance();
		System.out.println(time5.getTime());
		
		time5.add(Calendar.SECOND, 60);
		System.out.println(time5.getTime()); // 1분 증가
		
		time6.roll(Calendar.SECOND, 60);
		System.out.println(time6.getTime()); // 60초 증가해서 분 단위에 영향 주지 x => 같은 값 출력
				
		//set()
		// Calendar 필드를 특정값을 설정
		
		Calendar time7 = Calendar.getInstance();
		System.out.println(time7.getTime());
		
		time.set(Calendar.YEAR, 2020);
		System.out.println(time.getTime());
		
		time.set(1982, 1, 19); //1은 2월
		System.out.println(time.getTime());
		
		time.set(1982, 1, 19, 12, 34, 56);
		System.out.println(time.getTime());
		
	}

}
