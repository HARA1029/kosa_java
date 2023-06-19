package june_19.modifier;

public class Modifier_Access_Modifier {

	public static void main(String[] args) {
		// 35. 접근제어자
		// private, public, default, protected
		
		//private : 외부접근 불가. 내부 접근 가능. 같은 클래스만 허용
		// 메소드에도 선언 가능. 외부 호출 불가
		
		//public : 외부 호출 가능. 외부에서 무언갈 하게 하거나 내부에 선언된걸 사용하기 위해
		// 함수 없이 사용가능
		
		//default : 같은 클래스의 멤버와 같은 패키지에 속하는 멤버에서만 접근 가능
		// 다른 패키지 접근 불가
		
		//protected : 외부 접근 불가. 상속
		// 내외부의 자식클래스는 부모클래스에 접근가능
		
		//public > protected > default > private
		
		//36.기타 제어자 
		//final 제어자
		//오버라이딩 : 덮어쓰기
		//final = > 나는 가능. 자식은 불가
	}

}
