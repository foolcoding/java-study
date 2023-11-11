package abstraction;

public class Ex05 {
	public static void main(String[] args) {
		// 추상클래스는 생성자를 직접 호출하여 객체를 생성할 수 없다
		// 하지만, 별도의 서브클래스를 작성하지 않고 즉석에서 서브클래스를 만들고 객체를 생성할 수 있다
		// 즉석에서 만들어지기 때문에 클래스에 부여되는 이름은 별도로 없다
		// 이런 형식을 익명 클래스 (anonymous Inner Type)라고 한다.
		
		Playable ob = new Playable("마리오") {	// Playable을 상속받는 이름없는 서브 클래스
			@Override	// 슈퍼클래스로부터 상속받은 메서드를 재정의
			public void attack() {
				System.out.printf("%s가 적을 밟아서 공격합니다\n", name);
			}
		};
		
		ob.attack();
	}
}
