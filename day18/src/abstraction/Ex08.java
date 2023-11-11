package abstraction;

abstract class Loop{		// 추상 클래스느 단일 상속만 가능하다
	abstract void loop();	// 추상 메서드 (상속받는 서브클래스가 구현해야함)
	void info() {			// 일반 메서드 (오버라이딩이 강제되지 않음, 구현안해도 됨)
		System.out.println("반복을 수행하는 클래스입니다");
	}
}

//정수를 반복해서 출력하는 클래스 NumberLoop + 다중 실행이 가능한 특성이 부여됨
class NumberLoop extends Loop implements Runnable {
	@Override
	void loop() {
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	@Override
	public void run() {
		loop();
	}
}

class AlphabetLoop extends Thread {	// 다중 실행이 가능한 클래스 알파벳 AlphabetLoop
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}

public class Ex08 {
	public static void main(String[] args) {
		NumberLoop ob1 = new NumberLoop();
		AlphabetLoop ob2 = new AlphabetLoop();	// Thread : run() 대신 start()로 호출하면 다중실행 가능
		
		Thread th = new Thread(ob1);	// Runnable객체를 Thread생성체에 넣으면
										// Thread 클래스의 객체와 동일하게 사용할 수 있다
//		ob1.loop();
//		ob2.run();
	
//		ob2.start();	// 다중실행 요소를 먼저 호출해두면 함수가 종료되지 않아도 다음 함수를 호출한다
//		ob1.loop();		// ob1에서도 다중실행이 가능한 특성을 추가로 구현하고 싶다
						// Thread 클래스를 상속받으면 된다
						// NumberLoop는 이미 Loop라는 슈퍼클래스가 있다
						// 자바에서는 클래스의 다중상속을 허용하지 않는다
		
		th.start();						
		ob2.start();
		
		// 1) 서로 다른 클래스(부모클래스가 다르더라도)를 하나의 자료형으로 묶을 수 있다
		// 2) 클래스작성 시 추가적인 특성을 자유룝게 부여할 수 있다
		
		// 자주 사용하는 인터페이스 중에는 이름이 able로 끝나는 경우가 많다
		// Runnable : 다중실행 가능
		// Serializable : 데이터를 직렬화할 수 있는 (직렬화 하면 파일 저장 및 네트워크 전송이 가능해진다)
		// Comparable : 배열 및 리스트 정렬시 기준을 제시핮 ㅣ않아도 기본값으로 정렬을 수행할 수 있다

		// List, Set, Map < 인터페이스
		// 이 함수는 특성 부여보다, 서로 다른 여러 유형의 클래스를 같은 형식으로 묶기 위한 성격이 크다
		// List를 구현하는 클래스 : ArrayList, LinkedList, Stack, Queue, Vector...
	}
}
