package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// Set : 순서가 없고, 중복을 허용하지 않는 자료구조
		// 주로 값의 중복을 제거하기 위해 사용한다
		// 변수이름을 변도로 가져오기 위해 사용하기도 한다
		
		// List와 마찬가지로 Set도 인터페이스이다
		// Set을 구현한 HashSet클래스를 사용한다
		
		HashSet<String> set = new HashSet<>();
		System.out.println("set.size() : " + set.size());
		
		set.add("apple");	// 동일한 내용을 두번 추가했으나 중복을 허용하지 않아서 추가되지 않는다
		set.add("banana");
		set.add("apple");
		
		System.out.println("set.size() : " + set.size());
		
		System.out.println("set : " + set);
		
		// index가 없기 때문에 get() 함수를 호출할 수 없다
		
//		System.out.println(set.get(0));
		
		// 향상된 for문, index가 없어도 컬렉션 및 순환가능한 자료형 내부 요소를 하나로 조회하는 구문
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		// 순환자 Iterator를 이용한 반복 (특정 클래스에서 사용해야 한다)
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {	// 순환자에서 이하 사용하지 않은 값이 남아 있다면
			String s = it.next();	// 그 값을 꺼내서 변수에 담은다음
			System.out.println(s);	// s를 출력한다
		}
		System.out.println();
		
		// 이미 만들어진 컬렉션을 다른 컬렉션의 생성자에 전달하면 요소를 유지하면서 새로운 컬렉션을 생성한다
		// Set안에 있는 문자열을 그대로 새로운 List 생성에 사용하기
		ArrayList<String> list = new ArrayList<>(set);
		System.out.println("list : " + list);
		list.sort(null);
		System.out.println("list : " + list);
	}
}
