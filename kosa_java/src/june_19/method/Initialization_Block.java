package june_19.method;

class Car2 {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;

	{	// 인스턴스 초기화 블록
		this.currentSpeed = 0;
	}
	
	Car2() {}
	Car2(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public int getSpeed() {
		return currentSpeed;
	}
}

class InitBlock {

    static int classVar = 10; // 클래스 변수의 명시적 초기화
    int instanceVar = 10;     // 인스턴스 변수의 명시적 초기화

    static { // 클래스 초기화 블록을 이용한 초기화
        classVar = 10;
    }
    {instanceVar = 20;}	//인스턴스 초기화 블록을 이용한 초기화
    
    InitBlock() {instanceVar = 30; }	//생성자를 이용한 초기화
}
public class Initialization_Block {// 초기화 블록

	public static void main(String[] args) {
		//39. 초기화 블록
		// 명시적 초기화 : 많이 쓰임
		// => 지역 변수를 초기화 하는 방법과 같이 필드 선언과 동시에 초기화
		// 명령문, 제어문 등 사용가능
		
		//인스턴스 초기화 블록 : 중괄호 만으로 정의. 인스턴스 실행할 때 정의
		// 생성자보다 먼저 실행. 그러나 잘 사용하지 않지만 여러가지 생성자를 사용시에 사용
		
		// 필드 초기화 순서
		//1. 클래스 변수 : 기본값 → 명시적 초기화 → 클래스 초기화 블록
		//2. 인스턴스 변수 : 기본값 → 명시적 초기화 → 인스턴스 초기화 블록 → 생성자
		
		Car2 myCar = new Car2();					// 인스턴스 생성
		System.out.println(myCar.getSpeed());	// 인스턴스 메소드의 호출
	    System.out.println(InitBlock.classVar); // 클래스 변수에 접근
	    InitBlock myInit = new InitBlock();
		System.out.println(myInit.classVar);	// 클래스 변수에 접근
		System.out.println(myInit.instanceVar); //30
	}
}
