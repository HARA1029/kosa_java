package june_16;

public class Car_ {//클래스명

		//클래스의 구성요소
		
	private String modelName;	//필드
	private int modelYear;		//필드
	private String color = "yellow";
	private int currentSpeed;
	private int accelerationTIme;
		
	Car_(String modelName, int modelYear) {
		this.modelName = modelName; //필드에 사용하는 것과 생성자 명이 같이 때문에 this. 으로 필드에 있는 것을 불러옴
		this.modelYear = modelYear;
	}
	
	public String getModel() { //메소드
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
	
	public void accelerate(int speed, int second) {//선언부
		//구현부
		System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
		
	}
	
	public static void main(String[] args) {
		Car_ myCar = new Car_("Lamborgini", 2017);
		System.out.println(myCar.getModel());
		myCar.accelerate(60, 3);
	}
	
}
