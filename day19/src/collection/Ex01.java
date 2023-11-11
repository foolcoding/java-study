package collection;

import java.util.List;			// 인터페이스라서 직접 객체를 생성하지는 않는다
import java.util.ArrayList;		// List를 implements하는 클래스 ArrayList
import java.util.Collections;

public class Ex01 {
	public static void main(String[] args) {
		// 자바 컬렉션 프레임워크
		// 다수의 데이터를 처리하기 위한 프로그램을 만들때
		// 기본형식으로 배열을 사용할 수는 있으나
		// 정렬 및 기타 기능, 관리상의 불편함이 생길 수 있다
		// 다양한 자료구조(Data Struct)를 이용하여 관리하게 되는데
		// 자바에서 기본 제공하는 형식이 있어서 이를 활용하면 편리하게 작업할수 있다
		
		// List, Set, Map 3가지의 컬렉션을 기초로 학습하고
		// 이후 등장하는 다양한 자료형들을 연습하기
		
		// List : 선형자료구조, 일직선으로 이루어진 구조에 데이터를 저장한다
		// 순서가 있으며, 값의 중복을 허용한다
		
		// java.util.List는 인터페이스라서 객체를 생성할 수 없다
		// List를 implements하는 다른 클래스를 사용한다 (java api 문서 참조)
		
		ArrayList list = new ArrayList();
		
		// 처음 생성한 리스트는 size() 메서드를 이용하여 크기를 확인해보면 0이다
		System.out.println("list.size() : " + list.size());
		
		// 리시트에 값을 추가하려면 add함수를 이용한다
		// list.add(0) 함수는 리스트의 가장 마지막에 요소를 추가한다
		list.add(10);
		list.add(20);
		
		// 리스트 및 컬렉션은 대부분 toString()이 오버라이팅되어있어서 바로 출력해도 내용을 확인할 수 있다
		System.out.println("list : " + list);
		System.out.println("list.size() : " + list.size());
		
		// list.add(int index, E e) 함수는 지정한 인덱스에 값을 추가한다
		list.add(1, 30);
		System.out.println("list : " + list);
		System.out.println("list.size() : " + list.size());
		
		// 특정 인덱스의 값을 제거하거나, 값을 지정하여 제거할 수 있다
		list.remove(0);
		System.out.println("list : " + list);
		System.out.println("list.size() : " + list.size());
		
//		list.remove(30);					// 정수를 그냥 전달하면 인덱스로 간주한다
		list.remove(Integer.valueOf(30));	// Integer 타입 객체를 전달하면 일치하는 값을 찾아서 제거
		System.out.println("list : " + list);
		System.out.println("list.size() : " + list.size());
		
		// 리스트에서 특정 인덱스에 있는 값을 제거하지 않고, 참조하기 위해서는 get(index)를 사용한다
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list.get(2) : " + list.get(2));
		
		// list.add 함수는 값을 추가하는데 사용하지만
		// list.set(int index, E e) 함수는 지정한 위치의 값을 바꿀때 사용한다
		list.set(0, 60);
		System.out.println(list);
		
		// 정렬함수가 내장되어 있거나, 다른 클래스를 이용하여 손쉽게 정렬할 수 있다
		list.sort(null);	// null 자리에는 정렬 기준을 나타내기위한 객체를 전달할 수 있다
		System.out.println(list);
		
		list.add(15);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		// 리스트의 모든 값을 한번에 비울 수도 있다
		list.clear();
		System.out.println("list : " + list);
		
		// 어떤 리스트가 주어질때, 비어있는지 확인하기 위한 메서드도 있다
		System.out.println("list가 비어있는가 : " + list.isEmpty());
		
		// list는 특별히 자료형을 지정하지 않으면, 내부에 Object를 저장하기 때문에
		// 모든 유형의 객체를 저장할 수 있다
		list.add(10);
		list.add(20);
		list.add("ITBANK");
		list.add(3.14);
		System.out.println(list);
		
		// 리스트 내부에 특정값이 포함되어 있는지 판별하는 함수도 있다
		System.out.println("list.contains(\"itbank\") : " + list.contains("itbank"));
		System.out.println("list.contains(\"ITBANK\") : " + list.contains("ITBANK"));
	}
}
