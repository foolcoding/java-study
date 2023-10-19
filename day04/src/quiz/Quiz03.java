package quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("정수를 3개 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		/*
		if(a > b && a > c) {
			System.out.println(a + "가(이) 제일 큽니다");
		}
		else if(b > a && b > c) {
			System.out.println(b + "가(이) 제일 큽니다");
		}
		else if(c > a && c > b) {
			System.out.println(c + "가(이) 제일 큽니다");
		}
		else {
			System.out.println("세 수의 값이 같습니다");
		}
		sc.close();
		*/
		
		// 수가 많아지면 밑에꺼가 편함, 반복문 처리도 가능
		int max;
		max = a;
		max = b;
		max = c;
		
		if (true)		max = a;
		if (max < b)	max = b;
		if (max < c)	max = c;
		 System.out.println(max + "가(이) 제일 큽니다");
		 
		
	}
}
