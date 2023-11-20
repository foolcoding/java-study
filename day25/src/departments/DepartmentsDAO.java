package departments;

import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class DepartmentsDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "hr";
	private String password = "hr";

	public Connection getConncetion() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	private void close() {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();			
		} catch(Exception E){};
	}
	
	public ArrayList<DepartmentsDTO> selectList() {
		ArrayList<DepartmentsDTO> list = new ArrayList<>();
		String sql = "select * from departments";	
		
		try {
			conn = getConncetion();	
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDEPARTMENT_ID(rs.getInt("department_id"));
				dto.setDEPARTMENT_NAME(rs.getString("department_name"));
				dto.setMANAGER_ID(rs.getInt("manager_id"));
				dto.setLOCATION_ID(rs.getInt("location_id"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return list;
	}

	public int add(DepartmentsDTO dto) {
		int row = 0;
		String sql = "insert into departments values (?, ?, ?, ?)";
		
		conn = getConncetion();
		try {
			pstmt = conn.prepareStatement(sql);		
			pstmt.setInt(1, dto.getDEPARTMENT_ID());		
			pstmt.setString(2, dto.getDEPARTMENT_NAME());	
			pstmt.setInt(3, dto.getMANAGER_ID());
			pstmt.setInt(4, dto.getLOCATION_ID());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		
		return row;
	}

}
