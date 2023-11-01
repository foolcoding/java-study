package accessModifier;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Human[] arr = new Human[5];
		Scanner sc = new Scanner(System.in);
		
		// 5번 입력받아서 객체 생성하고 배열에 넣기
		for(int i = 0; i < arr.length; i++) {
			// arr[i]는 처음에는 빈간(null)이기 때문에 객체를 먼저 만들어야 한다
			if(i % 2 == 0) {	// 짝수번째에만 입력을 받기
			arr[i] = new Human();
			
			// 이름과 나이를 변수에 입력하고, 입력받은 값을 setter를 활용하여 객체에 넣는다
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			arr[i].setName(name);
			arr[i].setAge(age);
			}
		}
		System.out.println("=== 입력 완료 ===");
		System.out.println("=== 출력 시작 ===");
		
		// 배열의 내용을 출력하기
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {	// i번째 값이 빈칸이아니면
									// arr에는 Human타입의 데이터만 들어갈 수 있으므로
									// 빈칸이 아니면 Human타입의 객체가 있다는 이야기이다
			System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
			}
		}
		System.out.println("=== 출력 완료 ===");
		
		sc.close();
	}
}
