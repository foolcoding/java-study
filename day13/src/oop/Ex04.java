package oop;

import java.util.Stack; // 자주 사용하기 때문에 자바에서 미리 만들어둔 클래스

public class Ex04 {
	public static void main(String[] args) {
		// 만들어진 클래스 내용을 가져와서, 내가 새로운 객체를 생성하고 코드에서 활용한다
		Stack<Integer> stack = new Stack<>();
		 
		stack.push(10);	// 기능이 만들어져 있기 때문에, 호출하여 실행하면 된다
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		// 단, 함수마다 사용법이 다르기 때문에 기본적인 구조는 알아보고 사용해야 한다
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
	}
}
