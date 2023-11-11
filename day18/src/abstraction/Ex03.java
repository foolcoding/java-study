package abstraction;

abstract class Test3 {	// 추상 크래스, 객체화 할 수 있다
	void function1() {	// 일만 메서드를 포함할 수 있다 (추상메서드도 포함할 수 있다)
		System.out.println("내용");
	}
	
	// This method requires a body instead of a semicolon
	// 이 메서드는 세미콜론 대신, 함수 내용(본체)이 필요합니다
	abstract void function2();
	// The abstract method function2 in type test3 can only be defined by an abstract class
	// 추상 메서드 function2를 포함하는 클래스 Test3는 추상클래스가 되어야 합니다
}

class Sub extends Test3 {

	@Override
	void function2() {
		System.out.println("상속받아서 오버라이딩으로 구현한 내용");
	}
	// 추상 클래스를 상속받는 클래스 Sub
	// 1) Sub를 추상클래스로 만들면 추상메서드를 포함할 수 있다
	// 2) 추상메서드를 오바라이딩해서, body를 만들어주면 더이상 추상메서드가 아니게 된다
	
	// The type sub must implement the inherited abstract method Test3.function2()
	// 자료형 Sub는 상속받은 Test3의 추상메서드 function2를 반드시 구현해야 합니다(추상메서드는 미구현으로 간주)
}

public class Ex03 {
	public static void main(String[] args) {
		// 실제 객체를 코드에 반영할 때는 작성자의 사정/관점에 의해 필요한 부분만 반영하게 한다
		// 문법적으로는 객체 특성의 형태만 저장되어 있고, 구체적인 내용이 지정되지 않은 형태를 추상화라고한다
		// 추상 클래스 : 구체적인 내용이 없어 객체화(instantiate)할 수 없는 클래스, 추상메서드를 포함한다
		// 추상 메서드 : 함수의 형태는 지정되어 있으나, 내용은 없어서 호출할 수 없는 함수
		
//		Test3 ob = new Test3();
		// Cannot instantiate the type Test3
		// Test3 를 객체화 할 수 없습니다
		
		Sub ob1 = new Sub();
		ob1.function1();
		ob1.function2();
	}
}
