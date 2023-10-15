package operrater;

public class Ex07 {
	public static void main(String[] args) {
		// 단항 증감 연산자 : 1개의 변수에 붙어서 값을 1 증가시키거나, 1 감소시킨다
		// 변수앞에 붙으면 전위/전치
		// 변수뒤에 붙으면 후위/후치
		// 전위 연산자는 먼저 값을 증감시키고 수식을 처리한다
		// 후위 연산자는 먼저 수식을 처리하고, 이후에 증감시킨다
		
		int num = 10;
		System.out.println(num++);		// 출력한 다음 1 증가시킨다
		System.out.println(++num);		// 먼저 1 증가시키고 이후 출력한다
		System.out.println(--num);		// 먼저 1 증가시키고 이후 출력한다
		System.out.println(num--);		// 출력한 다음 1 감소시킨다
		
		
		System.out.println("num : " + num);
		
		int n1 = 2, n2 = 1, n3 = 0, n4 =-1;
		int a1 = n1++ + ++n2;
		int a2 = (n1 += 1) + (n2 += 1);
		System.out.println(a1);
		System.out.println(a2);
		
		for(int i = 0; i < 5; i++) {		// i++, i += 1 같음
			System.out.println(i);
		}
		
		
	}
}
