package namingconvension;

public class Ex01 {
	public static void main(String[] args) {
		// 이름 짓는 규칙
		
		// 프로젝트 : 프로그램의 단위, 내부에 여러 소스코드 및 패키지가 있을 수 있다
		// 패키지 : 관련있는 자바 소스를 묶어서 관리하기 위한 폴더
		// 클래스 : 자바 소스코드의 기본 단위, 클래스의 이름은 첫글자를 대문자로 작성한다
		// 함수 : 특정 작업 내용을 코드의 묶음으로 만들어둔 형식, 실행하기 위해 이름을 지정해야 한다
		// 변수 : 데이터를 저장하기 위한 메모리 공간, 실행될 때 만들어진다
		
		// 위에 나타난 요소들은 이름을 지정할때 가급적 중복되지 않게 작성한다
		// 요소의 첫글자는 숫자를 사용하거나, 특수문자를 사용하지 않는다
		// 예외적으로 _로 시작하는 형태는 허용한다
		
		// 자바소스 코드 (클래스) 는 파일의 이름과, public class의 이름이 일치해야 한다
		// 파일 이름ㅇ이 Hello.java이면, public class Hello (..) 와 같이 되어야 한다
		
		// 자바에서 이미 등록되어 있는 예약어는 변수 및 함수이름으로 사용할 수 있다
		
		// 변수 및 함수, 클래스 이름을 지정할 때 여러 단어를 합성하여 나타낼 경우
		// 각 단어의 첫글자는 대문자로 처리한다
		// pubilc class ProductHandler ( ... )
		// Integer.parseInt()
		// String.firstName, LastName
		// 예외적으로ㅡ static + final 속성을 가지는 필드는 모두 대문자로 작성하며 단어간 구분을 _로 한다
		// static final : 자료형에 각인되어 있는, 변하지 않는 고정값
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println("Hello");
		
		
		
	}
}
