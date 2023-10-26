package function;

public class Ex02 {
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int result;
		if(n1 < n2 && n1 < n3) {
			result = n1;
		}
		else if(n2 < n3) {
			result = n2;
		}
		else {
			result = n3;
		}
		return result;
	}
	
	static String upperCase(String s1) {
		String result = "";
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(i == 0 && ch <= 'z' && ch >= 'a') {
				ch -= 32;
			}
			result += ch;
		}
		return result;
	}
	
	static String substring(String s1, int n1, int n2) {
		String result = "";
		for(int i = n1; i < n2; i++) {
			result += s1.charAt(i);
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성
			int result = add(3, 4);
			System.out.println("result : " + result);
		
		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성
			int result2 = getMinNumber(6, 3, 1);
			System.out.println("result2 : " + result2);
			
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성해라
			String result3 = upperCase("hello");
			System.out.println("result3 : " + result3);
			
			String result4 = upperCase("3 years later");
			System.out.println("result4 : " + result4);
			
		// 4)  문자열 하나와 정수 두개를 전달받아서
		// 문자열의 from번째 글자부터 to 글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!", 0, 5);
		System.out.println("q4 : " + q4);
		
		String t4 = substring("Hello, world !!", 7, 12);
		System.out.println("t4 : " + t4);
		
		
		
	}
}
