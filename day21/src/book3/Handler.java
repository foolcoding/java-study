package book3;

import book2.Book;

public class Handler {
	
	private Book[] arr = new Book[10];
	
	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s (%s, %s) %,d원\n", 
						arr[i].getName(), 
						arr[i].getAuthor(), 
						arr[i].getPublisher(),
						arr[i].getPrice());
			}
		}		
	}
	
	public int insertBook(Book ob) {
		int row = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				row = 1;
				break;
			}
		}
		return row;
	}
	
	public int deleteBook(String name) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				
				row = 1;
				break;
			}			
		}
		return row;
	}
	
	
} // end of Handler
