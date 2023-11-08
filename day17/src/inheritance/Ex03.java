package inheritance;

class Parent3 {
	int n1;
	public Parent3() {
		// 3) 슈퍼클래스의 생성자는 두가지 작업을 수행한다
		// 첫째, 필드의 메서드를 생성할 객체에 연결한다
		// 둘째, 필드에 대한 초기값을 지정하고, 기타 초기작업을 수행한다
		// 작업이 끝나면 다시 서브클래스의 생성자로 돌아간다
		n1 = 10;
		System.out.println("2) 슈퍼클래스 생성자 호출 !!");
	}
}

class Child3 extends Parent3{
	int n2;
	public Child3() {
		// 2) 서브클래스의 생성자는 내부에서 슈퍼클래스의 생성자를 호출한다
		super();
		n2 = 20;
		System.out.println("3) 서브클래스 생성자 호출 !!");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 서브클래스(자식클래스)가 객체를 생성하는 과정, 순서
		System.out.println("1) 메인함수 시작 !!");
		Child3 ob = new Child3();	// 1) 서브클래스의 생성자가 호출된다
		System.out.println("ob.n1 : " + ob.n1);
		System.out.println("ob.n2 : " + ob.n2);
	}
}
