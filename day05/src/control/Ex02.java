package control;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 여러 케이스에 대응되는 하나의 수식을 만들기
		
		Scanner sc = new Scanner(System.in);
		int num;
		String gender = "";
		
		System.out.print("주민등록번호 7번째 자리 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 9: case 1: case 3:
			System.out.println("남성입니다");
			gender = "남성";
			break;
			
		case 0:
		case 2:
		case 4:
			System.out.println("여성입니다");
			gender = "여성";
			// break;	// 마지막 break 생략가능
						// 반드시 default룰 적송헐 팔요는 없다
						// default는 if문의 마지막 else에 해당한다
		}
		sc.close();
		
	}
}
