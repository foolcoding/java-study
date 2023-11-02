package reference;

public class Ex08 {
	public static void main(String[] args) {
		// compareTo 함수를 직접 구현해보기
		
		String s1 = "apple";	// 97 112 112 108 101
		String s2 = "banana";	// 98  97 110  97 110 97 
		String s3 = "aegnl";	// 97 101 103 105 115
		String s4 = "banan";	// 98  97 110  97
		
		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) : " + s1.compareTo(s3));
		System.out.println("s2.compareTo(s3) : " + s2.compareTo(s3));
		System.out.println("s2.compareTo(s4) : " + s2.compareTo(s4));
		System.out.println();
		
		System.out.println("myCompareTo(s1, s2) : " + myCompareTo(s1, s2));
		System.out.println("myCompareTo(s1, s3) : " + myCompareTo(s1, s3));
		System.out.println("myCompareTo(s2, s3) : " + myCompareTo(s2, s3));
		System.out.println("myCompareTo@s2, s4) : " + myCompareTo(s2, s4));
		System.out.println();
	}
	
	static int myCompareTo(String s1, String s2) {
		int answer = 0;
		
		// 두 문자열의 길이가 다르다면 작은 문자열을 반복해야한다
		int size = s1.length() > s2.length() ? s2.length() : s1.length();;
		
		for(int i = 0; i < size; i++) {
			char a = s1.charAt(i);
			char b = s2.charAt(i);
			if(a != b) {
				answer = a - b;
				break;
			}
		}
		if(answer == 0 && s1.length() != s2.length()) {
			answer = s1.length() - s2.length();
		}
		
		return answer;
	}
}
