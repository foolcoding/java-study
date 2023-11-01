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
		
		while(true) {
			System.out.println("입력 : 1");
			System.out.println("출력 : 2");
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
