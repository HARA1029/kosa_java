package june_16;

public class Statements {//제어문
	public static void main(String[] args) {
		/*
		 
		//19. 조건문 
		//1. if 문
		//2. if / else 문
		//3. if / else if / else 문
		//4. switch 문
		
		//20. 반복문
		//1. while 문
		int i = 0;
		while (i < 5) {//c 언어와 달리 true 를 넣어야 무한 루프 생성
		    System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		}
		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
		//2. do / while 문
		int i = 1, j = 1; //초기식

		while (i < 1) {
		    System.out.println("while 문이 " + i + "번째 반복 실행중입니다.");
		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		}
		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		do { //조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문
		    System.out.println("do / while 문이 " + i + "번째 반복 실행중입니다.");
		    j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		    
		    //이 부분에 조건식의 결과를 변경하는 명령문이 나와야 함 
		} while (j < 1); //(조건식)
		System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
		
		//3. for 문 : while 문보다 좀 더 간결하게 반복문 표현 가능
		//for(초기식; 조건식; 증감식)
		//{조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문}
		
		//4. Enhanced for 문 : 배열쪽에서 사용할 것
		*/
		//21. 기타 제어문
		//이름을 가지는 반복문(break with label
		allLoop: 
			for(int i = 2; i <10; i++) {
				for (int j = 2; j < 10; j++) {
					if(i == 5) {
						break allLoop;
					}
					System.out.println(i+"*"+j+" = "+ (i*j));
				}
			}


	}

}
