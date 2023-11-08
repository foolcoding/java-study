package inheritance;

class Human{
	// 이름을 지정할 필드 작성
	String name;
	// 생성자를 이용해 이름을 전달받고 필드에 저장
	Human(String name){
		this.name = name;
	}
	// 본인의 이름을 출력하는 메서드 show() 작성
	void show() {
		System.out.println("이름 : " + name);
	}
}

class Student extends Human{
	// 학생의 성적 점수를 저장할 int형 필드 score를 작성
	int score;
	// 생성자에서 이름과 정수를 전달받고, 이름은 슈퍼클래스의 생성자로 보내고, 정수는 필드에 저장
	Student(String name, int score){
		super(name);
		this.score = score;
	}
	// show()를 오버라이딩하여, 이름과 점수를 함께 출력하도록 수정
	@Override
	void show() {
		System.out.printf("이름 : %s, 점수 : %d", name, score);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Human ob1 = new Human("이지은");
		Student ob2 = new Student("홍진호", 22);
		ob1.show();
		ob2.show();
		// 상속을 사용하는 경우
		// A클래스와 B클래스가 is 관계가 성립하면 상속을 사용한다
		// 카테고리(범주)상의 포함관계일 경우에 사용한다
		// Student is a human
		// class Student extends Human
		
		// 물리적 포함관계는 상속으로 표현하지 않는다 (has)
		// Car has a tire
		// class Tire extends Car (X)
		
		// 같은 상황에서 서로 다른 클래스의 객체를 사용할 수 있는지 확인해보면 된다
		// 학생에게 말을 걸었다 -> 사람에게 말을 걸었다 (O)
		// 자동차를 운전한다 -> 타이어를 운전한다 (X)
		
		// [일반DB접속클래스]를 이용하여 DB에 접속한다-> [오라클DB접속클래스]를 이용하여 DB에 접속한다
	}
}
