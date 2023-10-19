package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		
		// while(menu != 0) {	 메뉴의 값이 0이며 종료이므로 반복을 출력하지 않게 하고 싶다
		
		do {	// 조건 따지지 말고 일단 한번 실행해라
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("입력 >>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: System.out.println("입력을 선택하셨습니다"); break;
			case 2: System.out.println("출력을 선택하셨습니다"); break;
			case 0: break;
			default: System.err.println("메뉴를 잘못 선택했습니다");
			}
		} while(menu != 0); // 반복 수행 후 조건을 판별하여 참이면 다시 실행한다
		
		System.out.println("프로그램을 종료합니다");
		sc.close();
		
	}
}
