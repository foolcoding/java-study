package book;

import java.util.ArrayList;
import java.util.Scanner;

import accessModifier.Human;
import student.Student;

// 사용자와 상호작용
// 입력값에 따라서 handler의 함수를 출력

public class Handler {	// // 북 arr를 list로 바꾸고 밑에 함수들 처리
	
	private Book[] arr = new Book[5];
	
	public int add(String title, String author, int price) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setTitle(title);
				arr[i].setAuthor(author);
				arr[i].setPrice(price);
				row = 1;
				break;
			}
		}
		return row;
	}
	
	public void BookInfo() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println("책 제목 : " + arr[i].getTitle());
				System.out.println("저자명 : " + arr[i].getAuthor());
				System.out.printf("가격 : %,d원\n", arr[i].getPrice());
			}
		}
	}
	
	public void search(String title) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getTitle().equals(title) == true) {
				System.out.printf("첵제목 : %s\n저자명 : %s\n가격 : %d\n", arr[i].getTitle(), arr[i].getAuthor(), arr[i].getPrice());
				return;
			}
		}
		System.out.println("정확히 입력해주세요");
	}
	
	public void priceSort() {
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].getPrice() < arr[j].getPrice()) {
					Book tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		BookInfo();
	}

	public void deleteBook(String title) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getTitle().equals(title)) {
				arr[i] = null;
			}
		}
		BookInfo();
	}
	
	public void priceChange(String title, Scanner sc) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getTitle().equals(title)) {
				System.out.print("수정할 가격을 입력해주세요 : ");
				arr[i].setPrice(Integer.parseInt(sc.nextLine()));
				break;
			}
		}
	}
	
	ArrayList<String> sumBookList = new ArrayList<>();
	
	public void sumBook(Scanner sc) {
		int stop = -1;
		
		for (int i = 0; i < sumBookList.size(); i++) {			
			if(sumBookList.get(i) == null) {
				System.out.print("계산할 책의 제목을 입력해주세요 : ");
				sumBookList.add(i, sc.nextLine());
			}
			System.out.print("계속입력하시려면 1, 입력을 중지하시려면 0을 입력해주새요 : ");
			stop = Integer.parseInt(sc.nextLine());
			if(stop == 0) {
				break;
			}
		}
	}
	
	public int priceSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < sumBookList.size(); j++) {
				if(arr[i] != null && sumBookList.get(j) != null && arr[i].getTitle().equals(sumBookList.get(j))) {
					sum += arr[i].getPrice();
				}
			}
		}
		return sum;
	}
	
}
