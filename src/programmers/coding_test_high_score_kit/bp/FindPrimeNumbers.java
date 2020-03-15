package programmers.coding_test_high_score_kit.bp;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {

    public static int solution(String numbers) {
        int answer = 0;
        int[][] test = new int[numbers.length()][numbers.length()];
        
        for(int i=0; i<numbers.length(); i++) {
        	for(int j=0; j<numbers.length(); j++) {
        		test[i][j] = 1;
        	}
        }
        
        for(int i=0; i<numbers.length(); i++) {
        	for(int j=0; j<numbers.length(); j++) {
        		System.out.print(test[i][j]+" ");
        	}
        	System.out.println();
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	int a = solution("17");
	
    	
    }
}
