package control;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 특정 변ㄴ수의 값에 따라 서로 다른 코드를 실행한다
		
		int num = 1;
		
		// if의 조건이 모두 특정 변수와 연관되어 있고, 값의 행위가 아닌 특정값의 일치여부이다
		if(num == 1)			System.out.println("one");
		else if(num == 2)		System.out.println("two");
		else if(num == 3)		System.out.println("three");
		else					System.out.println("other");
		System.out.println();
		
		//switch ~ case
		switch(num);{
			case 1: System.out.println("ONE");		break;
			case 2: System.out.println("TWO");		break;
			case 3: System.out.println("THREE");	break;
			defauly:System.out.println("OTHER");
		}
		// 제한적인 상황에서 if 대신 사용할 수 있다
 		// if처럼 범위가 없고 시작 위치만 있어서 case하나마다 break; 해줘야함
		// 맨 밑에는 중괄호로 막혀있으니 안해도 상과없음
		
		
		
		
		
		
	}
}
