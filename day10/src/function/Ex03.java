package function;

public class Ex03 {
	// 두 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		return result;
	}
	
	static int getMaxNum(int n1, int n2, int n3) {
		int max = 0;
		if (max < n1) {
			max = n1;
		}
		if (max < n2) {
			max = n2;
		}
		if (max < n3) {
			max = n3;
		}
		
		return max;
	}
	
	static int getMaxNum(int... arr) {	// 같은 자료형의 여러 매개변수 개수가 일정하지 않을때
										// 가변인자 : 인자의 개수가 일정하지 않음
		int result = 0;
//		for(int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			if(result < num)
//				result = num;
//		}
//		return result;
		
		for(int num : arr) {
			if(result < num) {
				result = num;
			}
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		int num1 = getMaxNum(1, 2);
		int num2 = getMaxNum(10, 20, 30);
		int num3 = getMaxNum(1, 2, 3, 3, 5, 60, 700);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}
}
