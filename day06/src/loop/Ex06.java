package loop;

import java.nio.file.spi.FileSystemProvider;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다
		// 첫날에 10원, 그다음날에 20원, 다음날에 40원을 입금한다
		// 이런 식으로 전날의 두배를 준비하여 입금한다
		// 30일째 입금이 끝난후
		// 31일에 은행에 누적된 총 금액은 얼마인지 계산하여 출력한다
		// (금액이 천단위 구분기로 콤마를 적용하여 출력하세요)
		
		int day;
		double money, bank; // long쓰면 소수점 안나오고 출력댐
		bank = 0;
		money = 10;
		day = 1;
		
		while(day < 31) {
			bank += money;
			money *= 2;
			day++;
		}
		System.out.printf("총금액은 %,.0f원입니다", bank);
		
	}
}
