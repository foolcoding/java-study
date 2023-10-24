package star;

public class Ex01 {
	public static void main(String[] args) {
		
		// num과 i를 더했을때 항상 5가 나오는 식
		for(int i = 1; i <= 5; i++) {	// 한 줄의 내용을 출력한다
			int num = 5 - i;
			
			for(int j = 0; j < num; j++) {	// 5, 4, 3, 2, 1
				System.out.print("_ ");		// 한 줄 안에서 먼저 나오는 글자의 개수
			}
			for(int j = 0; j < i; j++) {	// 0, 1, 2, 3, 4
				System.out.print("# ");		// 한 줄 안에서 나중에 나오는 글자의 개수
			}
			System.out.printf("\t%d, %d", num, i);	// 개수 확인용 출력
			System.out.println();					// 한줄의 출력이 끝나면 줄을 바꾼다
		}
	}
}
