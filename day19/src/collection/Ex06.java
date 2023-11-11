package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> set = new HashSet<>();	// set으로 중복처리
		
		while(set.size() != 6) {	// set의 size가 6이면 반복 종료
			int num = ran.nextInt(45) + 1;
			set.add(num);
		}
		ArrayList<Integer> list = new ArrayList<>(set);	// list로 정렬
		list.sort(null);
		System.out.println("list : " + list);
	}
}
