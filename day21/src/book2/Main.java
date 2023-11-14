package book2;

import java.util.Scanner;

public class Main {
	static void showList(Book[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s (%s, %s) %,d원\n", 
						arr[i].getName(), 
						arr[i].getAuthor(), 
						arr[i].getPublisher(),
						arr[i].getPrice());
			}
		}		
	}
	
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
	
	static int deleteBook(String name, Book[] arr) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				
				row = 1;
				break;
			}			
		}
		return row;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] arr = new Book[10];
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
				showList(arr);
				break;
				
			case 2:
				book = getBookFromUserInput(sc);
				
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						arr[i] = book;
						break;
					}
				}
				break;
				
			case 3:
				System.out.print("삭제할 책의 제목을 입력 해주세요 : ");
				name = sc.nextLine();
				
				row = deleteBook(name, arr);
				System.out.println(row != 0 ? "삭제 성공" : "");
				break;
				
			case 0:
				sc.close();
				System.out.println("프로그램 종료");
				break MAIN;
				
			} // end of switch
		} // end of while
	} // end of main()
} // end of class Main
