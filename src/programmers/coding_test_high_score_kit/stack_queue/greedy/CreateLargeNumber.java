package programmers.coding_test_high_score_kit.stack_queue.greedy;

import java.util.ArrayList;
import java.util.List;

public class CreateLargeNumber {

    public static String solution(String number, int k) {

    	String answer = "";
    	List list = new ArrayList();
    	
    	for(int i=0; i<number.length(); i++) {
    		list.add(number.charAt(i));
    	}
    	
    	System.out.println(list);
//    	StringBuffer _answer = new StringBuffer(number);
    	
    	for(int i=1; i<10; i++) {
    		for(int j=0; j<number.length()-1; j++) {
    			
    			if(i == number.charAt(j)-48) {
    				list.remove(j);
    				k--;
    			} else {
    				continue;
    			}
    			
    			if(k == 0) break; 
    		}
        }
    
    	answer = list.toString();
    	return answer;
	}
    
	public static void main(String[] args) {

		solution("1924", 2);
		solution("1231234", 3);
	}
}
