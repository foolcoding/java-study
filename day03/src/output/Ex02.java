package output;

public class Ex02 {
	public static void main(String[] args) {
		//System.out.printf()
		// 서식을 미리 준비하여, 서식에 맞게 값들을 출력하는 함수
		
		String name = "이지은";
		int age = 31;
		
		System.out.println("이름 : " + name + ", 나이 : " + age + "살");
		
		System.out.printf("이름 : %s, 나이 : %d살\n", name, age);
		// 맨 앞에 문자열로 서식을 지정하고, 빈칸에 들어갈 값을 순서대로 나열한다
		// 서식은 문자열이기 때문에, 별도의 변수에 저장해두었다가 활용할 수도 있다
		
		String form = "이름 : %s, 나이 : %d살\n";
		
		System.out.printf(form, name, age);
		System.out.printf(form, "홍진호", 42);
		System.out.printf(form, "나단비", 5);
		System.out.printf("이름 : %s, 나이 : %s살\n", name, age);
		
		
		// 서식(form, printf) 제어 문자
/*
		 서식 제어 문자		뜻				자료형
		 %s				string			문자열 (혹은 모든 자바의 객체 및 값)
		 %d				decimal			정수를 10진수 형태로 출력할 때 사용
		 %c				character		정수를 아스키코드 혹은 유니코드에 맞춰 글자로 출력
		 %f				floating number	부동소수점 상수를 출력
		 
		 %o				octal			정수를 8진수 형태로 출력
		 %x				hexa=decimal	정수를 16진수 형태로 출력
*/
		int num = 128;
		System.out.printf("num(10) : %d\n", num);
		System.out.printf("num(08) : %o\n", num);
		System.out.printf("num(16) : %x\n", num);
		
		// 정수(10진수)의 서식
		System.out.printf("num : [%d]\n", num);		// 그냥 출력
		System.out.printf("num : [%5d]\n", num);		// 5자리 빈칸 확보 후 출력
		System.out.printf("num : [%05d]\n", num);		// 5자리에서 부족하면 앞으로 0으로 채움
		System.out.printf("num : [,%d]\n", 1234000);		// 천단위 구분기호 콤마 적용
		System.out.println();
		
		// 실수의 서식(C언어와 달리 double도 %lf를 사용하지 않고, %f만 사용한다)
		double db = 3.14;
		
		System.out.printf("%f\n", db);	// 기본은 소수점 이하 6자리까지 출력
		System.out.printf("%.1f\n", db);	// 수점 이하 1자리까지 출력
		System.out.printf("%.3f\n", db);	// 소수점 이하 3자리까지 출력
		System.out.printf("%.3f\n", 3.14f);	// 소수점 이하 3자리까지 출력
		System.out.printf("%5.2f\n", db);	// 소수점 포함 전체 자릿수는 5자리
											// 이후 소수점을 2자리까지 출력
		System.out.printf("%.0f\n", db);	// 소수점 안볼랭
		System.out.println();
		
		// 문자열의 서식
		String hello = "Hello";
		System.out.printf("[%s]\n", hello);
		System.out.printf("[%10s]\n", hello);
		System.out.printf("[%-10s]\n", hello);
		System.out.printf("[%2s]\n", hello);	// 자릿슈를 적게 할당해도 다 출력함
		System.out.println();
		
		System.out.printf("[%10s]\n", "Sam");
		System.out.printf("[%10s]\n", "John");
		System.out.printf("[%10s]\n", "Chris");
		System.out.printf("[%10s]\n", "Robert");
		
		System.out.printf("[%-10s]\n", "짱구");
		System.out.printf("[%-10s]\n", "아이유");
		System.out.printf("[%-10s]\n", "카더가든");
		System.out.printf("[%-10s]\n", "아이티뱅크");
		
		// 이스케이프 시퀀스로 해결하면 된다 (tab, 시작지점으로 부터 4칸 혹은 8칸)
		
		
		
		
		
	}
}
