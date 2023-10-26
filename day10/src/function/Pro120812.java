package function;

// 주어진 배열에서 가장 등장빈도가 많은 값을 구하세요
// 가장 많이 등장한 값의 횟수가 아니라, 값 그 자체를 반환해야 합니다 
// 최빈값이 2개 이상이면 -1을 반환해야 합니다

// 0 < array의 길이 < 100
// 0 < array의 원소 < 1000

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 원소의 최대값을 먼저 구하고, 그 길이만큼의 배열을 생성하여 횟수체크에 사용한다
        // 이 과정을 생략하고 싶다면 길이 1001의 배열을 생성하면 된다
        // +1 이 들어가는 이유는 0부터 시작하는 index의 특성상 계산이 번거로워서   
        int max = 0;
        for(int i = 0; i < array.length; i++) {
        	if(max < array[i])
        		max = array[i];
        }
        int[] counts = new int[max + 1]; // {0, 0, 0, 0, 0}
        
        for(int i = 0; i < array.length; i++) {
//        	if(array[i] == 1) {
//        		counts[1] += 1;
//        	}
    		counts[array[i]] += 1;
        }
       
        int max1 = 0;
        for(int i = 0; i < counts.length; i++) {
        	if(max1 == counts[i]) {
        		answer = -1;
        	}
        	if(max1 < counts[i]) {
        		max1 = counts[i];
        		answer = i;
        	}
        }
        
        // 최빈값을 answer에 담아서 반환하면 된다
        // array에서 가장 많이 등장한 값을 찾아야 한다
        // array의 각 값이 등장한 횟수를 체크해야 한다
        // 횟수에서 최대값을 찾아서 횟수가 아닌 가장 많이 등장한 값을 answer에 담는다
        // 만약, 횟수에서 최대값이 중복된다면 answer에 -1을 담는다
        
        
        
        return answer;
    }
}

public class Pro120812 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int answer1 = s.solution(new int[] {1, 2, 3, 3, 3, 4});
		int answer2 = s.solution(new int[] {1, 1, 2, 3, 3});
		int answer3 = s.solution(new int[] {1});
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		
	}
}
