package book6;

import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;
// 오라클 드라이버는 라이브러리 파일을 가져와야 한다

public class BookDAO {
	
	private Connection conn;	// 접속 1단계, 네트워크 및 포트 접속을 확인한다
//	private Statement stmt;		// 접속 2단계, 접속된 DB프로그램이 작업을 수행할 수 있는 상태인지 확인
	private PreparedStatement pstmt;		// Statement의 서브클래스(상속) pstmt
	private ResultSet rs;		// 만약 수행하는 쿼리가 select이면 결과를 받아서 저장한다
								// insert, update, delete는 결과를 int 형태로 반환한다
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "c##itbank";
	private String password = "it";
	
	public BookDAO() {	// DAO 객체를 생성하면 conn이 준비된 상태로 시작한다
		try {
			Class.forName(OracleDriver.class.getName());
			conn = DriverManager.getConnection(url, username, password);
			// if(conn == null){
			// 	throw new SQLException("DB에 접속할 수 없습니다);
			//	}
			
		} catch (SQLException e) {
			System.out.println("DB 접속 예외 : " + e);
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 불러올 수 없습니다 : " + e);
			e.printStackTrace();
		}
	}
	
	// 전체 목록 불러오기
	public ArrayList<BookDTO> selectList(){
		// conn -> stmt -> rs/row rs : select, row : int
		ArrayList<BookDTO> list = new ArrayList<>();
		String sql = "select * from book";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setAuthor(rs.getString("author"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setPublisher(rs.getString("publisher"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("selectList 예외 발생" + e);
			e.printStackTrace();
		} finally{
			try {
				if(rs != null) rs.close();		// 통로 개설의 역순으로 닫아준다
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		}		
		return list;
	}

	// 전달받은 객체를 DB에 저장하기
	public int insertBook(BookDTO dto) {
		int row = 0;
//		String sql = "insert into book values ()";
		// 쿼리문에 내가 입력해야하는 내용이 많으면
		// 따음표 처리 및 자료형 처리가 불편
		// 기존의 Statement는 이런 기능이 없어서
		// PreparedStatement를 이용하면 순서대로 값을 넣을 수 있는데
		// 사용하는 형식은 printf()와 유사하다
		String sql = "insert into book values (?, ?, ?, ?)";	// 쿼리문 형식만 준비
		try {
			pstmt = conn.prepareStatement(sql);		// setString은 따옴표처리도 처음으로 수행한다
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getPublisher());	
			pstmt.setInt(4, dto.getPrice());		// setInt는 따옴표를 처리하지 않는다
			row = pstmt.executeUpdate();			// insert/update/delete를 수행하고 int를 받는다
	
		} catch (SQLException e) {
			System.out.println("insertBook 예외 발생 : " + e);
			e.printStackTrace();
			
		} finally{
			try {
				if(rs != null) rs.close();		// 통로 개설의 역순으로 닫아준다
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		}		
		return row;
	}

	
	public int deleteBook(String name) {
		int row = 0;
		String sql = "delete book where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			row = pstmt.executeUpdate();					
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally{
			try {
				if(rs != null) rs.close();		// 통로 개설의 역순으로 닫아준다
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		}	
		return row;
	}
	
	
	
	
	
	
	
	
}			
