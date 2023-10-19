package quiz;

import java.util.Scanner;

// 이클립스 디버깅
// 중간점 설정 (Ctrl + shift + b) or 줄번호 왼쪽 클릭
// f11누르면 시작 (화면 구성을 바꿀건지 물어보면 yes)
// f6 누를때마다 한줄씩 실행 우측에서 변수의 값 확인 가능

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		
		System.out.println("주민등록번호 13자리 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
		
		// 출생연도 출생월 출생일 성별
		int year, month, day, gender;
		String gender1;
		year = num1 / 10000;
		day = num1 % 100;
		// num /= 100;
		// month = num1 % 100;
		month = (num1 - (year * 10000)) / 100;
		gender = num2 / 1000000;
		
		switch(gender) {
		case 1: case 2:
			year += 1900;
			break;
			
		case 3: case 4:
			year += 2000;
			break;
		default: System.out.println("1900년대 또는 2000년생이 아닙니다");
		}
		
		switch(gender) {
		case 1: case 3: 
			gender1 = "남";
			break;
			
		case 2: case 4:
			gender1 = "여";
			break;
		default: gender1 = "?";
			System.out.println("1900년대 또는 2000년생이 아닙니다");
		}
			//System.out.println("출생연도 : " + year);
			//System.out.println("출생월 : " + month);
			//System.out.println("출생일 : " + day);
			//System.out.println("성별 : " + gender1);
			
			System.out.printf("%4d-%02d-%02d (%s)\n", year, month, day, gender1);
			
			sc.close();
	}
}
