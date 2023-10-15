package operrater;

public class Ex05 {
	public static void main(String[] args) {
		// 비교 연산
		// >, <, >=, <=, ==, !=
		// 초과, 미만, 이상, 이하, 일치, 불일치
		
		// 정수 혹은 실수값의 크기를 비교하여 그 결과를 boolean타입의 값으로 나타낸다
		// "Robert" > "Chris" (X)
		
		int n1 = 10;
		int n2 = 3;
		System.out.println("10 > 3 ; " + (10 > 3));
		System.out.println("10 < 3 ; " + (10 < 3));
		System.out.println("10 >= 3 ; " + (10 >= 3));
		System.out.println("10 <= 3 ; " + (10 <= 3));
		System.out.println("10 == 3 ; " + (10 == 3));
		System.out.println("10 != 3 ; " + (10 != 3));
		System.out.println();
		
		String s1 = "Hello";				// 라터럴 영역
		String s2 = new String("Hello");	// object 영역
		String s3 = "Hello";				// 라터럴 영역
		
		// (파이썬과 달리, 문자열은 크기비교를 지원하지 않는다)
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println();
		
		int age = 15;
		boolean isAdult = age >= 20;
		// 비교 연산의 결과값을 boolean타입의 함수에 저장해 두었다가
		
		if(isAdult) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("미성년자입니다");
		}
		
		
		
		
	}
}
