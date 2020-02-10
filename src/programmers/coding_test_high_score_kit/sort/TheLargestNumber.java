package programmers.coding_test_high_score_kit.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheLargestNumber {

	public static String solution(int[] numbers) {

		String answer = "";
		int[] _numbers = new int[numbers.length];
		
        for(int i=0; i<numbers.length; i++) {
        	
        	int num = numbers[i];
        	
        	while(true) {
        		if(num < 10) {
        			_numbers[i] = num;
        			break;
        		}
        		num /= 10;
        	}
        }
        
        Arrays.sort(_numbers); //생각해보니 같은수면?? 으으..  // 넣으면서 정렬해야됨
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] numbers = {6, 10, 2};
		String sol = solution(numbers);
	}
}
