package june_16;

public class Type {
	public static void main(String[] args) {
		/*
		//묵시적 타입 변환(자동 타입 변환, implicit conversion)
		double num1 = 10;
		//int num2 = 3.14;
		double num3 = 7.0f + 3.14;
		
		System.out.println(num1); //10.0
		//System.out.println(num2); // 에러발생
		System.out.println(num3); //10.14
		
		byte num1 = 100;	//ok
		byte num2 = 200;	//type mismatch
		int num3 = 9876543210; //out of range
		long num4 = 9876543210;	//out of range
		float num5 = 3.14;	//type mismatch
		*/
		
		//명시적 타입 변환(강제 타입 변환, explicit conversion)
		
		int num1 = 1, num2 = 4;
		double result1 = num1/num2;
		double result2 = (double)num1/num2;
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
