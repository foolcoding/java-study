package array;

public class Ex01 {
	public static void main(String[] args) {
		
		// 프로그램에서 데이터를 저장해서 사용
		
		// 자료형, 변수, 상수, 리터럴
		// 자료형 : String
		// 변수 : str
		// 리터럴 : "Hello"
		String str = "Hello";
		System.out.println(str);
		
		// 대부분의 프로그램은 소수가 아닌, 다수의 데이터를 다루게 된다
		// 데이터가 많다면, 반복문을 이용하면 되는것 아닌가?
		// => 다음 3개의 데이터를 각 2배씩 곱한다음 화면에 출력해뵤세요
		
		int n1 = 3, n2 = 5, n3 = 8;
//		for(int i = 1; i <= 3; i++) {
//			ni = ni * 2;
//			System.out.println(ni);
//		}
		
		// [같은 자료형]의 여러 변수를 연속된 메모리 공간에 배치하기 위해서 사용하는 문법
		// 여러 데이터를 연속된 메모리 공간에 배치하고, 순번(index)로 구분하는 자료구조
		// 이때 index는 항상 0부터 시작한다
		// 배열에 들어간 변수의 개수에 따라서 배열의 길이(length)가 정해진다
		int[] arr = { n1, n2, n3, 21, 35 };
		
		for(int i = 0; i < arr.length; i++) {
			// 배열 안에 있는 각 값은 배열이름에 index를 지정하여 접근할 수 있다
			// 배열 내부의 각 맴버는 각각 서로 다른 변수로 취급하면 된다
			int tmp = arr[i] * 2;	// 우변에서 연산도 가능하고
			arr[i] = tmp;			// 좌변에 위치시켜서 대입도 가능하다
			System.out.print(arr[i]);		// 출력도 가능하다
		}
		
	}
}
