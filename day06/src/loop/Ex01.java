package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문
		// 특정 조건에 따라, 코드를 반복하여, 수행하는 구문
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		int num = 5;		// 반복할 횟수를 체크할 변수
		while(num < 10) {	// 반복을 수행할 조건
			num++;			// 횟수를 1증가시킨 후
			System.out.println("while : " + num);	// 원하는 작업을 수행
			// ↑ 실질적인 종속문장
		}
		System.out.println();
		
		for(int i = 0; i < 25; i++) {		// 반복의 횟수 선언, 조건, 증감
			System.out.println("for : " + i);	//중복문장
		}
		System.out.println();
		
		// 새로운 반복을 돌리기 위해 횟수를 0으로 대입
		num = 0;
		
		if(num < 20) {	// 조건이 참일때 종속문장을 1회 실행한다
			System.out.println("if : "+ ++num);
		}
		
		while(num < 20) {	// 조건이 참인동안 종속문장을 반복하여 실행한다
			System.out.println("while : " + ++num);
		}	// 종속문장을 실행하고 나면, 다시 조건을 체크한다
		
		
		
	}
}
