package value;

import java.util.Date;

public class Ex02 {
	/*
	 	소스 코드 컴파일 이후 실항하기 전에 코드 내용을 분석하여
	 	필요한 리터럴을 메모리 안에 미리 준비해둔다
	 	리터럴의 위치(주소)는 자바 가상머신이 직접 관리하기 때문에,
	 	개발자가 의도적으로 제거하지는 못한다
	 */
	public static void main(String[] args) {
		// 프로그램을 작성한다는 것은 필요한 '값'을 준비해두고
		// 원하는 '연산'을 수행하여 결과를 만들어낸 다음
		// 화면으로 보여주거나, 파일로 저장하거나, 네트워크로 전송화는 과정을 거치게 된다
		 
		// 리터럴, 리터럴 상수
		// 아래 코드에서 n1, n2는 변수이고 10, 20은 리터럴이다
		// 메인 함수가 실행되기 전에, 코드내용을 파악하고 필요한 값을 미리 메모리 다른공간에 준비해둔다
		// 리터럴도 값(데이터)이므로, 고유한 자료형을 가진다
		int n1 = 10;
		int n2 = 20;
		String s1 = "ITBANK";
		
		// 상수형 변수
		int n3 = 30;
		final int n4 = 40;	// final 속성을 가지는 변수는 값을 지정하면 바꿀 수 있다 (메모리 효율)
		
		n3 = 35;
//		n4 = 45;	// final 속성의 변수에는 대입이 불가능하다
//		참조형 변수의 경우 대상이 바뀔 일이 없으니 특정 위치 혹은 피터럴을 가리키게 만든다
		
		// 참조 자료형 : 데이터를 변수안에 직접 저장하지 않고, 대상의 위치정보를 변수에 저장한다
		// 1) Class - 자료형의 첫 글자가 대문자인 변수
		// 2) Array - 배열타입 [] 대괄호가 붙은, 여러 변수를 묶어둔 형식

		int day = 20231013;			// primitive type
		Date date = new Date();		// Reference type (class)
		int[] arr = { 1, 2, 3 };	// Reference type (array)
		
		date = null;	// 아무 대상도 가리키지 않는 상태로 만든다
		// null : 참조하는 대상이 없다. (primitive에는 적용되지 않는다), 사람이 언제 죽는다고 생각하나
		arr = null;
		
		String s2 = "Hello";
		String s3 = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		
		
		
		
		
	}
}
