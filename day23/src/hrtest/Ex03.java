package hrtest;

import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		JdbcTemplate template = new JdbcTemplate();
			
		String sql = "select * from countries";
		
		RowMapper<CountryDTO> mapper = (rs) -> {
			CountryDTO dto = new CountryDTO();
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
			return dto;
		};
		
		List<CountryDTO> list = template.queryForList(sql, mapper);
		
		for(CountryDTO ob : list) {
			System.out.printf("%s %s \t %d\n", 
					ob.getCountry_id(), 
					ob.getCountry_name(), 	
					ob.getRegion_id());
		}
		System.out.println("끝");
		
	}
}
