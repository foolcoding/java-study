package hrtest;

public class Ex01 {
	public static void main(String[] args) {
		// select banner from v$version
		// 단일 문자열을 불러와서 출력하기
		
		JdbcTemplate template = new JdbcTemplate();
		
		// param1 실행할 sql을 준비한다
		String sql = "select banner from v$version";
		
		// 단일 데이터를 불러오는 queryForObject 함수를 사용한다
		// sql과 RowMapper객체를 전달하면 된다
		// RowMapper객체는 결과를 rs에 불러왔을 때 어떤 형식으로 맵필할지 결정해서
		// 추상메서드를 오버라이팅으로 구현하는 형태로 만들어주면 된다	
		// param2 : rs에 담긴 결과를 어떻게 맵핑하여 반환하는가? (규칙을 담고 있는 함수(를 포함하는 람다객체))
//		RowMapper<String> mapper = (rs) -> {
//			return rs.getString("banner");
//		};
		RowMapper<String> mapper = rs -> rs.getString("banner");
		
		String result = template.queryForObject(sql, mapper);
		
		System.out.println(result);
		
	}
}
