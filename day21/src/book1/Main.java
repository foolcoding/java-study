package book1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Book[] arr = new Book[10];
		int menu;
		Scanner sc = new Scanner(System.in);
		
		MAIN : while(true) {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택>>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.printf("%s (%s, %s) %,d원\n", arr[i].name, arr[i].author, arr[i].publisher,
						arr[i].price);
					}
				}
				break;
				
			case 2:
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						arr[i] = new Book();
						System.out.print("책 제목 입력 : ");
						arr[i].name = sc.nextLine();	
						System.out.print("저자명 입력 : ");
						arr[i].author = sc.nextLine();	
						System.out.print("출판사명 입력 : ");
						arr[i].publisher = sc.nextLine();	
						System.out.print("가격 입력 : ");
						arr[i].price = Integer.parseInt(sc.nextLine());
						break;	// break for "for"
					}
				}
				break;
				
			case 0:
				sc.close();
				System.out.println("프로그램 종료");
				break MAIN;
				
			} // end of switch
		} // end of while
	} // end of main()
} // end of class Main
