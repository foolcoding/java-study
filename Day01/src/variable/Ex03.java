package variable;

public class Ex03 {
	public static void main(String[] args) {
		// 변수 선언, 자료형과 변수 이름을 명시
		// 데이터를 저장할 공간을 준비하는 과정
		
		int n1;
		int n2 = 20;	// 변수를 선언하면서 값을 지정하는 작업을 변수의 초기화라고 함
		
//		System.out.println(n1);	// 값이 지정되지 않은 변수는 출력하거나 참조할 수 없다
		
		n1 = 10;		// 만들어진 변수는 자료형 없이 변수 이름으로만 접근한다
		
//		int n1 = 30;	// 이미 선언한 변수의 이름으로 다시 선언 할 수 없다
						// 변수의 이름은 중복될 수 없다
		
		System.out.println(n1);		// 변수를 출력하라는 말을 변수에 담긴 값을 출력하라는 뜻
		System.out.println(n2);
		
		System.out.println(n1 + n2);	// 각 변수의 값을 계산하여 새로운 값을 생성하고 그 값을 출력
		
		
	}
}
