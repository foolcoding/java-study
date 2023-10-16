package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 1바이트 입력기를 기반으로 다양한 입력을 처리하고 예외처리도 내장된 다기능 입력기
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		String str;							// 변수 선언
		System.out.print("문자열 입력 : ");	// 입력 안내문
		str = sc.nextLine();				// 입력받고 그 내용을 문자열로 변수에 저장
		System.out.println("str : " + str);	// 결과 확인
		
		// 정수 입력받기
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();					// 버퍼에 있는 내용 중 정수 부분만 가져온다
		System.out.println("num : " + num);	// 48에서 57범위의 연속된 데이터만 가져온다
		
		//실수 입력받기
		double db;
		System.out.print("실수 입력 : ");
		db = sc.nextDouble();
		System.out.println("db : " + db);
		
		// sc.nextChar()는 없다
		char ch;
		System.out.println("글자하나 입력 : ");
		ch = sc.next().charAt(0);	// 문자열을 입력받고, 그 문자열에서 0번째 글자하나 가져온다
		System.out.println("ch : " + ch);
		
		sc.nextLine();	// 버퍼에서 엔터값을 지우기 위해 가져오지만 지우지는 못한다
		
		System.out.print("추가 문자열 입력 : ");
		str = sc.nextLine();
		System.out.println("str : " + str);
		
		//사용이 끝난 데이터 이동통로(스트림)은 닫아주어야 한다
		sc.close();
		
		
		
	}
}
