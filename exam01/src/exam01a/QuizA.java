package exam01a;

import java.util.Random;

public class QuizA {

	static void random(int[] arr) {
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;	
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
	}

	static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
	}
	
	static void arrOutput(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			System.out.printf("%2d, ", arr[i]);
		}
		for(int i = arr.length - 1; i <= arr.length - 1; i++) {
			System.out.printf("%2d", arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println("응시자 : 최현웅\n");
		
		int[] arr = new int[6];
		for(int i = 0; i < arr.length - 1; i++) {
			random(arr);
			selectionSort(arr);
			arrOutput(arr);
		}
		

		
	}
}
