package string;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
		String s1 = "a1B2c3D4e5";
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				s2 += ch;
			}
		}
		System.out.println("s2 : " + s2);
		
	}
}
