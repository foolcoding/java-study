package control;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 제어문
		// conrtol statement
		// 코드의 흐름 및 상태를 제어하는 구문
		// 1) 분기문 : 조건에 따라 서로 다른 코드를 실행한다 (if, switch~case)
		// 2) 반복문 : 조건에 딸 ㅏ특정 코드를 반복수행한다 (wrile, for)
		// 3) 기타 : 반복흐름을 강제로 끊거나, 함수진행을 강제로 종료한다(break, continue, return)
		
		// 분기문과 반복문은 특정 조건에 의해서 수행되므로
		// 비교연산, 논리연산 등을 활용하여 boolean 타입의 값을 다루는 연습이 필요하다
		
		// >, <, >=, <=, ==, !=		일반적으로 수치에 대한 비교를 수행하여 boolean를 만들어낸다
		// &&, ||, !				boolean 을 이용하여 새로운 boolean을 만들어낸다
		
		// 사용자의 입력값이 무엇이냐에 따라, 어떤 크기의 값이냐에 따라
		// 조건을 생성하고, 조건에 따라 서로 다른 크드를 수행하게 한다
		// 분기문 뿐만 아니라, 반복문도 boolean 타입의 값을 사용하기 때문에
		// 한글로 번역했을 때 "만약에" 라는 형식의 구문이 등장하는 경우가 있다
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		boolean isOdd = num % 2 != 0;
		
		if(isOdd) {
			num++;
		}
		
		while(true) {		// 무한반복 (조건이 참이 때문에, 계속 반복한다)
			num /=2;		// num값을 2로 나누고, 나눈 값을 다시 num에 대입한다.
			if(num < 10) {	// 만약 num의 값이 10보다 작으면 (한자리 정수이면)
				break;		// while의 조건에 상관없이 반복문을 중단하고 코드 시점을 while 아래로 보낸다
			}
		}
		
		System.out.println("num : " + num);
		sc.close();
		
		
	}
}
