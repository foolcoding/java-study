package loop;

public class Ex09 {
	public static void main(String[] args) {
		
		// 1) 1부터 5까지 한줄에 출력하기
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
		}	System.out.println("\n");
		
		// 2) 1부터 5까지 한줄 출력코드를 다시 5번 출력하기
		for(int i = 0; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println(j + " ");
			}
		}	System.out.println("\n");
		
		// 3) 다른 변수를 만들어주고 1부터 25까지 5x5 크기로 출력한다
		int num = 1;	// x번째줄에 y번째칸
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", num);
				num++;
			}
			System.out.println();
		}
		System.out.println();
		
		// 4) (i, j)번째 칸에 원하는 글자를 출력하기
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 2 || j == 2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 5) 네모
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 0 || j == 0 || j == 4 || i == 4) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 6) 바둑식배열
		for (int i = 0; i < 5; i++) {
			if(i == 0 || i == 2 || i == 4) {
				System.out.print("# ");
			}
			for(int j = 0; j < 5; j++) {
				if(j == 1 || j == 3 ) {
//				if(n1 % == 1) {
//				if((i + j) % 2 == 0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
//				n1++;
			}
			System.out.println();
		}
		System.out.println();
	}
}
