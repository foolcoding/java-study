package accessModifier;

class Test1{
	private String name;
	private int age;
	
	public Test1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.printf("%s님은 %d살입니다\n", name, age);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 자바 클래스 구성요소
		
		// 1) 멤버 필드 : 변수
		// 2) 멤버 메서드 : 함수
		// 3) 생성자 : 객체를 생성하는 특수한 함수
		// 4) 접근 제한자 : 클래스 내부 멤버 요소를 대상으로 하는 접근을 제한하는 키워드(예악어)
		
		// private : 클래스 내부에서의 접근만 허용
		// package : 접근 제한자를 작성하지 않았을때의 기본값, 같은 패키지 내부의 클래스까지 허용
		// protected : 같은 패키지 + 다른 패키지이더라도 상속관계에 있으면 허용
		// pubilc : 모든 클래스로부터의 접근을 허용
		
		Test1 ob = new Test1("신유진", 26);
		ob.show();
		
		// The field Test1.age is not visible
		// age 멤버필드를 높은 장벽으로 가려두었기 때문에
		// age가 있다/없다를 판별할 수 없다
//		ob.age = 16;
		ob.show();
		
	}
}
