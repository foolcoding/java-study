package abstraction;

interface Test6 {
	// 인터페이스는 추상클래스의 일종이다
	// 인터페이스는 일반적인 추상클래스와 달리 일반 메서드를 호출할 수 없다
	// 인터페이스는 extends 대신 implements 키워드로 상속(구현)한다
	// 인터페이스의 모든 필드는 public static final 속성을 가진다
	// 인터페이스의 모든 메서드는 public abstract 속성을 가진다
	// 인터페이스는 다중 상속을 허용한다
	
	String name = "테스트 틴터페이스";
			
	// Abstract methods do not specify a body
	// 추상메서드는 body를 지정할 수 없습니다
	void f1();
	
	// 잘못된 식별자가 f2에 지정되었습니다
	// 오로지 public, private, abstract, default, static 그리고 strictfp만 허용됩니다
	private void f2() {
		// 내부에서만 호출가능한 함수
	}
	
	public abstract void f3(); // 메서드만 작성했을때의 기본형
}

public class Ex06 {
	public static void main(String[] args) {
		// 인터파크 : 
		// 인터넷 : 통신망을 하나로 연결한 인터-네트워크라는 말에서 시작되었다
		// 인터페이스 : 서로 다른 유형의 객체를 같은 규칙(표면, face)으로 맞추기 위한 형태, 도구
	}
}
