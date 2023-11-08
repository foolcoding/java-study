package inheritance;

class Parent1{	// 두 정수를 저장할 수 있고, 그 값을 출력하는 메서드를 포함하는 클래스
	int x;
	int y;
	
	void show() {
		System.out.printf("x : %d, y : %d\n", x, y);
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}	
}

// Parent1 클래스의 속성과 기능을 그대로 물려받는 서브클래스 Child1
// Parent1의 내용을 그대로 물려받은 상태에서, 추가적인 요소를 넣어서 개념을 확장하여 사용한다
// 이미 만들어진 클래스의 재사용을 하기 위한 요소이다
class Child1 extends Parent1{	// extend (확장) : 기존 클래스의 개념에서 확장하여 더 많은 내용을 담는다
	
// 	int x;
// 	int y;
	int z;
//	void setX(int x) { this.x = x; }
//	void setY(int y) { this.y = y; }
	void setZ(int z) { this.z = z; }	// 기존에 없던 기능 추가
	
	void show() {	// 기존 기능을 수정 ( 기존에 만들어진 함수의 형식이 일치해야함)
		System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Parent1 ob1 = new Parent1();
		ob1.setX(12);
		ob1.setY(7);
		ob1.show();
		
		Child1 ob2 = new Child1();
		ob2.setX(35);
		ob2.setY(72);
		ob2.setZ(17);
		ob2.show();
	}
}
