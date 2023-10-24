package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		String date = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			date += sc.nextLine() + "\n";
		}
		sc.close();
		
		
		// 문제) date 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇개일까요
		String s1 = "";
		for(int i = 0; i < date.length(); i++) {
			char ch = date.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				s1 += ch;
			}
		}
		System.out.println("s1 : " + s1);
		System.out.println("s1.length() : " + s1.length());
		
		// 위와 비슷한 구조의 숫자 문제
		// 1에서 1000사이의 정수 중에서 13과 17의 공배수는 총 몇개인지 출력하세요
		
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 13 == 0 && i % 17 == 0) {
				System.out.println(i);
				count += 1;
			}
		}
		System.out.println("13과 17의 공배수의 개수 : " + count);
		
		
	}
}
