package june_19.classMember;

class Field {
	static int classVar = 10; //클래스 변수 선언
	int instanceVar = 20;	// 인스턴스 변수 선언
}

public class ClassMember_Field {
	//37. 필드의 구분
	// 필드 : 클래스에 포함된 변수
	//지역 변수 : 특정한 지역 의미, 함수 내에서만 사용가능
	// 초기화 하지 않으면 컴파일러 발생
	// 인스턴스 변수 : 클래스 내에서 공유할 수 있는 변수. 인스턴스 생성될 때.
	// 클래스 변수 : static 을 붙이면 클래스 변수가 됨. 
	// 클래스 영역에 위치한 변수 중 static 키워드를 가지지 않는 변수는 인스턴스 변수(instance variable)
	// 여러클래스 사이 공유 가능한 것 : 클래스변수
	
	public static void main(String[] args) {
		int var = 30;	// 지역 변수 선언
		System.out.println(var + "\n");// 지역변수 참조
		
		Field myField1 = new Field();	//인스턴스 생성
		Field myField2 = new Field();	//인스턴스 생성
		
		System.out.println(Field.classVar); //클래스 변수 참조
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n");
		
		myField1.classVar = 100;	//클래스 변수 값을 변경
		
		System.out.println(Field.classVar); //클래스 변수 참조
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n");
		
		System.out.println(myField1.instanceVar); //인스턴스 변수 참조
		System.out.println(myField2.instanceVar + "\n"); 
		
		myField1.instanceVar = 200;	//인스턴스 변수의 값을 변경
		
		System.out.println(myField1.instanceVar); //인스턴스 변수 참조
		System.out.println(myField2.instanceVar);
		
		// 인스턴스 변수로 사용이 가능하면 클래스 변수로 사용하지 말 것 => 메모리 사용만 증가함
	}
}
