package function;

public class Quiz01 {
	static String getSign1(int q1) {
		String a1;
		if(q1 > 0) {
			a1 = "양수";
		}
		else if(q1 < 0) {
			a1 = "음수";
		}
		else {
			a1 = "0";
		}
		return a1;
	}
	
	static int getReverseNum(int q2) {
		int result = 0;
	       while(q2 != 0){
	    	   result = result * 10 + q2 % 10;
	            q2 /= 10;
	        }
		
		return result;
	}
	
	static int pow(int q3, int q31) {
		int a3 = 1;
		for(int i = 0; i < q31; i++) {
			a3 *= q3;
		}
		return a3;
	}
	
	static int remainder(int q4, int q41) {
		int a4 = q4 % q41;
		
		return a4;
	}
	
	static String getReverseStr(String q5) {
		String a5 = "";
		 for(int i = q5.length() - 1; i >= 0; i--) {
			 a5 += q5.charAt(i);
		 }
		return a5;
	}
	
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
		String t1 = getSign1(5);
		System.out.println("t1 : " + t1);
		
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int t2 = getReverseNum(1234);
		System.out.println("t2 : " + t2);
		
		// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		int t3 = pow(2, 10);
		System.out.println("t3 : " + t3);
		
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		int t4 = remainder(123, 4);
		System.out.println("t4 : " + t4);
		
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		String t5 = getReverseStr("안녕하세요");
		System.out.println("t5 : " + t5);
		
	}

	private static String getSign(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
