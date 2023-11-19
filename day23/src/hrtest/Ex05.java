package hrtest;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String country_id = null;
		System.out.print("삭제할 국가 코드를 두글자로 입력하세요 : ");
		country_id = sc.next();	// 그냥 엔터치면 안됩니다
		
		JdbcTemplate template = new JdbcTemplate();
			
		String sql = "delete from countries where country_id = ?";
		
		int row = template.update(sql, country_id);
		
		System.out.printf("%d 행이 삭제되었습니다\n", row);
		
		sc.close();
	}
}
