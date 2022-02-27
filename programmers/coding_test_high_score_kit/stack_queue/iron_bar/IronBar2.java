package programmers.coding_test_high_score_kit.stack_queue.iron_bar;

public class IronBar2 {
	
	public static int solution(String arrangement) {
		int answer = 0;
		int pipe = 0;
		char tmp;
		char[] ca = arrangement.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			tmp = ca[i];
			if (tmp == '(' && ca[i + 1] == ')') {
				answer += pipe; i++; 
			} else {
				if (tmp == '(') pipe++; 
				else {
					answer += 1;
					pipe--;
				}
			}
		}
		
		System.out.println(answer);
		return answer;
	} 
	
	public static void main(String[] args) {
		solution("()(((()())(())()))(())");
	}
}
