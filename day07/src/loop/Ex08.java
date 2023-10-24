package loop;

public class Ex08 {
	public static void main(String[] args) {
		// 단일 for문으로 1부터 9까지 출력하기
		for(int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		} System.out.println();
		
		// 이중 for문으로 1부터 9까지 출력하기
		for(int i = 1; i < 9; i += 3) {			// 1 4 7
			for(int j = i; j < i + 3; j++) {	// 1 2 3 4 5 6 7 8 9
				System.out.print(j + " ");
			} System.out.println();
		} System.out.println();
		
		
		// 시작부터 마지막값까지 일정한 크기로 변하면서 연속성이 필요하다
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", 3, i, 3 * i);
		} System.out.println();
		
		// 2단부터 9단까지 구구단 출력하기
		for(int dan = 2; dan < 10; dan++) {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			} System.out.println();
		} System.out.println();
		
		
	}
}
