package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Exception : 저바 프로그램 실행 시 발생하는 예외를 규정하는 클래스
		// java.lang.Exception
		
		// 예외란 코드 수정에 따라 회피 혹은 처리할 수 있는 문제 상황을 말한다
		
		// 데이터베이스에 접속하여 데이터를 불러오고, 화면에 출력하는 프로그램에서
		// 만약 데이터베이스에 접속이 실행되지 않으면 이후 코드를 실행할 수 없다
		// 프로그램에서 접속이 되지 않을때에 대한 내용을 작성해두지 않으면
		// 프로그램은 예외 혹은 에러를 일으키고 정상적으로 종료할 수 없게 된다
		// 이런 상황을 규정해서 특정 예외가 발생할 경우, 별도의 대처방법을 작성해 둘 수 있다
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		
		
//		num = sc.nextInt();
		String tmp = sc.nextLine();
		if(isDigit(tmp)) {
			num = Integer.parseInt(tmp);
			System.out.println("num : " + num);
		}
		else {
//			num = -1;
			System.out.println("정수가 아닙니다");
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	
	static boolean isDigit(String str) {	// 문자열의 모든 글자가 0에서 9사이의 글자로 구성되었는가
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || '9' < ch) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
