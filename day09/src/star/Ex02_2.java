package star;

public class Ex02_2 {
	public static void main(String[] args) {
		int size = 9;
		int st = 1;
		int sp = size - st * 2;

		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
			}
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				if(i == size / 2 && j == 0){
					j++;
				}
				System.out.print("* ");
			}
			System.out.println();
			if(i < size / 2) {
				st += 1;
				sp -= 2;
			}
			else{
				st -= 1;
				sp += 2;
			}
		}
		
	}
}
