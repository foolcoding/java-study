package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC;
		
		eleA = ran.nextInt(15) + 1;	// 1 ~ 15
		eleB = ran.nextInt(15) + 1;	// 1 ~ 15
		eleC = ran.nextInt(15) + 1;	// 1 ~ 15
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		
		Scanner sc = new Scanner(System.in);
		int myPlace, a, b, c, close;
		System.out.print("현재 자신의 위치를 1 ~ 15 사이로 입력하세요 : ");
		myPlace = sc.nextInt();
		a = myPlace - eleA;
		b = myPlace - eleB;
		c = myPlace - eleC;

		if (a < 0) a = -a;
		if (b < 0) b *= -1;
		if (c < 0) c *= -1;

		if (true) close = eleA;
		if (b < a && b < c) close = eleB;
		if (c < a && c < b)	close = eleC;

		if (close == eleA) System.out.printf("가장 가까운 엘레베이터는 a 입니다");
		if (close == eleB) System.out.printf("가장 가까운 엘레베이터는 b 입니다");
		if (close == eleC) System.out.printf("가장 가까운 엘레베이터는 c 입니다");
		sc.close();
	}
}
