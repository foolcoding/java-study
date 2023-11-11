package collection;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		
		ArrayList<Test2> list = new ArrayList<>();
		list.add(new Test2("iu930516", "이지은"));
		list.add(new Test2("yellow", "홍진호"));
		list.add(new Test2("danbi", "나단비"));
		
		for(int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s\n", ob.getId(), ob.getName());
		}
		System.out.println();
		
		// id 오름차순으로 정렬하기
		list.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
		
		// 출력코드
		for(int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s\n", ob.getId(), ob.getName());
		}
		System.out.println();
		
		list.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
		for(int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s\n", ob.getId(), ob.getName());
		}
		System.out.println();
		
	}
}
