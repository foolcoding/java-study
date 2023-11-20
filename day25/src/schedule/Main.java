package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	static public int scanMonth(Scanner sc) throws ParseException {
		int m1 = 0;
		System.out.print("시작날짜 입력 : ");
		m1 = Integer.parseInt(sc.nextLine());
		return m1;
	}
	
	static public ScheduleDTO scan(Scanner sc) throws ParseException {
		ScheduleDTO dto = new ScheduleDTO();
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("일정명 입력 : ");
		dto.setTitle(sc.nextLine());
		
		System.out.print("시작날짜 입력 : ");
		dto.setStart_date(inputFormatter.parse(sc.nextLine()));
		
		System.out.print("끝날짜 입력 : ");
		dto.setEnd_date(inputFormatter.parse(sc.nextLine()));
		
		return dto;
	}
	
	public static void main(String[] args) throws Exception {
		ScheduleDTO dto = new ScheduleDTO();
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = null;
		int menu = -1;
		List<ScheduleDTO> list = null;
		int row = 0;
		int m1 = 0;
		
		// select sysdate from dual
		// getDate("sysdate")
		Date now = handler.getSysdate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String today = sdf.format(now);
		
		while(menu != 0) {
			System.out.println("=== DB 기준 현재 날짜 ===");
			System.out.println(today);
			System.out.println("======================");
			System.out.println("1. 전체 출력");
			System.out.println("2. 월별 출력");
			System.out.println("3. 일정 등록");
			System.out.println("4. 일정 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 123:
				// 오라클 데이터베이스 버전 정보를 문자열로 출력하기
				// select banner from v$version
				String s1 = handler.selectVersion();
				System.out.println(s1);
				break;
				
			case 1 : 
				handler.selectAll();
				break;
			
			case 2 : 
				m1 = scanMonth(sc);
				list = handler.selectMonth(m1);
				for(ScheduleDTO ob : list) {
					System.out.printf("%s : %s ~ %s\n",
							ob.getTitle(), 
							ob.getStart_date(), 
							ob.getEnd_date());
				}
				break;
			
			case 3 : 
				dto = scan(sc);
				row = handler.add(dto);
				break;
			
			case 4 : 
				System.out.print("삭제할 일정 이름 : ");
				String sche = sc.nextLine();
				row = handler.delete(sche);
				break;
			case 0:
				sc.close();
			}
			
			
		}// end of while
	}// end of main
}
