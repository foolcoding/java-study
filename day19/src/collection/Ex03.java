package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		// 리스트의 정렬
		// 리스트를 정렬하기 위해서는 내부의 각 요소를 비교하기 위한 기준을 전달해야한다
		
		// 참고) 컬렉션의 제네틱 타입에는 primitive type는 지정할 수 없다
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(25);
		list1.add(55);
		list1.add(72);
		list1.add(15);
		list1.add(49);
		System.out.println("list1 : " + list1);
		
		// 오름차순(정렬에서 순서를 지정하지 않았을때의 기본값)
		list1.sort(null);
		System.out.println("list1 : " + list1);
		
		// 내림차순 정렬하기
		// 1) 인터페이스는 추상클래스의 일종이므로, 익명클래스 방식의 객체 생성이 가능하다
		Comparator<Integer> comp1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 - o2
				return o2 - o1;
			}
		};
		list1.sort(comp1);
		System.out.println("list1 : " + list1);
		
		// 2) Comparator는 함수형 인터페이스 이므로 람다식 객체 생성이 가능하다
		Comparator<Integer> comp2 = (o1, o2) -> {
			return o1 - o2; // 오름차순 정렬
		};
		list1.sort(comp2);
		System.out.println("list1 : " + list1);
		
		// 3) 람다식에서 body가 한줄이면 {} 생략 return이면 return도 생략
		list1.sort((n1, n2) -> n2 - n1);
		System.out.println("list1 : " + list1);
	}
}
