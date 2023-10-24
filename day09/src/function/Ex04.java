package function;

class Function {
	// 함수 : 자주 사용하는 코드를 묶어서 필요할때 마다 호출하여 실행할 수 있도록 하는 묶음
	// 정의 : 사용할 함수를 미리 형식대로 만들어두기
	// 호출 : 만들어진 함수를 이름을 불러서 실행하기
	
	int add(int n1, int n2) {	// 함수의 정의
								// 반환자료형
								// 함수이름
								// 매개변수(인자를 저장)
		
		int answer = n1 + n2;	// 매개변수의 값을 할용한 코드
		return answer;			// 마지막에 돌려줄 값을 return answer
								// 함수의 호출자리로 돌아간다
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Function f = new Function();
		
		int n1 = 10, n2 = 7;
		int n3 = f.add(n1, n2);	// 함수의 호출
								// 함수 이름에 ()를 붙여서 호출한다
								// ()안에는 함수가 필요로 하는 값을 전달한다
								// ()안에 전달되는 값을 인자라고 한다
								// return의 값 answer을 들고옴
		
		System.out.println("n3 : " + n3);
		
		// 한번 함수를 정의해두면 필요할 때 마다 호출하여 사용할 수 있다
		
		int n4 = f.add(1024, 768);
		int n5 = f.add(1048576, -256);
		System.out.println("n4 : " + n4);
		System.out.println("n5 : " + n5);
		System.out.println("f.add(3, 5) : " + f.add(3, 5));
		
		// 반복문 내에서도 당연히 사용할 수 있다
		for(int i = 0; i < 100; i += 20) {
			int p1 = i;
			int p2 = i / 20 + 2;
			System.out.println("f.add(p1, p2) : " + f.add(p1, p2));
		}
		System.out.println();
		
	}
}
