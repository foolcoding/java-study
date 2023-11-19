package phonebook1;

import java.util.Scanner;

public class Main {
	
	static PhoneBookDTO scan(Scanner sc) {
		PhoneBookDTO phonebook = new PhoneBookDTO();
		String name, pnum, favorite, pnum1, pnum2, pnum3;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.println("번호 입력 ***-****-****");
		System.out.print("번호 >>> ");
		pnum1 = sc.nextLine();
		pnum = String.format("%s-%s-%s", pnum1.substring(0, 3), pnum1.substring(3, 7), pnum1.substring(7));
		
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
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		Handler handler = new Handler();
		PhoneBookDTO phonebook = new PhoneBookDTO();
		int idx = -1;
		int row = 0;
		String pnum = null;
		String name = null;
		
		while(menu != 0) {
			System.out.println("메뉴 선택");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 인덱스로 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1:
					handler.showList();
					break;
					
				case 2:
					phonebook = scan(sc);
					row = handler.insert(phonebook);
					System.out.println(row != 0 ? "추가 성공" : "추가 실패");
					break;
					
				case 3:
					System.out.print("이름 입력 : ");
					name = sc.nextLine();
					System.out.print("수정할 전화번호 입력 : ");
					pnum = sc.nextLine();
					row = handler.pnumModify(name, pnum);
					System.out.println(row != 0 ? "번경 성공" : "변경 실패");			
					break;
					
				case 4:
					System.out.print("즐겨찾기 수정할 이름 입력 : ");
					name = sc.nextLine();
					row = handler.favoriteModify(name);
					System.out.println(row != 0 ? "번경 성공" : "변경 실패");	
					break;
					
				case 5:
					System.out.print("삭제할 컬럼의 인덱스 입력 : ");
					idx = Integer.parseInt(sc.nextLine());
					row = handler.delete(idx);
					System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
					break;
				
			}// end of switch
		}// end of while
		sc.close();
		System.out.println("프로그램을 종료합니다");
	}
}
