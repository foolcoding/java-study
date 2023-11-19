package phonebook1;

import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class DAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "hr";
	private String password = "hr";
	
	public DAO() {
		try {
		Class.forName(OracleDriver.class.getName());
		conn = DriverManager.getConnection(url, username, password);
		} catch(SQLException e) {
			System.out.println("DB 접속에 예외가 있습니다");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 불러올 수 없습니다 : " + e);
			e.printStackTrace();
		}
	}
	
	public ArrayList<PhoneBookDTO> showlist(){
		ArrayList<PhoneBookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by idx";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PhoneBookDTO dto = new PhoneBookDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPnum(rs.getString("pnum"));
				dto.setAge(rs.getInt("age"));
				dto.setFavorite(rs.getString("favorite"));
				list.add(dto);
			}
		} catch(SQLException e) {
			System.out.println("SQL문이 잘못되었습니다");
			e.printStackTrace();
		} finally{
			try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			} catch(SQLException e) {}
		}		
		return list;
	}
	
	public int insert(PhoneBookDTO ob) {
		int row = -1;
		String sql = "insert into phonebook (name, pnum, age, favorite) values (?, ?, ?, ?)";
		try {pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setString(2, ob.getPnum());
			pstmt.setInt(3, ob.getAge());
			pstmt.setString(4, ob.getFavorite());
			row = pstmt.executeUpdate();
		
		}catch(SQLException e) {
			System.out.println("SQL문이 잘못되었습니다");
			e.printStackTrace();
		} finally{
			try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			} catch(SQLException e) {}
		}	
		
		return row;
	}
	
	public int pnumModify(String name, String pnum) {
		int row = 0;
		
		String sql = "update phonebook set pnum = ? where name = ?";
		
		try {pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pnum);
			pstmt.setString(2, name);
			row = pstmt.executeUpdate();
	
		}catch(SQLException e) {
			System.out.println("SQL문이 잘못되었습니다");
			e.printStackTrace();
		} finally{
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {}
		}	
		
		return row;
	}
	
	public int favoriteModify(String name) {
		int row = 0;
		
		String sql = "update phonebook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where name = ?";
		
		try {pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			row = pstmt.executeUpdate();
	
		}catch(SQLException e) {
			System.out.println("SQL문이 잘못되었습니다");
			e.printStackTrace();
		} finally{
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {}
		}	
		
		return row;
	}
	
	public int delete(int idx) {
int row = 0;
		
		String sql = "delete from phonebook where idx = ?";
		
		try {pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();
	
		}catch(SQLException e) {
			System.out.println("SQL문이 잘못되었습니다");
			e.printStackTrace();
		} finally{
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {}
		}	
		
		return row;
	}
	

	
}
