package departments;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	static DepartmentsDTO scan(Scanner sc) {
		DepartmentsDTO dto = new DepartmentsDTO();
		
		System.out.print("부서 id 입력 : ");
		dto.setDEPARTMENT_ID(Integer.parseInt(sc.nextLine()));
		
		System.out.print("부서 이름 입력 : ");
		dto.setDEPARTMENT_NAME(sc.nextLine());
		
		System.out.print("매니저 id 입력 : ");
		dto.setMANAGER_ID(Integer.parseInt(sc.nextLine()));
		
		System.out.print("지역 id 입력 : ");
		dto.setLOCATION_ID(Integer.parseInt(sc.nextLine()));
		
		return dto;
	}
	
	public static void main(String[] args) {
		DepartmentsDTO dto = new DepartmentsDTO();
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		int menu = -1;
		List<DepartmentsDTO> list = null;
		int row = 0;
		
		while(menu != 0) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 부서 id로 검색");
			System.out.println("3. 추가");
			System.out.println("4. 부서 id로 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handler.selectList();
				break;
				
//			case 2:
//				handler.search();
//				break;
//				
			case 3:
				dto = scan(sc);
				row = handler.add(dto);
				break;
				
//			case 4:
//				handler.delete();
//				break;
				


			}

		}
		
	}
}
