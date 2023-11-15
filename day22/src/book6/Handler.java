package book6;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Handler {
	
	// 배열에서 리스트로 실행
	// 리스트에서 파일을 거쳐서 DB로 저장소를 연결한다
//	private File f = new File("bookList.csv");
	
	public void showList() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectList();
		list.forEach(ob -> System.out.print(ob));
	}
	
	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob);	// 메인이 넘겨준 객체를 dao로 전달하여 추가한다
		return row;					// 추가 결과 정수를 다시 메인으로 반환한다
	}
	
	public int deleteBook(String name) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);		
		return row;
	}
	
	
} // end of Handler
