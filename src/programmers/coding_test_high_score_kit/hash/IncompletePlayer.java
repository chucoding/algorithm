package programmers.coding_test_high_score_kit.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IncompletePlayer {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap();
        
        //completion이 더 위에 있는 이유 : paricipant for문에서 한번에 처리가능(-1은 확실하게 완주 못했다는 것을 의미함)
        for(String person : completion) {
        	map.put(person, map.getOrDefault(person, 0) +1);
        }
        
        for(String person : participant) {
        	map.put(person, map.getOrDefault(person, 0) -1);
        
        	if(map.get(person) < 0)
        		return person;
        }
        
        return answer;
    }
	
	public static String solution2(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) { //정렬되므로 한사람은 무조건 없음!
				return participant[i];
			}
		}
		
		return participant[i];
	
	}
	
	public static void main(String[] args) {
		
		long beforeTime = 0;
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		beforeTime = System.nanoTime(); 
		String answer = solution(participant, completion);
		System.out.println(System.nanoTime() - beforeTime);
		
		beforeTime = System.nanoTime(); 
		String answer2 = solution2(participant, completion);
		System.out.println(System.nanoTime() - beforeTime);
	
	}
}
