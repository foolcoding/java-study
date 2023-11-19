package phonebook1;


import java.util.ArrayList;


public class DAO {
	JdbcTemplate template = new JdbcTemplate();
	
	public ArrayList<PhoneBookDTO> showlist() {
		String sql = "select * from phonebook order by favorite desc, name";
		
		RowMapper<PhoneBookDTO> mapper = rs -> {
			PhoneBookDTO dto = new PhoneBookDTO();
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));						
			return dto;
		};
		
		return template.queryForList(sql, mapper);
	}
	
	public int add(PhoneBookDTO dto) {
		JdbcTemplate template = new JdbcTemplate();		
		String sql = "insert into phonebook values (?, ?, ?, ?)";		
		int row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());		
		return row;
	}
	
	public int pnumModify(String name, String pnum) {
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ?";
		row = template.update(sql, pnum, name);
		return row;
	}
	
	public int favoriteModify(String name) {
		int row = 0;
		String sql = "update phonebook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where name = ?";			
		row = template.update(sql, name);
		return row;
	}
	
	public int delete(String name) {
		int row = 0;
		String sql = "delete phonebook where name = ?";			
		row = template.update(sql, name);
		return row;
	}
	
	
}
