package book;

import accessModifier.Human;
import student.Student;

// 사용자와 상호작용
// 입력값에 따라서 handler의 함수를 출력

public class Handler {
	
	private Book[] arr = new Book[5];
	
	public int add(String title, String author, int price) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setTitle(title);
				arr[i].setAuthor(author);
				arr[i].setPrice(price);
				row = 1;
				break;
			}
		}
		return row;
	}
	
	public void BookInfo() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println("책 제목 : " + arr[i].getTitle());
				System.out.println("저자명 : " + arr[i].getAuthor());
				System.out.printf("가격 : %,d원\n", arr[i].getPrice());
			}
		}
	}
	
	public void search(String title) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getTitle().equals(title) == true) {
				System.out.printf("첵제목 : %s\n저자명 : %s\n가격 : %d\n", arr[i].getTitle(), arr[i].getAuthor(), arr[i].getPrice());
				return;
			}
		}
		System.out.println("정확히 입력해주세요");
	}
	
	public void priceSort() {
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].getPrice() < arr[j].getPrice()) {
					Book tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		BookInfo();
	}

	
}
