package variable;

public class Ex07 {
	public static void main(String[] args) {
		// Wrapper Class
		// 자바에서 어떤 두 값을 상호작용 시키기 위해서 반드시 객체형태로 처리해야 할 경우가 있다
		// primitive type은 객ㅊ페가 아니므로, 위 상황에서 처리할 수 없다
		// 따라서, primitive type의 데이터를 객체형태로 만들기 위한 포장 전문 클래스가 존재
		// 이를 Wrapper Class 라고 한다
		// Wrapper Class는 객체에 대한 자료형이므로, 데이터 저장 및 기능이 포함되어 있다
		
		//		primitive type 			Wrapper Class
		//		boolean					Boolean
		//		byte					Byte
		//		short					Short
		//		char					Character
		//		int						Inteaer
		//		long					Long
		//		float					Float
		//		double					Double
		
		// 같은 유형의 primitive type <-> Wrapper Class는 암묵적 형변환이 적용된다
		int n1 = 10;
		Integer n2 = n1;
		n1 = n2;
		
		// primitive 사이에서 암묵적 형변환이 적용되는 관계에도 Wrapper Class끼리는 적영되지 않는다
		byte by = 10;
		int n3 = 20;
		n3 = by;
		
		Byte by2 = 10;
		Integer n4 = 20;
//		n4 = by2;		// Wrapper Class끼리는 호환성이 없다
		n4 = (int)(byte)by2;
		// Byte -> byte -> int -> Integer
		System.out.println("n4 : " + n4);
		
		n4 = by2.intValue();
		// by2에 담긴 값을 int형태로 바꿔서 대입할 수 있도록 해주는 기능(함수)
		System.out.println("n4 : " + n4);
		
		System.out.println("int 자료형의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 자료형의 최대값 : " + Integer.MAX_VALUE);
		
		System.out.println("문자열 1234를 정수 형태로 바꾸기 : " + Integer.parseInt("1234"));
		String s = "1234";
		System.out.println(s + 10);
		int n = Integer.parseInt(s);
		System.out.println(n + 10);
	}
}
