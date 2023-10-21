package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String arrow = "↑";
		String space = "_";
		int distance;
		
		System.out.print("0 ~ 30 입력 : ");
		distance = sc.nextInt();
		
		System.out.println("┌───┬───┬───┬───┬───┬───┐");
		System.out.println("│││││││││││││││││││││││││");
		System.out.println("0   5   10  15  20  25  30");
		
		for(int i = 0; i < distance; i++) {
			System.out.print(space);
		}
		System.out.print(arrow);
		sc.close();
		
	}
}
