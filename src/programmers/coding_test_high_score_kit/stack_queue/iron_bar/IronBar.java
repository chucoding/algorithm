package programmers.coding_test_high_score_kit.stack_queue.iron_bar;

import java.util.ArrayDeque;
import java.util.Deque;

public class IronBar {
	
	public static int solution(String arrangement) {
        int answer = 0;
        
        Deque<Character> stack = new ArrayDeque<Character>();
        char[] c = arrangement.toCharArray();
        
        for(int i=0; i<c.length; i++) {
        	
        	if(c[i] == '(') stack.push(c[i]);
        	else {
        		if(c[i-1] == ')') {
        			stack.pop();
        			answer++;
        		}else {
        			stack.pop();
        			answer += stack.size();
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("()(((()())(())()))(())");
	}
}
