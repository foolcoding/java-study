package variable;

public class Quiz02 {
	public static void main(String[] args) {
		// 자신의 이름을 문자열 변수에 저장하세요
		String name = "최현웅";
		// 자신의 나이를 정수형 변수에 저장하세요
		int age1 = 25;
		Integer age2 = 25;
		// 새로운 실수형 변수에 0을 대입하세요
		double num1 = 0;
//		Double num2 = 0;
//		Double num2 = (double)0;
		Double num2 = Double.valueOf(0);
		System.out.println("원시형 실수 : " + (int)num1);
		System.out.println("랩클래스 실수 : " + num2);
		// 방금 만든 실수형 변수에 3.14를 대입하세요
		num1 = 3.14;
		num2 = 3.14;
		// 지금까지 만든 3개의 변수에 담긴 값을 각각 한줄씩 화면에 출력하세요
		System.out.println("랩클래스 이름 : " + name);
		System.out.println("원시형 나이 : " + age1);
		System.out.println("원시형 실수대입 : " + num1);
		System.out.println("랩클래스 나이 : " + age2);
		System.out.println("랩클래스 실수대입 : " + num2);
		// (primitive를 이용해서 한번, WrapperClass를 이용해서 한번 코드를 실행하세요)
		
	}
}
