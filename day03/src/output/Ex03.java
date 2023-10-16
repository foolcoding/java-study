package output;

public class Ex03 {
	public static void main(String[] args) {
		// 이스케피으 시퀀스 : 글자로 표현되지는 않으나, 특정 기능을 포함하는 특수문자
/*
		\r		carrige return	커서를 줄 가장 왼쪽으로 이동시킨다
		\n		line feed		커서를 한 줄 아래로 내린다
		\b		backspace		커서를 왼쪽으로 한칸 이동시킨다. (글자를 지우지 않는다)
		\t		tab				탭 크기(4 or 8)만큼 오른쪽으로 커서를 이동시킨다	 
*/
		
		System.out.println("A\rB");
		System.out.println("A\nB");
		System.out.println("A\bB");
		System.out.println("A\tB");
		
		System.out.println("A\t1");
		System.out.println("AB\t1");
		System.out.println("ABC\t1");
		System.out.println("ABCD\t1");
		System.out.println("ABCDE\t1");
		System.out.println("ABCDEF\t1");
		System.out.println("ABCDEFG\t1");
		System.out.println("ABCDEFGH\t1");
		
		System.out.println("밥\t!!");
		System.out.println("치킨\t!!");
		System.out.println("햄버거\t!!");
		System.out.println("스파게티\t!!");
		System.out.println("찹쌀탕수육\t!!");
		System.out.println("엄마는외계인\t!!");

		char lf = '\n';
		char ch = '\r';
		char bs = '\b';
		char tab = '\t';
		
		System.out.printf("lf : %c (%d)\n", lf, (int)lf);
		System.out.printf("ch : %c (%d)\n", ch, (int)ch);
		System.out.printf("bs : %c (%d)\n", bs, (int)bs);
		System.out.printf("tab : %c (%d)\n", tab, (int)tab);
		
//		ASCII Code
//		American Standard Code ofr Information Interchange
//		미국 표준 글자를 변환하는 규칙 (영문자와 숫자 및 특수기호)
//		컴퓨터는 내부에서 모든 데이터를 숫자형태로 가지기 때문에
//		사람이 보고 식별해야하는 글자는 특성 숫자와 매칭하여 변환 규칙을 가져야만 한다
		
		String hello = "Hello";
		
		for(int i = 0; i < hello.length(); i++) {
			char a = hello.charAt(i);
		System.out.printf("%c (%d)\n", a, (int)a);
		}
		System.out.println();
		
		// a ~ z (97 ~ 122)
		// A ~ Z (65 ~ 90)
		// 0 ~ 9 (48 ~ 57)
		// \r(13), \n(10), ' '(32)
		
		System.out.printf("%c (%d)\n", '가', (int)'가');
		System.out.printf("%c (%d)\n", '핳', (int)'핳');
		
//		for(char b = 44032; b <= 55203; b++) {
//			System.out.printf("%c (%d)\n", b, (int)b);
//		}
		
		char c = '아';
			System.out.printf("%c (%d)\n", c, (int)c);
			
			
		// 출력 스트림의 종류
		System.out.println("Stdout (표준 출력 스트림)");
		System.err.println("errout (에러 출력 스트림)");
		
		System.err.printf("에러를 서식에 맞게 처리할 수 있음 : %s\n", new Exception("내가 만든 예외"));
		
		
		
		
		
		
	}
}
