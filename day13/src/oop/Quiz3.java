package oop;

import java.util.Scanner;

class TV {
	// TV의 속성을 필드로 작성하세요
	// 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요
	
	int channel;
	int volume;
	boolean power;
	int volumeBef;
	
	// TV의 기능을 메서드로 정의하세요
	// 전원 on/off, 채널올림/내림, 볼룸올림/내림, TV상태 출력, 음소거
	// 채널은 일정 범위안에서 cycle형식으로 순환되어야 합니다 99 -> 1	//
	// 볼륨은 일정 범위안에서 최소 최대치를 넘길 수 없습니다 10
	// 음소거는 한번누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 합니다
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다
	
	// 생성자에서 객체 생성 시 초기값을 지정하세요		//
	// 매개변수를 받지 않아도 초기값을 지정할 수 있습니다	//
	// 에를 들면 채널의 초기값이 0인것은 이상합니다, 다른 값이 초기값이 되도록 하세요	//
	
	TV() {
		this.channel = 1; 
		this.volume = 3;
		this.power = false;
	}
	
	void turn() {
		power = !power;
	}
	
	boolean powerCheck() {
		boolean result;
		result = power;
		return result;
	}
	
	void volumeUp() {
		volume++;
		if(volume >= 11) {
			System.out.println("더이상 늘릴수 없습니다");
			volume--;
		}
}

	void volumeDown() {
		volume--;
		if(volume <= 0) {
			System.out.println("더이상 줄일수 없습니다");
			volume++;
		}
}
	
	void channelUp() {
			channel++;
		if(channel >= 100) {
			channel = 1;
		}
	}
	
	void channelDown() {
			channel--;
			if(channel <= 0) {
				channel = 99;
			}
		}
	
	void show(){
		System.out.println("┌──────────────────────┐");
		System.out.printf("│\tch : %d\t       │\n│\tvol : %d        │\n│\tpower : %s    │\n", channel, volume, power ? "on " : "off");
		System.out.println("└──────────┬───────────┘");
		System.out.println("    ───────┴────────");
	}
	
	void mute() {
		if(volume != 0) {
			volumeBef = volume;
			volume = 0;
		}
		else {
			volume = volumeBef;
		}
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		TV tv = new TV();
		
		LOOP : while(true) {
			tv.show();
			System.out.println("┌─────────────────────┐");
			System.out.println("│   vol      ch       │");
			System.out.println("│ up   : 1 up   : 5   │");
			System.out.println("│ down : 3 down : 7   │");
			System.out.println("│ mute : 2 power : 10 │");
			System.out.println("└─────────────────────┘");
			System.out.print("선택 >>> ");
			menu = sc.nextInt();
			
			if(tv.powerCheck()) {
			switch(menu) {
			// 입력된 메뉴에 따라서 tv객체의 메서드를 호출하는 형태로 전환
			case 1: tv.volumeUp();
					break;
			case 2: tv.mute();
					break;
			case 3: tv.volumeDown();
					break;
			case 5: tv.channelUp();
					break;
			case 7: tv.channelDown();
					break;
			case 10: tv.turn();
					break;
			case 0:
				break LOOP;
			}
			}
			else if(menu == 10) {
				tv.turn();
			}
			else {
				System.out.println("tv전원을 켜주세요");
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
