package function;

public class Ex06 {
	
	// 함수만들기
	// 1. 함수의 호출부분이 있으면 복사해서 정의할 부부능로 가져온다
	// 함수 호출부분이 대입식이라면 좌변과 우변의 자료형이 같아야함을 이용하여 반환형을 결정한다
	static int summary(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 2. 함수 정의에서 기본 문항은 [반환자료형] [함수이름]([매개변수]) 이다
	// 3. () 안에 있는 값은 인자이다. 인자를 받기 위한 매개변수를 선언한
	// 4. 함수정의에서는 함수의 구체적인 실행내용을 작성해야 하므로 ; 대신 {}를 넣어준다
	// 5. 자바의 함수는 반환자료형의 값을 반드시 반환해야만 한다
	//	따라서, 첫줄에는 반환형 타입의 변수를 선언 및 초기화 하고 마지막줄에서 return하도록 한다
	// 6. 첫줄과 마지막줄이 만들어졌다면 그 사이에서 매개변수값을 활용한 코드를 작성한다
	
	// 2) 놀이기구의 이용시간을 전달하여 이용요금을 반환하는 함수
	static int getFee(int time){
		int fee = 3000;	// 첫줄은 반환형의 변수 선언 및 초기화
		if(time > 30) {								// 중간에 제어문 및 연산자, 변수
			fee += ((time - 21) / 10) * 500;		// 매개변수를 포함한
		}											// 처리코드를 작성하면 된다
		return fee;		// 마지막줄은 반환형 변수의 return
	}
	
	
	
	public static void main(String[] args) {
		
		// 1) 두 정수를 전달하여 두 정수 사이의 합계를 반환하는 함수
		int q1 = summary(1, 100);
		System.out.println("q1 : " + q1);
		
		int t1 = summary(11, 20);
		System.out.println("t1 : " + t1);
		
		// 2) 놀이기구의 이용시간을 전달하여 이용요금을 반환하는 함수
		int q2 = getFee(30);	// 3500
		int t2 = getFee(31);	// 3500
		int t3 = getFee(39);	// 3500
		int t4 = getFee(40);	// 3500
		int t5 = getFee(41);	// 4000
		System.out.println(q2);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
	}
}
