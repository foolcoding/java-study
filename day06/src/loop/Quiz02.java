package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user = 0;
		int count = 0;
		
		// 반복을 수행하면서
		//		사용자에게 값을 입력받고
		//		만약 정답이 입력값보다 작으면 DOWN
		// 			정답이 입력값보다 크면 UP
		//		반복할때마다 횟수를 증가시키기
		// 반복이 끝나면 정답과 횟수를 출력하고 종료
		
		while(user != answer) {
			user = sc.nextInt();
			count++;
			if(user < answer) {
				System.out.println("UP");
				}
			else if(user > answer) {
				System.out.println("DOWN");
				}
			}
		System.out.printf("정답은 %d이고 총입력횟수는 %d입니다", answer, count);
		sc.close();
		
		
		
	}
}
