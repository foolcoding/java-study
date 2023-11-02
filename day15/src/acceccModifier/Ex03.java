package acceccModifier;

class Test3 {
	
	// final : 필드에 적용되면, 초기화 이후 값을 변경할 수 없다
	// 멤버 필드 및 지역변수에도 적용 가능하다
	
	int n1 = 10;
	final int n2 = 20;
	
	// final 필드에 항상 같은 값을 넣는것은 아니다
	// 생성자를 이용한 초기화도 허용한다
	
	private final int n3;
	
	public Test3() {		// 생성 시 인자를 전달받지 않으면 0으로 초기화한다
		n3 = 0;
	}
	
	public Test3(int n3) {
		this.n3 = n3;		// 인자를 전달받으면, 전달받은 값으로 n3를 초기화한다
	}

	public int getN3() {
		return n3;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		ob1.n1 = 30;
//		ob1.n2 = 40;		// The final field Test3.n2 cannot be assigned
		
		Test3 ob2 = new Test3(35);
		System.out.println("ob2.n1 : " + ob2.n1);
		System.out.println("ob2.n2 : " + ob2.n2);
		System.out.println("ob2.n3 : " + ob2.getN3());
		System.out.println();
		
		Test3 ob3 = new Test3(75);
		System.out.println("ob3.n1 : " + ob3.n1);
		System.out.println("ob3.n2 : " + ob3.n2);
		System.out.println("ob3.n3 : " + ob3.getN3());
		System.out.println();
	}
}
