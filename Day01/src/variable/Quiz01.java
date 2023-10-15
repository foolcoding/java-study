package variable;

public class Quiz01 {
	public static void main(String[] args) {
		
		double height = 172.8;
		double weight = 67.4;
		
		// 위 두 변수에 저장된 값을 활용하여 키와 체중을 소수점 아래자리 없이
		// 정수 형태로 출력하세요
		// (자료형 변환을 활용하여 새로운 변수에 저장하고 값을 출력하세요)
		
		// 실수 값을 정수형 변수에 옮겨담으면 소수점 날라감(의도된 데이터 손실)
		
		int a = (int)height;
		int b = (int)weight;
		
		System.out.println("height : " + a);
		System.out.println("weight : " + b);
	}
}
