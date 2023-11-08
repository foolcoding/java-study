package day10;

class Test2{
	int x;
	int y;
	
	
	void showAdd() {	// 3) ob객체의 메서드가 호출되면 아래 내용을 실행한다
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		// 4) 출력함수 printf을 호출하여 실행한다
	}
}

// this.[멤버]		멤버 필드 및 멤버 메서드에 접근한다
// this()			클래스 생성자 내부에서 또다른 생성자를 호출할 때 사용한다, 첫줄에서만 사용한다
// this				객체 자기 자신을 표현하거나, 참조변수형식으로 전달하기 위해 사용한다

public class Ex02 {
	public static void main(String[] args) {
		
		Test2 ob = new Test2();	// 1) Test2 클래스의 내용을 읽어서 객체를 생성하고, ob변수가 가리키게 한다
		
		ob.x = 10;	// 2) ob객체의 x필드에 10을 대입
		ob.y = 20;	// 3) ob객체의 ㅛ필드에 20을 대입
		
		ob.showAdd();	// 4) ob객체의 showAdd 메서드를 호출한다
		
		System.out.println("프로그램 종료");	// 7) println 메서드를 호출하여 출력
		// 8) 메인함수 종료
		
		// 특정 함수 내부로 진입하기 위해서 컨트롤 + 클릭
		// 이동한 곳에서 다시 이전 위치로 이동하기 위해서 알트 + ←
	}
}
