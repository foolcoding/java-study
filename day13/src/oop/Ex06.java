package oop;

import java.util.Scanner;

class Test {
	
	int num;
	
	void show() {
		System.out.println("num : " + num);
	}
	
	// 생성자를 작성하지 않아도 컴파일 시 기본생성자(매개변수를 받지않는 생정자)가 자동으로 작성된다
	// Test() {}
	
	// 작성자가 임의로 생성자를 정의하면, 자동으로 생성자를 만들어주지 않는다
	Test(int num){
		this.num = num;	// 필드의 초기값을 지정한다
		System.out.println("Test 타입의 객체를 하나 생성했습니다\n");
		// 초기값 지정외에 객체 생성시 초기 작동을 정의한다
	}
	
	// 생성자도 함수이므로, 오버로딩이 가능하다
	Test() {
		System.out.println("기본 생성자 호출 !!\n");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Test ob1 = new Test();	// 생성자를 아예 작성하지 않아도 기본생성자를 호출할수 있다
		ob1.show();		
		ob1.num = 12;
		ob1.show();
		
		Test ob2 = new Test(25);	// 생성자 작성해서 한번에 객체 생성
		ob2.show();
		
/*
 		생성자 클래스를 이용하여 객체를 생성할 때 호출해야 하는 특수한 함수
 		클래스 변수 = new 생성자();
 		
 		1) 생성자의 이름은 클래스의 이름과 같아야 한다
 		
 		2) 클래스 작성 시 생성자를 작성하지 않으면 매개변수를 받지않는 기본생성자가 자동으로 만들어진다
 		
 		3) 클래스 작성 시 어떤형태이든 생성자를 작성하면, 자동으로 생성되지 않는다
 		-> 이를 이용하여 특정타입의 객체를 생성하기 위해서는 반드지 어떤 값을 전달해야 한다는 규칙이 필요하다
 		
 		4) 생성자는 매개변수를 받아서, 멤버필드의 값을 초기화할 수 있다
 		-> 클래스는 하나이지만, 생성자코드에 따라 서로 다른 객체가 서로 다른 값을 가질 수 있도록 한다
 		
 		5) 생성자는 필드 초기화 이외에도, 특정 코드를 수행하도록 만들수 있다
 */
		// Scanner클래스는 객체를 생성하기위해서, InputStream 혹은 String 혹은 File등을 전달해야한다
		// The constructor Scanner() is undefined
		// 매개변수를 전달받지 않는 Scanner() 생성자는 정의되어 있지 않습니다
//		Scanner sc = new Scanner();
		
	}
}
