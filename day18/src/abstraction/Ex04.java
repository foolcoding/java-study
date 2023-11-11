package abstraction;

abstract class Playable{
	
	String name;

	public Playable(String name) {
		this.name = name;
	}
	
	// 캐릭터의 공격방식에 따라 서로 다른 형태의 출력문이 출력되어야 한다
	// 현재 단계에서는 미구현, Playable을 상속받는 각각의 클래스가 다른 내용을 가지게 된다
	// attack 메서드를 가지지 않는 서브클래스는 존재하지 않는다
	public abstract void attack();
}

class Warrior extends Playable{
	public Warrior(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.printf("%s가 망치로 적을 공격합니다\n", name);
		
	}
}

class Magician extends Playable{
	public Magician(String name) {
		super(name);
	}
	@Override
	public void attack() {
		System.out.printf("%s가 지팡이로 적을 공격합니다\n", name);
	}
}

class Soldier extends Playable{
	public Soldier(String name) {
		super(name);
	}
	@Override
	public void attack() {
		System.out.printf("%s가 Ak-47로 적을 공격합니다\n", name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// 다형성에 의해 서브클래스의 객체는 슈퍼클래스 타입의 변수로 참조될 수 있다
		Playable ob1 = new Warrior("라인하르트");
		Playable ob2 = new Magician("모이라");
		Playable ob3 = new Soldier("애쉬");
		
		// 서로 다른 클래스의 생성자에 의해 생성된 객체들은 추상클래스를 상속받아서
		// attack()이라는 메서드를 강제로 구현해야하기 때문에 모두 attack를 호출할 수 있다
		// 그러나 객체의 내용은 모두 다르다
		ob1.attack();
		ob2.attack();
		ob3.attack();
		
	}
}
