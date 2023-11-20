package schedule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ScheduleDAO {
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection getConnention() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println("연결 문제 발생 : " + e);
		}
		return conn;
	}

	private void close() {
		try {
			if(rs != null) 		rs.close();
			if(pstmt != null) 	pstmt.close();
			if(conn != null) 	conn.close();
		} catch(Exception E) {}
	}
	
	public ArrayList<ScheduleDTO> selectAll() {
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		String sql = "select * from scheduler order by start_date";
		
		try {
		conn = getConnention();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
			while(rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }

		return list;
	}
	
	public String selectVersion() {
		String s1 = null;
		String sql = "select banner from v$version";
		try {
			conn = getConnention();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				s1 = rs.getString("banner");
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return s1;
	}

	public Date getSysdate() {
		Date now = null;
		String sql = "select sysdate from dual";
		try {
			conn = getConnention();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				now = rs.getDate("sysdate");
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		
		return now;
	}

	public List<ScheduleDTO> selectMonth(int m1) {
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		String sql = "select * from scheduler where extract(month from start_date) = ? order by start_date";
		
		try {
		conn = getConnention();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, m1);
		rs = pstmt.executeQuery();
			while(rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }

		return list;
	}

	public int add(ScheduleDTO dto) {
		int row = 0;
		String sql = "insert into scheduler values (?, ?, ?)";
		try {
		conn = getConnention();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getTitle());
		pstmt.setDate(2, new java.sql.Date(dto.getStart_date().getTime()));
		pstmt.setDate(3, new java.sql.Date(dto.getEnd_date().getTime()));
		row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		return row;
	}


	public int delete(String sche) {
		int row = 0;
		String sql = "delete scheduler where title = ?";
		try {
		conn = getConnention();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sche);
		row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		return row;
	}
}
