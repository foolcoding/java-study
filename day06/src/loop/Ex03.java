package loop;

public class Ex03 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num < 5) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num = 0;
		while(true) {
			System.out.println(num);
			num++;
			if(num >= 5) {			// if의 조건이 참이면 break 한다, 반복문 종료
				break;
			}
		}
		System.out.println();
		
		/*
		num = 0;
		while(true) {
			System.out.println(num);
			num++;
			if(num < 0) {
				break;			// 0보다 작을 수 없기 때문에 절대 실행되지 않는 if문
			}					// 사실상 없는 문장
		}
		*/
		
		
		
}
}
