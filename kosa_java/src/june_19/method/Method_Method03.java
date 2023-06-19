package june_19.method;

class Car{
	private String modelName = "소나타";
	private int modelYear = 2016;
	private String color = "파란색";
	
	public String getModel() {
		return this.modelYear + "년식 " + this.color + " " + this.modelName;
	}
}

public class Method_Method03 {
	
	//30. 생성자
	// 기본 생성자
	//자바의 모든 클래스에는 하나 이상의 생성자가 정의 되어 있어야 함
	// 기본생성자는 매개변수를 하나도 가지지 않으며, 아무런 명령어도 포함하고 있지 않음
	// 컴파일 시 클래스에 생성자가 하나도 정의되어 있지 않으면 자동으로 기본생성자를 추가함
	//=> 클래스이름() {}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.getModel());
	}	
}
