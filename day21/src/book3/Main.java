package book3;

import java.util.Scanner;

import book2.Book;

public class Main {
	
	static Book getBookFromUserInput(Scanner sc) {
		Book book = new Book();
		String name, author, publisher;
		int price;
		
		System.out.print("책 제목 입력 : ");
		name = sc.nextLine();
		
		System.out.print("저자명 입력 : ");
		author = sc.nextLine();
		
		System.out.print("출판사 입력 : ");
		publisher = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setAuthor(author);
		book.setName(name);
		book.setPrice(price);
		book.setPublisher(publisher);
		return book;
	}
	
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		String name;
		int row = 0;
		int menu = -1;
				
		MAIN : while(true) {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				book = getBookFromUserInput(sc);
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:
				System.out.print("삭제할 책의 제목을 입력 해주세요 : ");
				name = sc.nextLine();
				row = handler.deleteBook(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0:
				sc.close();
				System.out.println("프로그램 종료");
				break MAIN;
				
			} // end of switch
		} // end of while
	} // end of main()
} // end of class Main
