package hrtest;

import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		JdbcTemplate template = new JdbcTemplate();
		
		String sql = "select tname from tab";	// 테이블 이름들을 불러온다
		
		RowMapper<String> mapper = (rs) -> {	// 단일 객체(단일 레코드, 줄)에 대한 맵핑규칙이다
				return rs.getString("tname");	// 보통 mapper에서는 while을 사용하지 않는다
		};										// while에서 작성하는 내용을 넣어주면 된다
		
		List<String> tablenameList = template.queryForList(sql, mapper);
		
		tablenameList.forEach(System.out::println);
		
				
	}
}
