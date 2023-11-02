package acceccModifier;

class Message {
	
	private String name;
	// 같은 클래스를 가숑하는 서도 다른 객체라면
	// private이더라도 필드 값에 직접 접근할 수 있다
	
	public Message(String name) {
		this.name = name;
	}
	
	void sendMessage(Message other, String message) {
		// 받는 사람의 receivevMessage를 호출한다
		// 이때 전달하는 this는 sendMessage를 호출했던 자기자신이다
		// 따라서 this의 자료명은 Message이다
		other.receieveMessage(this, message);
	}
	
	void receieveMessage(Message sender, String message) {
		System.out.printf("=== %s의 화면 ===\n", this.name);
		System.out.printf("%s : %s\n", sender.name, message);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Message ob1 = new Message("짱구");
		Message ob2 = new Message("유리");
				
		ob1.sendMessage(ob2, "유리야 안녕");
		ob2.sendMessage(ob1, "안녕 짱구야, 소꿉놀이 하러 갈래?");
	}
}
