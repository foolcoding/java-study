package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

/*
		 놀이공원에 있는 놀이기구에 대한 이용 요금을 계산해야 한다
		 이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
		 이용시간에 따라 추가 요금이 발생한다
		 그 시간과 요금은 아래와 같아
		 
		 시간		요금
		 0 ~ 30		3000
		 31 ~ 40	3500
		 41 ~ 50	4000
		 ....
		 
		 시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
*/
		Scanner sc = new Scanner(System.in);
		int time, addTime, basicFee, addFee , fee;
		System.out.println("이용시간을 입력하세요 : ");
		time = sc.nextInt();
		addTime = time - 30;
		basicFee = 3000;
/*
		 time = sc.nextInt() + 9;
		 if(time > 30) {
		 	fee += (time - 30) / 10 * 500;
		 }
*/
/*
		 if(time > 30) {
		 	fee += (time - 21) / 10 * 500;
		 }
*/
		if(time > 30) {
			if (time % 10 == 0) {addTime -= 1;}
			addFee = (addTime / 10 + 1)  * 500;
		}
		else {
			addFee = 0;
		}
		
		fee = basicFee + addFee;
		
		System.out.printf("이용시간은 %d분이고 총 요금은 %d원 입니다", time, fee);
		
	}
}
