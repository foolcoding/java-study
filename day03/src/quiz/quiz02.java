package quiz;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삽겹살 1인분이 8500원이고
		// 소주 1병 (4500원), 맥주 1병 (5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야 하는지 계산하여 출력하는 프로그램을 작성하세요
		
		int basicvalue;
		int samgubsar;
		int average;
		int sumvalue;
		
	
		basicvalue = 4500 + 5000 + 8500 * 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("삼겹살 추가 인분 : ");
		samgubsar = sc.nextInt();
		sumvalue = basicvalue + (samgubsar * 8500);
		average = sumvalue / 2;
		
		System.out.print("기본금액은 " + basicvalue + "원 이고 추가 인분은 "
		+ samgubsar + " 인분이므로 총 금액은 " + sumvalue + "원 이고 인당은 " + average + "원 이다");
}
}
