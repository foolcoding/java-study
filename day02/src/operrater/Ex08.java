package operrater;

public class Ex08 {
	public static void main(String[] args) {
		// 비트 연산
		
		int n1 = 4;
		int n2 = 5;
		
		int a1 = n1 & n2;	// 비트 & 연산은 이진수일때 각 자리가 일치하면 1, 불일치하면 0
		int a2 = n1 | n2;	// 비트 | 연산은 이진수일때 각 자리가 하나라도 1이 있으면 1, 아니면 0
		int a3 = n1 << 1;	// 비트 시프트 연산 << 은 이진수 모양에서 각 자릿수를 왼쪽으로 옮기기
		int a4 = n2 >> 1;	// 비트 시프트 연산 >> 은 이진수 모양에서 각 자릿수를 오른쪽으로 옮기기
		int a5 = n1 << 2;	// 왼쪽으로 2칸씩 옮기기
		
		System.out.println("n1 : " + Integer.toBinaryString(n1));
		System.out.println("n2 : " + Integer.toBinaryString(n2));
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
	}
}
