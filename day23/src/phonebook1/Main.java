package phonebook1;

import java.util.Scanner;

public class Main {
	
	static PhoneBookDTO scan(Scanner sc) {
		PhoneBookDTO phonebook = new PhoneBookDTO();
		String name, pnum, favorite;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("번호 입력 : ");
		pnum = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("즐겨찾기여부 입력 (Y/N) : ");
		favorite = sc.nextLine();
		
		phonebook.setName(name);
		phonebook.setPnum(pnum);
		phonebook.setAge(age);
		phonebook.setFavorite(favorite);
		
		return phonebook;
	}
	
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		PhoneBookDTO phonebook = null;
		int menu = -1;
		int row = 0;
		String name, pnum;
		
		while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1:
					handler.showList();
					break;
					
				case 2:				
					phonebook = scan(sc);
					row = handler.add(phonebook);
					System.out.println(row != 0 ? "추가 성공" : "추가 실패" );
					break;
					
				case 3:				
					System.out.print("번호 바꿀 사람의 이름을 입력하세요 : ");
					name = sc.nextLine();	
					System.out.print("바꿀 번호를 입력하세요 : ");
					pnum = sc.nextLine();
					row = handler.pnumModify(name, pnum);
					System.out.println(row != 0 ? "수정 성공" : "수정 실패" );
					break;
					
				case 4:
					System.out.print("즐겨찾기를 바꿀 이름을 입력하세요 : ");
					name = sc.nextLine();
					row = handler.favoriteModify(name);
					System.out.println(row != 0 ? "수정 성공" : "수정 실패" );
					break;
					
				case 5:
					System.out.print("삭제할 사람의 이름을 입력하세요 : ");
					name = sc.nextLine();
					row = handler.delete(name);
					System.out.println(row != 0 ? "삭제 성공" : "삭제 실패" );
					break;
			}
			
		} // end of while
		
		sc.close();
		System.out.println("프로그램을 종료합니다");
	}
}
