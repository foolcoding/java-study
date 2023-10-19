package control;

public class Ex02 {
	public static void main(String[] args) {
		// if : 조건이 참이면 종속 문장을 실행한다
		
		int age = 25;
		
		if (age >= 20) {
			
			// 종속 문장 : 한 줄일 수도 있고, 여러 줄일수도 있다
			// 종속문장이 여러줄이면 반드시 {} 를 이용하여 묶어준다
			// 종속문장이 한 줄이면 {}를 생략할 수 있지만, 권장하지 않는다
			System.out.println("성인입니다");
		}
		// 조건절은 아직 문장이 끝난 상태가 아니다.
		// 따라서, 조건절 다음에 ; 을 작성하지 않아야 한다
		
		if(age % 2 != 0) {
			System.out.println("홀수");
		}
		System.out.println("끝");
		
		
	}
}
