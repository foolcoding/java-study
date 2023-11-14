package book;

import java.util.Scanner;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		int menu;
		String title;
		String author;
		int price;
		int row;
						
		while(true) {	// 원하는 책 검색해서 가격 합산, 정렬기능 sort로 람다 이용해서 바꾸기
			System.out.println("추가 : 1");
			System.out.println("목록 : 2");
			System.out.println("검색 : 3");
			System.out.println("가격 내림차순 : 4");
			System.out.println("삭제 : 5");
			System.out.println("가격 수정 : 6");			
			System.out.println("가격 합산 : 7");			
			System.out.println("종료 : 0");
			System.out.print(">>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu){
			case 1:
				System.out.print("책 제목 입력 : ");
				title = sc.nextLine();
				
				System.out.print("저자명 입력 : ");
				author = sc.nextLine();
				
				System.out.print("가격 입력 : ");
				price = Integer.parseInt(sc.nextLine());
				
				row = handler.add(title, author, price);
				System.out.println(row == 0 ? "추가 실패" : "추가 성공");
				break;
				
			case 2:
				handler.BookInfo();
				break;
				
			case 3:
				System.out.print("제목을 입력 해주세요 : ");
				title = sc.nextLine();
				handler.search(title);
				break;
				
			case 4:
				handler.priceSort();
				break;
				
			case 5:
				System.out.print("삭제할 책의 제목을 입력 해주세요 : ");
				title = sc.nextLine();
				handler.deleteBook(title);
				break;
				
			case 6:
				System.out.print("가격 수정할 책의 제목을 입력해주세요 : ");
				title = sc.nextLine();
				handler.priceChange(title, sc);
				break;
				
			case 7:	
				handler.sumBook(sc);
				int sum = handler.priceSum();
				System.out.println("총 금액 : " + sum);
				break;
				
			case 0:
				sc.close();
				System.out.println("시스템을 종료합니다");
				return;
				
			default:
				System.out.println("잘못 선택하셨습니다");
			} // end of switch
			System.out.println();
		} // end of while
	}// end of Class
}// end of main
