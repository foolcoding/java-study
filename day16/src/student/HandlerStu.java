package student;

import java.util.Scanner;

public class HandlerStu {
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[100];
	
		public void info() {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] != null) {
					System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.2f\n", arr[i].name, arr[i].ban, 
							arr[i].no, arr[i].kor, 
							arr[i].eng, arr[i].math, sum(arr[i].kor, arr[i].eng, arr[i].math), 
							sum(arr[i].kor, arr[i].eng, arr[i].math) / 3.0);
				}
			}
			System.out.println();
		}
		
		public int sum(int kor, int eng, int math) {
			int result = 0;
			result = kor + eng + math;
			return result;
		}
		
		public void add(String name, int ban, int no, int kor, int eng, int math) {
			for (int i =0; i < arr.length; i++) {
				if(arr[i] == null){
					arr[i] = new Student(name, ban, no, kor, eng, math);
					return;
				}
			}
			System.out.println();
		}
		
		public void search(String name) {
			for(int i =0; i < arr.length; i++) {
				if(arr[i] != null && arr[i]a.name.equals(name) == true) {
					System.out.printf("%s, %d, %d, %d, %d, %d\n", arr[i].name, arr[i].ban, 
							arr[i].no, arr[i].kor, 
							arr[i].eng, arr[i].math);
					return;
				}
			}
			System.out.println("정확히 입력해주세요");
		}
		
		public void korSort() {
			for(int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] != null && arr[j] != null && arr[i].kor < arr[j].kor) {
						Student tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
			info();
		}

		public void engSort() {
			for(int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] != null && arr[j] != null && arr[i].eng < arr[j].eng) {
						Student tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
			info();
		}

		public void mathSort() {
			for(int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] != null && arr[j] != null && arr[i].math < arr[j].math) {
						Student tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
			info();
		}

		public void sumSort() {
			for(int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] != null && arr[j] != null && sum(arr[i].kor, arr[i].eng, arr[i].math)
							< sum(arr[j].kor, arr[j].eng, arr[j].math)) {
						Student tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
			info();
		}

		public void avgSort() {
			for(int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] != null && arr[j] != null && sum(arr[i].kor, arr[i].eng, arr[i].math)/3
							< sum(arr[j].kor, arr[j].eng, arr[j].math)/3) {
						Student tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
			info();
		}
}
