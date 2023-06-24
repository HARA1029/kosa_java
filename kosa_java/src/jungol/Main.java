package jungol;

import java.util.*;
//정올 구조체 연습문제1
public class Person { 
	private String name;
	private int age;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, num;
		char ch;
		char[] charArray = new char[100];
		int[] outArray = new int[100];
		
		do {
			ch = sc.nextLine().charAt(0);
			num = (int) ch;
			charArray[cnt] = ch;
			outArray[cnt++] = num;
		} while(ch != 0);
	}
	public void printInfo() {
		System.out.println("당신의 이름은 " + this.name + "이고 나이는 " + this.age + "세이군요.");
	}
}

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.getInput();
		p.printInfo();

	}

}
