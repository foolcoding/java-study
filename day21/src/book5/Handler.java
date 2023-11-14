package book5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Handler {
	
//	private Book[] arr = new Book[10];
	
	private ArrayList<Book> list = new ArrayList<>();	
	
	private File f = new File("bookList.csv");
			
	public Handler() {
		if(f.exists() == false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("\t파일을 생성하는데에 문제가 발생했습니다 : " + e);
				e.printStackTrace();
			}
		}
	}
	
	public void save() {
		try {
			// 프로그램의 데이터를 파일로 내보내는 스트링 (데이터의 이동 통로)
			FileOutputStream fos = new FileOutputStream(f);
			
			// 스트링으로 문자열 형식 데이터를 전달하는 기능이 추가된 클래스
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			for(Book ob : list) {
				String name = ob.getName();
				String author = ob.getAuthor();
				String publisher = ob.getPublisher();
				String price = String.valueOf(ob.getPrice());
				
				String date = String.format("%s,%s,%s,%s", name, author, publisher, price);
				osw.write(date);
				osw.write("\n");
			}
			osw.flush();
			osw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		try {
			Scanner sc = new Scanner(f);
			String data = "";
			while(sc.hasNextLine()) {
				data = sc.nextLine();
				if(data.length() != 0) {
					String[] arr = data.split(",");
					Book b = new Book();
					b.setName(arr[0]);
					b.setAuthor(arr[1]);
					b.setPublisher(arr[2]);
					b.setPrice(Integer.parseInt(arr[3]));
					list.add(b);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void showList() {
		
		list.forEach(ob -> System.out.println(ob));
	
	}
	
	public int insertBook(Book ob) {
		int row = 0;
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == null) {
//				arr[i] = ob;
//				row = 1;
//				break;
//			}
//		}
		
		boolean flag = list.add(ob);
		row = flag ? 1 : 0;
		return row;
	}
	
	public int deleteBook(String name) {
		int row = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != null && arr[i].getName().equals(name)) {
//				arr[i] = null;
//				
//				row = 1;
//				break;
//			}			
//		}
		
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;
		return row;
	}
	
	
} // end of Handler
