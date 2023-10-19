package control;

public class Ex03 {
	public static void main(String[] args) {
		// switch 에는 정확한 값의 일치 비교가 가능한 형태로 변수가 되야한다
		// 따라서 근사치를 처리하는 부동소수점 방식의 실수(float, double)는 처리할 수 없다
		
		int num = 2;
		double db = 2.1;
		String str = "B";
		
		// 정수랑 문자열은 되는데 실수는 안됨
		// 문자열의 비교는 가능하다
		
		switch(num) {
		case 1:		// if(str == "A")		(X)
					// if(str.equals(("A"))	(O)
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		}
		
		// switch에 변수 혹은 변수를 포함하는 연산식도 가능하다
		int num2 = 125;
		
		switch(num2 % 2) {
		case 0:		System.out.println("짝수");	break;
		case 1:		System.out.println("홀수");
		}
		
		
		
	}
}
