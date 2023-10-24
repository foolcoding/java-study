package day09;

import java.util.Scanner;

class Solution {
	public boolean solution(String cardNum) {
		Scanner sc = new Scanner(System.in);
		System.out.print("카드번호 16자리를 입력하세요 : ");
		String cardNum = sc.next();
		int num = 0;
		
		for(int i = 0; i < cardNum.length(); i++) {
			char ch = cardNum.charAt(i);
			num = ch - '0';
			if(i % 2 == 0) {
				num *= 2;
				if(num >= 10) {
					num += (num / 10) + (num % 10);
				}
			}
		}
		System.out.println("num : " + num);
		
		int sum = 0; 
		sum += output;

		return sum % 10 == 0
		
	}
}

public class Luhn {
	// 1) 카드번호에 -가 포함되어 있다면 제거해야한다
	// 2) 문자열에서 각자리의 글자를 계산할수 있는 숫자로 추출해야한다
	// 3) 왼쪽부터 index를 기준으로 세어서 짝수는 2배, 홀수는 그대로 둔다
	// 4) 만약 2배한 값이 두자리수이면(=10이상이면), 각 자릿수를 합친다
	// 5) 16개의 숫자의 합계를 구할 변수가 준비되어 있어야 한다
	// 6) 검증이 끝나면 함수형태로 변경하여 여러 값을 처리할 수 있도록 한다
	
	String input = "1162343410102111";
	String input2 = "1162-3434-1010-2113";
	Solution s = new Solution();
	System.out.println("input이 유효한가 : " + solution(input));
	System.out.println("input2이 유효한가 : " + solution(input2));

	}
}


