package acceccModifier;

// static 하나의 클래스에 의해 만들어진 객체들은 모두 같은 값을 공유하게 하는 속성

class Test4{
	int n1 = 10;				// 일반 멤버 필드, 객체마다 다른값을 가지고 변경할 수 있다
	static int n2 = 20;			// 정적 멤버 필드, 모든 객체가 값을 공유하고 변경할 수 있다
	final int n3 = 30;			// 불면 멤버 필드, 객체마다 다른값을 가지고 변경할 수 없다
	static final int N4 = 40;	// 정적 불변 멤버 필드, 모든 객체가 값을 공유하고 변경할 수 없다
	
	// 클래스를 제외한 모든 요소는 첫글자를 소문자로 작성하지만
	// static final 필드는 예외적으로 모든글자를 대문자로 작성한다
	// 단어와 단어의 합성인 경우는 각 단어를 구분하기 위한 방법으로 _를 사용한다
	
	public static int getN2() {	// static 메서드는 static 필드를 참조해야 한다
								// non-static 필드는 참조할 수 없다
		return n1;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// final만 지정한 필드는 생성자의 활용에 따라 서로 다른 객체가 다른 값을 가질 수도 있다
		// static final은 변경할 수 없으며, 모든 객체가 동일한 값을 가지게 된다
		
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		System.out.println("ob1.n2 : " + ob1.n2);
		System.out.println("ob2.n2 : " + ob2.n2);
		System.out.println();
//		The static field Test4.n2 should be accessed in a static way
//		정적 필드 n2는 정적인 방식으로 접근해야 합니다
//		static 요소는 객체마다 서로 다른값이 아니라, 클래스 하나에 고정된 값이므로
//		[객체.요소] 형식보다는 [클래스.요소] 형식으로 접근하는 것이 올바르다
		
		ob1.n2 += 5;
		
		System.out.println("ob1.n2 : " + ob1.n2);
		System.out.println("ob2.n2 : " + ob2.n2);
		System.out.println();
		
		System.out.println("Test4.n2 : " + Test4.n2);
		
		System.out.println(Integer.MAX_VALUE);
		
		// 클래스의 구성요소 : 필드, 메서드, 생성자, 접근제한자
		// 추가 학습 요소 : getter/setter, static, final
		
		// static 필드를 참조하는 메서드는 static형식으로 작성하는 것이 좋다
	}
}
