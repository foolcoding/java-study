package book4;

import java.util.ArrayList;


public class Handler {
	
//	private Book[] arr = new Book[10];
	
	private ArrayList<Book> list = new ArrayList<>();	
	
	public void showList() {
//		for(int i = 0; i < list.size(); i++) {
//			Book ob = list.get(i);
//			System.out.println(list.get(i));
//		}
		
//		for(Book ob : list) {
//			System.out.println(ob);
//		}
		
		list.forEach(ob -> System.out.println(ob));
		
//		list.forEach(System.out::println);
		
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
