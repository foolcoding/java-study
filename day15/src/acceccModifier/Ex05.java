package acceccModifier;

class Test5{
	private String name;
	private int age;
	private static int count;	// 필드의 초기값을 지정하지 않으면 0
	
	public Test5(String name, int age) {
		this.name = name;
		this.age = age;
		count++;		// 객체를 생성할 때 마다 count의 값을 1 증가시킨다
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getCount() {
		return count;
	}

	
	// 멤버필드와 같은 타입/이름의 값을 매개변수로 전달받아 필드에 대입하는 생성자
	// Constructor using Filed (필드를 사용하는 생성자)
	// 저장 !! -> 우클릭 -? source -> generate constructor using filed
	
	// 기본생성자를 작성하려면 클래스 내부 빈곳에서 ctrl + space
}

public class Ex05 {
	// tip
	// 이클립스에서 static 요소는 이텔릭(기울임꼴)이 적용된다
	// 이클립스에서 final 요소는 볼드체(굵게)가 적용된다
	public static void main(String[] args) {
		
		System.out.println("Test5 타입의 객체 수 :" + Test5.getCount());
		
		Test5 ob1 = new Test5("이지은", 30);
		Test5 ob2 = new Test5("홍진호", 41);
		
		System.out.println("Test5 타입의 객체 수 :" + Test5.getCount());
		
//		ob1.setCount(1);	// setter가 없어서 private필드의 값을 수정할 수 없다
//		Test5.setCount(1);	// 클래스로 접근해도 마찬가지
		
		System.out.printf("%s : %d살\n", ob1.getName(), ob1.getAge());
		System.out.printf("%s : %d살\n", ob2.getName(), ob2.getAge());
		System.out.println("ob1.getCount() : " + ob1.getCount());
		System.out.println("ob2.getCount() : " + ob2.getCount());
		
		// non-static 필드는 객체마다 서로 다른값을 저장하지만
		// static 필드는 클래스에 속한 값이며, 서로 다른 객체가 같은 값을 공유한다
		
		
	}
}
