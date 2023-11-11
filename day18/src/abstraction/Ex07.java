package abstraction;

interface USB{
	/* public abstract */ void onConnect();
}

class wirelessReceiver extends Object implements USB {
	@Override
	public void onConnect() {
		System.out.println("무선 장치가 연결 되었습니다");
	}
}
class MemoryStick extends Object implements USB {
	@Override
	public void onConnect() {
		System.out.println("메모리 연결됨, 64GB");
	}
}
class ElectricFan extends Object implements USB {
	@Override
	public void onConnect() {
		System.out.println("전원 충전 중..67%");
	}
}
class PC {
	void connect(USB ob) {		// 원래 자료형이 무엇이든 PC에 연결되면
		ob.onConnect();			// 장치 내부에 담겨있는 안결 후 작동을 수행한다
	}
}

public class Ex07 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		// 서로 다른 클래스, 슈퍼클래스를 가지고 있어도 하나의 인터페이스로 묶을 수 있따
		ElectricFan fan = new ElectricFan();
		MemoryStick stick = new MemoryStick();
		wirelessReceiver receiver = new wirelessReceiver();
		
		pc.connect(fan);
		pc.connect(stick);
		pc.connect(receiver);
		
		// 만약, 인터페이스의 추상메서드가 하나만 있다면 람다식으로 객체를 생성할 수 있다
		// 추상메서드를 하나만 가지는 인터페이스를 함수형 인터페이스(Functionalinterface)라고 한다
		// (매개변수) -> { 함수 내용 }
		// 매개변수가 1개라면 () 생략가능
		// 함수 내용이 1줄이라면 {} 생략가능
		// 함수 냐용이 1줄이면서 return이면 return도 생략해야함
		
		USB mouse = () -> System.out.println("마우스 연결함");
		pc.connect(mouse);
		
		// 람다식이 익명클래스에 비해 문법이 간결하기 때문에 자주 사용한다
	}
}
