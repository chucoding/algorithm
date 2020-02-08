package programmers.coding_test_high_score_kit.hash;

import java.util.HashMap;
import java.util.Map;

public class IncompletePlayer {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<Integer, String> map = new HashMap();
        
        for(int i=0; i<participant.length; i++) {
        	map.put(i,participant[i]);
        }
        
        for ( int key : map.keySet() ) {
        	for(int i=0; i<completion.length; i++) {
        		if(map.get(key).equals(completion[i])) {
        			map.remove(key);
        		}
        	}
        }

        System.out.println(map);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = solution(participant, completion);
	}
}
