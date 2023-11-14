package functionalInterface;

interface Test {
	void method(String s);
}

class Repository{
	String [] arr = new String[] {
			"이지은", "홍진호", "짱구", "단비", "김태리", "유진초이"
	};
	
	public void forEach(Test lambda) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				lambda.method(arr[i]);
			}
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Repository repo = new Repository();
		
		repo.forEach(str -> System.out.println(str));
		System.out.println();
		
		repo.forEach(str -> System.out.println(str.length()));
		System.out.println();
		
		Test lambda = (str) -> {
			String odd = "홀수";
			if(str.length() % 2 == 0) {
				odd = "짝수";
			}
			System.out.println(odd);
		};
		repo.forEach(lambda);
		
	}
}
