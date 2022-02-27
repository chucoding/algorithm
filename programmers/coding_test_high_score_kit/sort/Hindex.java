package programmers.coding_test_high_score_kit.sort;

import java.util.Arrays;

public class Hindex {

	public int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);

		if(citations[0] >= citations.length) answer = citations.length;
		else {
			for(int i=0; i<citations.length; i++){
				if(citations[i] > citations.length - i) {
					if(citations[i-1] < citations.length-i) answer = citations.length-i;
					else answer = citations[i-1];
					break;
				} 
			}
		}

		return answer;
	}
}
