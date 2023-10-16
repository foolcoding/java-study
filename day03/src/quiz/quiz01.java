package quiz;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
	
	// 이름과 나이를 입력받고
	// 나이를 이용하여 성인 여부를 문자열로 준비한다음
	// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
	// (단, 성인은 20세 이상입니다)
	
	// 1) 변수 선언 및 초기화
		String name;
		int age;
		boolean isAdult;
		Scanner sc = new Scanner(System.in);

		
	// 2) 입력
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		
	// 3) 연산
		isAdult = age >= 20;
		
	// 4) 출력
//		System.out.printf("%s님의 나이는 %d세 이고 %s니다", name, age, isAdult ? "성인입" : "성인이 아닙");
		if(isAdult) {
			System.out.println(name + "님은 " + age + "세로 성인입니다");
		}
		else {
				System.out.println(name + "님은 " + age + "세로 성인이 아닙니다");
				}
		
		
	// 5) 마무리
	sc.close();
}
}
