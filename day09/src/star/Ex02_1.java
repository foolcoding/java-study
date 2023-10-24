package star;

public class Ex02_1 {
	public static void main(String[] args) {
		
		int size = 5;
		int st = 5;
		int sp = size - st;
	
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
			}
			sp += 1;
			st -= 1;
			
			System.out.println();
		}
}
}
