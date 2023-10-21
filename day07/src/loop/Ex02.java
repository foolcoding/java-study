package loop;

public class Ex02 {
	public static void main(String[] args) {
		// 1) 횟수로 반복하는 경우
		for(int i = 0; i < 5; i++) {
			System.out.println((char)('A' + i) + " ");
//			System.out.println((char)('A' + 0) + " ");
//			System.out.println((char)('A' + 1) + " ");
//			System.out.println((char)('A' + 2) + " ");
//			System.out.println((char)('A' + 3) + " ");
//			System.out.println((char)('A' + 4) + " ");
		}
		
		// 2) 특정 요소의 길이를 횟수로 지정하여 반복하기
		int[] arr = { 4, 8, 2, 7, 6};	// int 형 변수 5개로 묵었다
		
		for(int i =0; i < arr.length; i++) {
			int num = arr[i];
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 3) 특정 묶음요소(배열, 리스트 등...)의 각 멤버요소를 기준으로 반복하기
		// 향상된 for문
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 프로그램의 목적 : 편리하게 작업을 수행하기 위해서
		// 데이터를 처리하여 출력하는 작업
		// 데이터의 수가 한두개가 아니다
		// 통상적인 프로그램은 처리해야 할 데이터의 개수가 많다 <- for문을 사용할 수 있는 이유
		
		// for문의 기본 구조
		int cnt = 0;					// 반복횟수을 제어할 변수	(1)
		while(cnt < 5) {				// 반복 조건 (횟수)		(2)
			System.out.println(cnt);	// 종속문장				(3)
			cnt++;						// 횟수에 대한 증감			(4)
		}
		System.out.println();
		for(int i =0; i < 5; i++) {		// for(1; 2; 4){
			System.out.println(i);		// 		3
		}								// }
		System.out.println();
		
		
		
	}
}
