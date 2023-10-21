package loop;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// String 타입의 데이터를 for문으로 접근하기
		
		String s1 = "Hello, world";
		
		System.out.println("s1 : " + s1);
		System.out.println("s1.length() : " + s1.length());
		
		// 문자열을 문자(char)의 배열로 변형
		char[] arr = s1.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("arr : " + Arrays.toString(arr));
		// 배열의 i번째 글자 중에서, 짝수번째 글자가 알파벳 소문자이면 대문자로 바꾸기
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if(i % 2 == 0 && 'a' <= ch && ch <= 'z') {
				arr[i] = (char)(ch - 32);
			}
		}
		System.out.println(arr);
		System.out.println();
		
		// 1) 주어진 문자열을 char[]로 변형한다음, 모든 소문자를 대문자로 변경하라
		// 2) 공백문자는 알파벳이 아니다 !!
		String s2 = "Life is too short";	
		char[] arr2 = s2.toCharArray();
		
		for(int i = 0; i < arr2.length; i++) {	// 배열의 길이만큼 반복
			char ch = arr2[i];					// 각 글자를 ch에 저장해두고
			if('a' <= ch && ch <= 'z') {		// ch가 a와 z 사이에 있다면 (소문자일때)
				arr2[i] -= 32;					// 배열의 값에 32를 빼서 대문자로 변경
			}
		}
		System.out.println(arr2);
		System.out.println();
		
		// 2) 주어진 문자열에서 숫자는 그대로 출력하고 숫자가아닌 값은 출력하지 않고 줄을 띄우기
		String s3 = "9445-0230-1176-8878";
		char[] arr3 = s3.toCharArray();
		char enter = '\n';

		for(int i = 0; i < arr3.length; i++) {
			char ch = arr3[i];
			if('0' <= ch && ch <= '9') {
				System.out.print(ch);
			}
			else {
				System.out.println();
			}
		}
		
		
		
		
		
	}
}
