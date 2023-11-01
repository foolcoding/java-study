package accessModifier;

import java.util.Scanner;

class Handler5{

	

	private Human[] arr = new Human[5];
	

	public int add(String name, int age) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Human();
				arr[i].setName(name);
				arr[i].setAge(age);
				row = 1;
				break;
			}
		}
		return row;
	}

	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println("�씠由� : " + arr[i].getName());
				System.out.println("�굹�씠 : " + arr[i].getAge());
			}
		}
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Handler5 handler = new Handler5();
				int menu;
				String name;
				int age;
				int row;
				
				while(true) {
					System.out.println("1. �엯�젰");
					System.out.println("2. 異쒕젰");
					System.out.println("0. 醫낅즺");
					System.out.print("�꽑�깮 >>>");
					menu = Integer.parseInt(sc.nextLine());
					switch(menu) {
					case 1:
						System.out.print("�씠由� �엯�젰 : ");
						name = sc.nextLine();
						System.out.print("�굹�씠 �엯�젰 : ");
						age = Integer.parseInt(sc.nextLine());
						row = handler.add(name, age);	// �엯�젰媛믪쓣 諛쏆븘�꽌 �꽆湲곕㈃
														// handler媛� �븣�븘�꽌 泥섎━�븯怨�
														// 洹� 寃곌낵瑜� main()�뿉寃� 蹂닿퀬�븳�떎
						System.out.println(row != 0 ? "異붽� �꽦怨�" : "異붽� �떎�뙣");
						break;
						
					case 2:	
						handler.showList();
						break;
						
					case 0:
						sc.close();
						return;
						
					default:
						System.out.println("�옒紐� �꽑�깮�븯�뀲�뒿�땲�떎");
					}
					System.out.println();
			}	// end of while
	}
}
