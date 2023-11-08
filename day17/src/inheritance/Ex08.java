package inheritance;

class Test1 /*extends Object*/ {}

class Test2 extends Object {}

class Test3 {
	
	// 저장 -> 우클릭 -> source -> override/implement method..
	
	// 자바의 모든 클래스가 자동으로 상속받는 Object 클래스에는 몇가지 공통 메서드가 있다
	// 이 중에서 override해서 새롭게 정의할 수 있는 메서가도 있다
	// toString()은 객체를 문자열로 표현할 때 이떤 형식인지 정의하는 메서드이다
	// toString()을 오버라이딩하면, 객체를 그냥 출력했을때 나타나는 문자열을 바꿀 수 있다
	@Override
	public String toString() {
		return "내가 오버라이딩으로 새로 만든 값";
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1();
		Test2 ob2 = new Test2();
			
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println();
		
		System.out.printf("%x\n", ob1.hashCode());
		System.out.println(ob1.toString());
		System.out.println();
		
		System.out.printf("%x\n", ob2.hashCode());
		System.out.println(ob2.toString());
		System.out.println();
		
		Test3 ob3 = new Test3();
		System.out.printf("%x\n", ob3.hashCode());
		System.out.println(ob3);
//		System.out.println(Object o) -> System.out.println(String o.toString())
		System.out.println(ob3.toString());
		
		
	}
}
