package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세여
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("두 정수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a < b) {
			System.out.println(b);
		}
		else if (a > b) {
			System.out.println(a);
		}
		
		
		sc.close();
		
		
		
	}
}
