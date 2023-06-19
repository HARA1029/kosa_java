package june_19.method;

class Car1 {

    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car1(String modelName, int modelYear, String color, int maxSpeed, int currnetSpeed) {
    	//매개변수 있음. this 참조 변수를 이용하여 인스턴스 변수에 접근
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;

    }

    Car1() {
    	//매개변수 없음. 내부에서 this() 메소드를 이용하여 첫번째 생성자를 호출
        this("소나타", 2012, "검정색", 160, 30); // 다른 생성자를 호출하여 인스턴스 초기화 시킴
    }


	public String getModel() {
	    return this.modelYear + "년식 " + this.modelName + " " + this.color + " " + this.maxSpeed + " " + this.currentSpeed;
	}
}

public class Method_This {
	//31. this, this()
	//this 는 인스턴스 메소드안에서만 사용 가능
	//this() 같은 클래스의 다른 생성자 호출시에 사용
	
	 public static void main(String[] args) {
		 Car1 tcpCar = new Car1(); 
		 System.out.println(tcpCar.getModel());
	 }

}
