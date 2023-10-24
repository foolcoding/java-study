package string;

public class Ex04 {
	public static void main(String[] args) {
		String[] arr = {"짱구", "맹구", "유리", "훈이", "수지", "철수", "짱아"};
		String s2 = "";
		
		for(int i = 0; i < arr.length; i++) {	// 전체 데이터 중에서
			String name = arr[i];				// 각 계별 데이터를 name이라고 할 때
			if(name.contains("구")) {			// name에 "구"라는 글자가 포함되면
				System.out.println(name);
				s2 += name + "\n";
			}
		}
		System.out.println(s2);
		
	}
}
