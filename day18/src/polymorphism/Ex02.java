package polymorphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Human{
	String name;
	
	public Human(String name) {
;		this.name = name;
	}
	void info() {
		System.out.println("이름 : " + name);
		// 서브 클래스에서는 이 메서드를 오버라이딩해서 이름과 직업을 출력해야 합니다
	}
}

class Doctor extends Human{
	private final String job = "의사";
	
	public Doctor(String name) {
		super(name);
	}
	
	void cure(Human patient) {
		System.out.printf("%s이 %s에게 응급처치를 시행합니다\n", name, patient.name);
	}
	
	@Override
	void info() {
		System.out.println("이름 : " + name + " 직업 : " + job);
	}
}
class Singer extends Human{
	private final String job = "가수";
	
	public Singer(String name) {
		super(name);
	}
	
	@Override
	void info() {
		System.out.println("이름 : " + name + " 직업 : " + job);
	}
}
class Actor extends Human{
	private final String job = "배우";
	
	public Actor(String name) {
		super(name);
	}
	
	@Override
	void info() {
		System.out.println("이름 : " + name + " 직업 : " + job);
	}
}

class Airplane{
	private Human[] seat = new Human[4];
	
	public boolean entrance(Human guest) {		// 손님이 입장을 시도하면
		boolean result = false;					// 결과 반환 변수 (기본값 false)
		for(int i = 0; i < seat.length; i++) {	// 준비된 좌석(배열)중에서
			if(seat[i] == null) {				// 빈 칸을 찾아서
				seat[i] = guest;				// 빈 칸의 손님을 앉히고
				result = true;					// 결과를 true로 바꾼다음
				break;							// 반복을 중단한다
			}									// 만약 빈칸이 없다면 결과는 false가 된다
		}
		return result;
	}
	
	// 의사가 있는지 없는지 먼저 판별
	// 의사가 없으면 없다고 출력
	// 있으면 의사의 cure메서드를 호출하면서 환자 객체를 전달
	public void simulationEmergency(int index) {
		System.out.println(seat[index].name + " 손님이 배가 아픕니다");
		System.out.println("의사를 먼저 찾아야 합니다");
		System.out.println("의사를 찾아서 cure메서드를 호출하세요.");
		System.out.println("인자로 환자를 전달하면 됩니다");
		System.out.println();

		Doctor tmp = null;
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] instanceof Doctor)
				tmp = (Doctor) seat[i];
			}
		if(tmp == null) {
			System.out.println("의사가 없습니다");
		}
		else if(tmp == seat[index]) {
			System.out.println("자기 자신을 치료할수 없습니다");
		}
		else {
			tmp.cure(seat[index]);
		}
	}// end of simulationEmergency
} // end of Airplane


public class Ex02 {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		Doctor doctor = new Doctor("이익준");
		Singer guest1 = new Singer("차은우");
		Actor guest2 = new Actor("강동원");
		Human guest3 = new Human("신유진");
		Human guest4 = new Human("왕제은");
		
		Human[] queue = { doctor, guest1, guest2, guest3, guest4 };	// 배열
		List<Human> list = Arrays.asList(queue);	// 배열을 리스트로
		Collections.shuffle(list);					// 리스트 내부 순서를 랜덤으로 섞는다
		list.toArray(queue);						// 다시 배열로
		
		for(int i = 0; i < queue.length; i++) {
			boolean flag = air.entrance(queue[i]);
			System.out.printf("%s : 탑승 %s\n", queue[i].name, flag ? "성공" : "실패");
		}
		air.simulationEmergency(1);

		// 슈퍼클래스의 배열에 담거나, 슈퍼클래스 타입의 메개변수에 전달하면 업캐스팅이 발생한다
		// 업캐스팅 상태에서도 오버라이딩 메서드는 바로 호출하여 실행하면 된다
		// 오버라이딩이 아닌 고유 메서드는 다운캐스팅 후 실행해야 한다
		// 다운 캐스팅 하기전에 instanceof 을 활용하여 타입을 확인하고 형변환을 수행해야 한다
	}
}
