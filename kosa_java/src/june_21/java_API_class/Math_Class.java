package june_21.java_API_class;

import java.util.Random;

public class Math_Class {
	//50. Math 클래스
	// 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
	// 클래스 메소드(static method) 이므로 객체 생성하지 않고 바로 사용 가능	
	
	//Math.E, Math.PI
	//Math.E : 오일러의 수. 자연로그의 밑(base) 값. 약 2.718
	//Math.PI : 원의 원주를 지름으로 나누 비율(원주율) 값. 약 3.14159
	
	
	public static void main(String[] args) {
		//random() 메소드
		// 0.0이상 1.0 미만 범위의 임의의 double 형 값 생성
		// java.util 패키지의 Random 클래스를 이용한 의사 난수 발생기 사용하여 임의의 수 생성
		// Random 클래스의 nextInt 사용해도 난수 생성 가능
		System.out.println((int)(Math.random()*100));
		
		Random ran = new Random();
		System.out.println(ran.nextInt(100));
		
		//abs() 메소드
		//전달값이 음수이면 그 값의 절댓값을 반환
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-3.14));
		
		//floor() 메소드, ceil() 메소드, round() 메소드 : 많이 씀
		//floor 버림, ceil 올림, round 반올림
		System.out.println(Math.ceil(10.0));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.000001));
		
		System.out.println(Math.floor(10.0));
		System.out.println(Math.floor(10.9));
		
		System.out.println(Math.round(10.0));
		System.out.println(Math.round(10.4));
		System.out.println(Math.round(10.5));
		
		//max() 메소드, min() 메소드
		//max 두 개중 큰 값, min 두 개 중 작은값
		System.out.println(Math.max(3.14, 3.14159));
		System.out.println(Math.min(3.14, 3.14159));
		
		System.out.println(Math.max(-10, -11));
		System.out.println(Math.min(-10, -11));
		
		//pow() 메소드와 sqrt() 메소드
		//pow : 제곱, sqrt 제곱근
		
		System.out.println((int)Math.pow(5, 2));
		System.out.println((int)Math.sqrt(25));
		
		//sin() 메소드, cos() 메소드, tan() 메소드
		//삼각함수를 double 형으로 반환
		
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.PI/6));
		
		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.PI/4));
		
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.PI/3));
		
		
	}

}
