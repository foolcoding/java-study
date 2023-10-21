package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 입력받은 숫자를 이용하여 진행상황 출력하기
		Scanner sc = new Scanner(System.in);
		int maxSize = 100;
		int currentSize;
		
		System.out.print("현재 진행율 입력 : ");
		currentSize = sc.nextInt();
		
		System.out.print("[");
		for(int i = 0; i < maxSize / 2; i++) {
			if(i == maxSize / 4) {
				System.out.printf(" %3d %% ", currentSize);
			}
			else if(i < currentSize / 2) {
				System.out.print("#");
			}
			else {
				System.out.print("_");
			}
			Thread.sleep(50);
		}
		System.out.println("]");
		sc.close();
		
		
	}
}
