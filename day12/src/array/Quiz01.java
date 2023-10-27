package array;

import java.util.Arrays;

public class Quiz01 {
	public static void main(String[] args) {
		
		int[] arr = { 9, 54, 23, 72, 99, 85, 31, 16, 49, 62 };
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력
		int evenCount = 0; 
		int oddCount = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddCount++;
			}
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println("짝수의 수 : " + evenCount);
		System.out.println("홀수의 수 : " + oddCount);
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력
		int odd = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				odd += arr[i];
			}	
		}
		System.out.println("홀수합계 : " + odd);
		
		// [] : 배열 생성시에는 길이를 지정 (리터럴 및 변수 사용가능)
		// 		생성된 배열에 대해 사용하면 길이가 아니라 인덱스를 지정한다	
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력

		System.out.print("짝수만 : ");
		
		// 길이가 서로 달라서 원본배열의 인덱스와 신규배열의 인덱스를 따로 관리해야 한다
		int[] arr2 = new int[evenCount];
		
		int j= 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3를 만들어서 출력
		int[] arr3 = new int[arr.length];
		System.out.print("거꾸로 : ");
		for(int i =0; i < arr.length; i++) {
			int k = arr.length -1 -i;
			arr3[k] += arr[i];
		}

		System.out.println(Arrays.toString(arr3));
		
		// 5) arr를 내름차순 정렬한 후 다시 출력하세요
		System.out.print("내름차순 : ");

		for(int i = 0; i < arr.length; i++) {
			for(int k = i + 1; k < arr.length; k++) {
				if(arr[i] < arr[k]) {
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
			System.out.print(arr[i] + ", ");
		}

	}
}
