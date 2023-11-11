package collection;

import java.util.Arrays;
import java.util.List;

class Book implements Comparable<Book> {
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s : %,d원\n", name, price);
	}
	@Override
	public int compareTo(Book other) {
		return this.price - other.price;
	}
}

public class Quiz1 {
	static void showList(List<Book> list) {
		for(Book b : list) {	// list안에 있는 b를 이용해서 반복문 실행 (향상된 for문)
			System.out.print(b);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Book[] arr = {
			new Book("전자책 푸바오 시점", 19800),
			new Book("더 마인드", 17820),
			new Book("트렌드 코리아 2024", 17100),
			new Book("김대리의 데일리 뜨개", 18900),
			new Book("퓨처 셀프", 17820),
		};
		
		List<Book> list = Arrays.asList(arr);
		showList(list);
		
		list.sort((o1, o2) -> o1.name.compareTo(o2.name));
		showList(list);
		
		list.sort((o1, o2) -> o2.price - o1.price);
		showList(list);
		
		// Book 클래스는 기본비교함수가 내장되어 있지 않기 때문
		// 기본비교함수를 넣어주려면 인터페이스 Comparable를 구현하면 된다
		// Comparable : 클래스에서 implements 해서 사용하는 인터페이스
		// class Book implements Comparable { 비교 가능한 도서 (compareTo를 오버라이딩 한다) }
		
		// Comparator : 람다식으로 객체를 생성하여 전달할 때 사용한다
		// 비교함수가 없거나, 자신만의 기준으로 비교하고 싶을때 만들어서 전달한다
		list.sort(null);
		showList(list);
	}
}
