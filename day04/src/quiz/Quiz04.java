package quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소모 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int minute, perStation, hours;
		
		System.out.print("몇 구간 이동하였나요? : ");
		perStation = sc.nextInt();
		minute = perStation * 4;
		
		if(minute <= 60) {
			System.out.printf("%d분 이 걸립니다", minute);
		}
//		else if (minute > 60) {
		else {
			hours = minute / 60;
			minute = minute % 60;
			System.out.printf("%d시간 %d분이 걸립니다", hours, minute);
		}
		sc.close();
		
		
	}
}
