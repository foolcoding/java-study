package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 2의 배수 혹은 3의 배수 혹은 6의 배수를 각각 구분하여 출력하세요
		// 정수를 하나 입력받고, 위 3개 중 해당하는 하나만 출력하면 됩니다
		// 6의 배수를 입력받으면 2와 3의 배수에 모두 해당하지만 6의 배수만 출력해야 합니다
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("정수를 하나 입력하세요 : ");
		a = sc.nextInt();
		
		if (a % 6 == 0) {
			System.out.println(a + "은(는) 6의 배수입니다.");
		}
		else if (a % 3 == 0) {
			System.out.println(a + "은(는) 3의 배수입니다.");
		}
		else if (a % 2 == 0) {
			System.out.println(a + "은(는) 2의 배수입니다.");
		}
//		else {
//			System.out.println("2, 3, 6의배수 중 어느것도 해당하지 않습니다");
//		}
		
		sc.close();
		
		
		
	
}
}
