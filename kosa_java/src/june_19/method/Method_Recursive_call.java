package june_19.method;

public class Method_Recursive_call {
	public static void main(String[] args) {
		//33. 재귀호출
		// 메소드 내부에서 해당 메소드가 또다시 호출되는 것을 의미
		// 반드시 탈출조건(중단조건)을 써줘야함 -> 그렇지 않으면 무한루프
		// ex. 팩토리얼, 피보나치 수열
		
		System.out.println(Method_Recursive_call.recursiveSum(10)); //재귀함수 출력
		System.out.println(Method_Recursive_call.fac(4));
	}
	
	static int sum(int n) { //for 문
			int result = 0;
			
			for(int i = 1; i <= n; i++) {
				result += i;
			}
			return result;
		}
	
	static int recursiveSum(int n) { //재귀함수로 변경
		if (n == 1) { //n 이 1 이면 그냥 1을 반환함.
			return 1;
		}
		return n + recursiveSum(n - 1); // n 이 1 이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함. 
	}
	
	static int fac(int n) { //팩토리얼 구하기
		if (n == 1) { //n 이 1 이면 그냥 1을 반환함.
			return 1;
		}
		return n * fac(n - 1);
		
		//return (n == 1) ? 1 : n*fac(n-1); -> 3항 연산자로 변경
	}

	//스택 오버플로우 : 기존 할당된 스택 범위를 넘을 때 발생. 따라서 재귀함수보다 for문 또는 while 문으로 대체해서 사용
	//메모리 구조 중 스택(stack) 영역에서 해당 프로그램이 사용할 수 있는 메모리 공간 이상을 사용하려고 할 때 발생합니다.
}
