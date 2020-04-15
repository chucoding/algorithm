package programmers.coding_test_high_score_kit.greedy;

import java.util.ArrayDeque;
import java.util.Deque;

public class CreateLargeNumber2 {

    public static String solution(String number, int k) {
    	String answer = "";
    	
    	Deque<Integer> st = new ArrayDeque<Integer>();
    	for(int i=0; i<number.length(); i++) {
    		int n = Character.getNumericValue(number.charAt(i));
    		while(!st.isEmpty()) {
    			if(st.peek() >= n || k == 0) break;
    			else {
    				st.pop();
    				k--;
    			}
    		}
    		
    		st.push(n);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	while(!st.isEmpty()) {
    		sb.append(st.pop());
    	}
    	
    	answer = new String(sb.reverse());
    	if(answer.length() > number.length() - k) answer = answer.substring(0,k);
    	System.out.println(answer);
        return answer;
    }
    
	public static void main(String[] args) {

//		solution("19241", 3);
//		solution("1231234", 4);
//		solution("4177252841",5);
//		solution("410002841",4);
//		solution("000002841",4);
		solution("7032841",5);
		solution("4177252841",4);
		solution("7777",2);
	}
}

