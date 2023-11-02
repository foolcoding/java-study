package reference;

import java.util.Arrays;

class Member{
	private String name;
	private int age;
	public int getAge;
	
	// 필드를 사용하는 생성자 (저장 -> 우클릭 -> s, o -> 엔터
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// public getter/setter (저장 -> 우클릭 -> s, r -> alt + a, alt + r)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.neme = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.printf("%s : %d\n", name, age);
	}
	
	
}	// end of class Member

public class Quiz1 {
	public static void main(String[] args) {
		Member[] arr = new Member[] {
			new Member("원빈", 45),
			new Member("현빈", 41),
			new Member("우빈", 34),
			new Member("준빈", 31),
			new Member("다빈", 29),
		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}System.out.println();
		
		// 이름을 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하라
		// 비교는 객체의 이름를 기준으로 하고, 자리변경은 객체를 교환한다
		sortMemberArrayByName(arr);

		// 나이를 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하라
		// 비교는 객체의 나이를 기준으로 하고, 자리변경은 객체를 교환한다
		sortMemberArrayByAge(arr);
		
		// 객체의 객체는 직접전인 비교가 힘들기 때문에
		// 특정 필드값을 기준으로 정렬해야 한다
		// primitive 타입이거나, compareTo 함수가 있는 자료형으로 기준을 선정한다(String)
		
	}	// end of main()
	
	static void sortMemberArrayByName(Member[] arr) {
		System.out.println("이름 기준 오름차순");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].getName().compareTo(arr[j].getName()) > 0) {
				Member tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				}
			}
			arr[i].show();
		}
		System.out.println();
	}
	
	static void sortMemberArrayByAge(Member[] arr) {
		System.out.println("나이 기준 오름차순");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].getAge() > arr[j].getAge()) {
				Member tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				}
			}
			arr[i].show();
		}
		System.out.println();
		
	}
	
	
	
	
}
