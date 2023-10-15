package operrater;

public class Ex09 {
	public static void main(String[] args) {
		// 삼항 연산
		// 3개의 항을 이용하여 값을 결정한다
		// 1항은 조건을 나타낸다
		// 2항은 조건이 참일 경우 결정될 값이다
		// 3항은 조건이 거짓일 경우 결정될 값이다
		// 삼항연산자는 조건에 따라서 서로 다른 값을 결정하는 연산자이다
		
		int score = 80;
		boolean flag = score >= 60;
		String result = flag ? "합격" : "불합격";
		
		System.out.println(result);
		System.out.println(flag ? "합격" : "불합격");
		
		// if와 유사한 점이 있다
		if(flag) {
			System.out.println("합격");
		}
		if(flag == false) {
			System.out.println("불합격");
		}
		
		// if문은 조건에 따라서 서로 다른 코드를 실행하는 구문이다 (범위)
		// 삼항연산은 조건에 따라서 서로 다른 값을 결정하는 구문이다 (값)

//		아래 코드는 값을 결정할 수 없는 코드이기 때문에 실행할 수 없다 (잘못된 예시)
//		flag ? System.out.println("합격") : System.out.println("불합격");;
		
	}
}
