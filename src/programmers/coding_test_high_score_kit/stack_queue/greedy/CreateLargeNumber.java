package programmers.coding_test_high_score_kit.stack_queue.greedy;

import java.util.ArrayList;
import java.util.List;

public class CreateLargeNumber {

    public static String solution(String number, int k) {

    	String answer = "";
    	StringBuffer sb = new StringBuffer(number);
    	
    	for(int i=1; i<10; i++) {
    		
    		for(int j=0; j<number.length()-1; j++) {
    			
    			if(i == number.charAt(j)-48) {
    				sb.deleteCharAt(j);
    				k--;
    			}
    			
    			if(k == 0) break; 
    		}
        }
    
    	return answer;
	}
    
	public static void main(String[] args) {

		solution("1924", 2);
		solution("1231234", 3);
	}
}
