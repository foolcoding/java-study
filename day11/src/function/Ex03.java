package function;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// RPG게임의 아이템 강화 시뮬레이션
		
		// 아이템 강화할때 마다 아이템의 레벨이 올라간다
		// 아이템을 강화하는데는 일정량의 게임머니가 소비된다
		// 게임머니는 한정되어있다
		// 아이템의 레벨이 일정값을 넘어가면 강화 확률이 감소한다
		// 레벨1 ~ 레벨5 100%
		// 레벨6 : 90%
		// 레벨7 : 80%
		// 만약, 강화에 실패하면 게임머니는 그대로 소비하지만 아이템의 레벨은 오히려 떨어진다
		// 한정된 게임머니로 누가 제일 높은 레벨까지 도달하는지 겨루는 게임
		// 게임머니를 모두 소비하거나, 스스로 중단 할 수 있다
		
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		int fee = 500;
		int lv = 1;
		int menu = 0;
		boolean flag;
		
		LOOP : while(true) {
			System.out.println("======================");
			System.out.println("현재 레벨 : " + lv);
			System.out.printf("현재 머니 : %,d원\n", money);
			System.out.println("1, 강화");
			System.out.println("0, 포기");
			System.out.print("메뉴 선택 >>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(money < fee) {
					System.out.println("돈 벌어 오세요ㅕ");
					break LOOP;
				}
				for(int i = 0; i < 3; i++) {
					System.out.print(".");
					try { Thread.sleep(500);} catch(Exception e) {}
				}
				flag = enhance(lv);	// 강화시도하고 결과를 반환(현재 아이템 레벨에 따라 성공확률이 달라진다)
				money -= fee;		// 강화비용 받는다
				lv += flag ? 1 : -1;// 성공하면 1이더해지고 실패하면 -1
				System.out.println(flag ? "강화 성공" : "허헛.. 손이 미끄러졌구먼");
				break;
			case 0:
				break LOOP;
			}
			System.out.println();
		}	// end of while
		System.out.println("최종 결과");
		System.out.println("현재 레벨 : " + lv);
		System.out.printf("현재 머니 : %,d원\n", money);
		System.out.println("점수 : " + (lv * 1000 + money));
		
		sc.close();
		
	}	// end of main
	static boolean enhance(int lv) {
		Random ran = new Random();
		int per = 100;
			per -= (lv - 4) * 10;

		int suc = ran.nextInt(100) + 1;
		System.out.printf("%d / %d\n", suc, per);
		if(suc > per){
			return false;
		}
		else {
			return true;
		}
	}
}// end of class : main 혹은 다른 함수들은 모두 class 내부에 있어야 한다
