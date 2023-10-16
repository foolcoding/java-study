package input;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 입력과 연산자를 사용한 예시
		
		int num;				// 정수를 입력받을 변수
		boolean isEven;			// 입력받은 정수가 짝수인지 판별할 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		num = sc.nextInt();			// 사용자에게 입력받아서 값 채우기
		isEven = num % 2 == 0;		// 연산자를 이용하여 값 채우기
		
		// 준비한 모든 변수의 값이 채워지면 원하는 서식에 맞춰서 값을 출력하기
		System.out.printf("%d는 %s입니다\n", num , isEven ? "짝수" : "홀수");
		
		sc.close();  // 마무리
		
		
	}
}
