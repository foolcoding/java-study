/*
package oop;

import java.util.Arrays;

class Stack2 {	// 내가 만들 프로그램에 어떤 형태의 데이터가 등장하는가?
				// 어떤 속성(property, attribute, 명사 및 수치형 데이터)를 포함하는
				// 어떤기능(function. method, 동사적 기능)을 포함하는가
	
	// Ex02.java파일의 Stack 클래스의 내용을 가져온다
	
	// 스택의 데이터 구조를 정의하는 부분, 명사형 데이터, 변수
	int[] arr = new int[5];
	int top;
	
	// 스텍에 포함 시키고 싶은 기능(함수, 메서드)를 가져온다
	// Ex2.java의 main 함수 위에 있는 함수를 가져와서 일부 수정한다
	void push(int data) {

		for(int i=0; i < arr.length; i++) {
			if(arr[i] == 0) {			// 빈칸을 찾았다면
				arr[i] = data;			// 데이터를 넣고
				top = i;				// 마지막으로 넣은 데이터의 위치(index)를 top에 대입한다
				return;
			}
		}
	}
	
	int pop() {
		int num = -1;	// 꺼내줄 데이터가 없을 경우에 반환하는 기본값
		for(int i = arr.length - 1; i != -1; i--) {	// 배열을 거꾸로 순회하면서
			if(arr[i] != 0) {			// 0이 아닌 데이터가 있다면
				num = arr[i];			// 그 데이터를 num에 복사해주고
				arr[i] = 0;				// 원래 데이터가 있던 자리에는 0을 넣어서 빈칸으로 만들고
				if(top != 0) {			// top를 한칸 내려야 하는데 0이면 마지막값이니까 처리하지 않음
					top = i - 1;		// top를 한칸 내려서 마지막 데이터가 어디 있는지 알려준다
				}
				break;
			}
		}
		return num;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 메인 함수, public class의 코드 길이는 줄어든다
		// 대략적인 수행 내용만 작성하기 때문
		
		Stack2 stack = new Stack2();
		// 자료형(class)을 이용하여 실제 데이터(objech)를 생성한다
		
		// 데이터, 객체(object)에 내장된 기능을 실행하면서 프로그램을 진행한다
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		
		// 출력도 Stack2클래스에 함수로 만들 수 있다
		System.out.println(Arrays.toString(Stack.arr));
		
		System.out.println("pop : " + pop);
		System.out.println("pop : " + pop);
		System.out.println("pop : " + pop);
		
	}
}
*/
