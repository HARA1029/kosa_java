package june_16;

public class Operater {
	public static void main(String[] args) {
		/*
		 * 12. 산술 연산자 : 사칙연산을 다루는 연산자
		 * 
		 * 13. 대입 연산자 
		 * 	=> a = b = c : 오른쪽에서 왼쪽으로 결합
		 *  => 가능은 하지만 이렇게 쓰면 좋지 않음 되도록 2줄로 사용할 것
		 
		int num1 = 7, num2 = 7, num3 = 7;
		
		num1 = num1 -3;
		num2 -= 3;
		num3 =-3;
		
		System.out.println("-연산자에 의한 결과 : " + num1); //4
		System.out.println("-= 연산자에 의한 결과 : " + num2); //4
		System.out.println("=- 연산자에 의한 결과 : " + num3); //-3
		
		//14. 증감 연산자의 연산 순서 (좌 -> 우)
		int x = 10;
		int y = x-- + 5 + --x;
		
		System.out.println("x: "+ x + ", y: " + y);//8, 23
		
		//15. 비교 연산자
		char ch1 = 'a', ch2 = 'A';
		
		System.out.println("== 연산자에 의한 결과 : " + (ch1 == ch2)); //false
		System.out.println("> 연산자에 의한 결과 : " + (ch1 > ch2));	//true
		
		//16. 논리 연산자
		
		char ch1 = 'b', ch2 = 'B';
		boolean result1,result2;
		
		result1 = (ch1 >'a')&&(ch1 < 'z');
		result2 = (ch2 < 'A')||(ch2 < 'Z');
		
		System.out.println("&& 연산자에 의한 결과 : " + result1); //true
		System.out.println("|| 연산자에 의한 결과 : " + result2);	//true
		System.out.println("! 연산자에 의한 결과 : " + !result2);	//false
	
		//17. 비트 연산자
		int num1 = 8, num2 = -8;
		
		System.out.println("~ 연산자에 의한 결과 : " + ~num1); 			// -9 : 피연산자의 1의 보수를 반환하므로 피연산자의 부호만 반대로 변경. ~: 0을 1로 1을 0으로 변경
		System.out.println("<< 연산자에 의한 결과 : " + (num1 << 2));	// 32 : 지정한 수만큼 왼쪽으로 이동시킨 후 뒤에 빈자리에 0을 채워줌. 한비트가 왼쪽으로 이동할 때 마다 값이 2배씩 증가
		System.out.println(">> 연산자에 의한 결과 : " + (num2 >> 3));	// -2 : 지정한 수만큼 오른쪽으로 이동시킨 후 양수일 경우 0, 음수일 경우 1 로 채우기 때문에 부호는 변하지 않음. 한 비트씩 오른쪽으로 이동시 2배씩 감소
		System.out.println(">>> 연산자에 의한 결과 : " + (num1 >>> 2));	//1 : 부호비트 포함하여 모든 비트를 오른쪽으로 이동 후 왼쪽에 빈 자리는 0으로 채움. 양수인 경우 부호비트 이동하지 않는 오른쪽 시프트 연산자(>>) 와 같은 결과 반환
		System.out.println(">>> 연산자에 의한 결과 : " + (num2 >>> 2));	//1073741822 : 음수인 경우에 부호비트까지 이동하므로 전혀다른 결과 반환. 10진수 연산보다 2진수 연산에서 주로 사용됨
		//msb : 부호비트
		//1의 보수 : 2의 거듭 제곱수 -1 에서 뺴서 얻은 이진수
		//  01001011 의 모든 자리의 수를 반전시킨다.
	    //  10110100 (이것을 1의 보수라고 부른다)
		//2의 보수 :2의 제곱수에서 빼서 얻은 이진수
		// 주어진 이진수보다 한 자리 높고 가장 높은 자리가 1이며 나머지가 0인 수에서 주어진 수를 빼서 얻은 수가 2의 보수
		// 혹은 주어진 이진수의 모든 자리의 숫자를 반전(0을 1로, 1을 0으로)시킨 뒤 여기에 1을 더하면 2의 보수를 얻을 수 있다.
		*/
		//18. 기타 연산자
		// - 삼항 연산자
		
		int num1 = 5, num2 = 7;

		int result;

		result = (num1 - num2 > 0) ? num1 : num2;

		System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
		
		
	}

}
