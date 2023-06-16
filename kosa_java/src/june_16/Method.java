package june_16;

public class Method {

	public static void main(String[] args) {
		//29. 메소드의 개념
		//접근제어자 반환타입 메소드 이름(매개변수목록){ //선언부
		// 구현부
		// }
		//매개변수 목록(parameters) : 메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시
		//메소드 시그니처(method signature)란 메소드의 선언부에 명시되는 매개변수의 리스트
		// 만약 두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면, 이 두 메소드의 시그니처는 같다고 할 수 있다.
	
		Car myCar = new Car("Lamborgini", 2017);
		//myCar.color = "Red";//private 이기 떄문에 에러 발생
		System.out.println(myCar.getModel());
	}

}

class Car {//클래스명

	//클래스의 구성요소
	
	private String modelName;	//필드
	private int modelYear;		//필드
	private String color = "yellow";
	private int currentSpeed;
	private int accelerationTIme;
		
	Car(String modelName, int modelYear) {
		this.modelName = modelName; //필드에 사용하는 것과 생성자 명이 같이 때문에 this. 으로 필드에 있는 것을 불러옴
		this.modelYear = modelYear;
	}
	
	public String getModel() { //메소드
		accelerate(100, 10);
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
	
	public void accelerate(int speed, int second) {//선언부
		//구현부
		System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
		
	}
}
