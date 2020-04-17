package programmers.coding_test_high_score_kit.sort;

import java.util.Arrays;

public class Hindex {

	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++){
            if(i >= citations[citations.length-1-i]) return i;
        }
        
        if(answer == 0) answer = citations.length;
        
        return answer;
    }
}
