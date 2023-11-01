package book;

import accessModifier.Human;

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
	
}
