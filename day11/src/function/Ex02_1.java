package function;

import java.util.Scanner;

public class Ex02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String birth;

		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println();

		
		while(true) {
			System.out.print("생년월일 입력 (yymmdd) : ");
			birth = sc.nextLine();
			boolean b1 = true;
			for(int i = 0; i < birth.length(); i++) {
				char ch = birth.charAt(i);
				if(ch < '0' || '9' < ch) {
					b1 = false;
				}
			}
			if(birth.length() == 6 && b1) {
				break;
			}
			System.err.println("생년월일은 6자리의 정수로 입력해주세요");
		}
		
		int year = Integer.parseInt(birth.substring(0, 2));
		year += (23 < year) ? 1900 : 2000;
		int month = Integer.parseInt(birth.substring(2, 4));
		int date = Integer.parseInt(birth.substring(4));

		int age = 2023 - year;
		
		System.out.printf("%s님은 %d살이고, %4d-%02d-%02d 출생입니다", name, age, year, month, date);


		sc.close();
		



		
	}
}
