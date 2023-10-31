package oop;

class Circle{
	double radius;
	double area;
	double pi = 3.14;	// 필드에 초기화를 지정해두면, 생성자로 덮어쓰지 않는다
						// 모든 객체가 동일한 값을 지니게 된다

	// 반지름 radius를 전달받아서 저장하고	
	// 원의 넓이를 구하는 코드를 포함하는 생성자를 작성하세요 area = radius^2 * pi
	
	// 생성자를 오버로딩하여 정수, 혹은 실수형태로 전달받을 수 있도록 처리하고
	
	// 원의 반지름과 넓이를 각각 출력하고 함수 show() 를 작성하세요
	
	Circle(int radius){
		this.radius = radius;
		area = this.radius * this.radius * pi;
	}
	
	Circle(double radius){		// this. : 같은 이름이 없으면 멤버 필드를 참조
		this.radius = radius;	// 			없으면 매개변수부터 참조
		area = radius * radius * pi;
	}
	
	void show() {
		System.out.println("반지름 : " + radius);
		System.out.printf("넓이 : %.2f\n", area);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(2);
		Circle ob2 = new Circle(3.2);
		ob1.show();		
		ob2.show();		
	}
}
