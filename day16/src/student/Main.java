package student;

import java.util.Scanner;

import book.Book;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HandlerStu handlerStu = new HandlerStu();
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		while(true) {
			System.out.println("목록 : 1");
			System.out.println("추가 : 2");
			System.out.println("검색 : 3");
			System.out.println("국어 내림차순 : 4");
			System.out.println("영어 내림차순 : 5");
			System.out.println("수학 내림차순 : 6");
			System.out.println("합계 내림차순 : 7");
			System.out.println("평균 내림차순 : 8");
			System.out.println("종료 : 0");
			System.out.print(">>> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handlerStu.info();
				break;
				
			case 2:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("반 입력 : ");
				ban = Integer.parseInt(sc.nextLine());
				System.out.print("번호 입력 : ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("국어 입력 : ");
				kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 입력 : ");
				eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 입력 : ");
				math = Integer.parseInt(sc.nextLine());
				
				handlerStu.add(name, ban, no, kor, eng, math);
				break;
				
			case 3:
				System.out.print("이름을 정확히 입력 하세요 : ");
				name = sc.nextLine();
				handlerStu.search(name);
				break;
				
			case 4:
				handlerStu.korSort();
				break;
				
			case 5:
				handlerStu.engSort();
				break;
				
			case 6:
				handlerStu.mathSort();
				break;
				
			case 7:
				handlerStu.sumSort();
				break;
				
			case 8:
				handlerStu.avgSort();
				break;
				
			case 0:
				sc.close();
				System.out.println("시스템을 종료합니다");
				return;
			}// end of switch
		}// end of while
	}// end of main
}


