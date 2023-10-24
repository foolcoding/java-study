package string;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		
//	1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
	new_id = new_id.toLowerCase();

//	2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//	조건에 맞는 글자만 answer에 더하세요, 이후 단계에서는 new_id 대신 answer로 작업하면 됩니다	
	for(int i = 0; i < new_id.length(); i++) {
		char ch = new_id.charAt(i);
		if('a' <= ch && ch <= 'z') {
			answer += ch;
		}
		if('0' <= ch && ch <= '9') {
			answer += ch;
		}
		if(ch == '-' || ch == '_' || ch == '.') {
			answer += ch;
		}
	}
	
//	3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	while(answer.contains("..")) {
		answer = answer.replace("..", ".");
	}
	
//	4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	if(answer.startsWith(".")) {
		answer = answer.substring(1);	// 1번째 인덱스부터 끝까지 잘라서 다시 대입한다
	}
	if(answer.endsWith(".")) {
		answer = answer.substring(0, answer.length() - 1);	// 0부터 마지막까지(미포함) 잘라서 대입한다
	}

//	5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
	if(answer.equals("")) {
		answer = "a";
	}

//	6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	if(answer.length() >= 16) {
		answer = answer.substring(0, 15);
		
//	만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if(answer.endsWith(".")) {
			answer = answer.substring(0, 14);
		}
	}
//	7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	while(answer.length() <= 2) {
		answer += answer.substring(answer.length() - 1);
	}

		return answer;	//함수가 종료되면서 마지막에 내놓는 값(돌려주는값, 반환값)
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		String[] inputs = {
				"...!@BaT#*..y.abcdefghijklm", 
				"z-+.^.", 
				"=.=", 
				"123_.def", 
				"abcdefghijklmn.p", 
				};

		String[] outputs = { // 제시되는 기댓값들
				"bat.y.abcdefghi", 
				"z--", 
				"aaa", 
				"123_.def", 
				"abcdefghijklmn", 
				};

		Solution solution = new Solution();
		for (int i = 0; i < inputs.length; i++) {
			String new_id = inputs[i];
			String output = outputs[i];
			String answer = solution.solution(new_id);
			System.out.printf("%d) %s\n", i + 1, answer.equals(output));
		}
		System.out.println("테스트 끝");

	}
}
