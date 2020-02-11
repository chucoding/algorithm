package programmers.skill_test;

import java.util.Stack;

public class Level3 {

	static boolean solution(String s) {
		boolean answer = true;

		StringBuilder sb = new StringBuilder(s);
		Stack st = new Stack();

		if(s.charAt(0) == ')') return false;
		else st.push(sb.charAt(0));
		
		for(int i=1; i<sb.length(); i++) {
			if(sb.charAt(i) == '(') st.push(sb.charAt(i));
			else if(sb.charAt(i) == ')' && !st.empty()) st.pop();
			else return false;
		}
		
		if(!st.empty()) answer = false;
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("(())()"));
		System.out.println(solution("()()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}
}
