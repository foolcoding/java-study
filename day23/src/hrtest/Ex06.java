package hrtest;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		String sql = "update countries set country_name = ? where country_id = ?";
		
		JdbcTemplate template= new JdbcTemplate();
			
		Scanner sc = new Scanner(System.in);
		
		String id, name;
		
		System.out.print("이름을 변경할 국가의 코드 입력 : ");
		id = sc.nextLine();
		
		System.out.print("변경할 새로운 이름 : ");
		name = sc.nextLine();
		
		int row = template.update(sql, name, id);
		
		System.out.println(row + "행이 수정되었습니다");
		
		sc.close();
	}
}
