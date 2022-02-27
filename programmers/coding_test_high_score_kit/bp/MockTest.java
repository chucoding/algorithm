package programmers.coding_test_high_score_kit.bp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {

	public static int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] cntArr = new int[3];
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == a[i%5]) cntArr[0]++;
        	if(answers[i] == b[i%8]) cntArr[1]++;
        	if(answers[i] == c[i%10]) cntArr[2]++;
        }
        
        int winner = cntArr[0];
        for(int i=0; i<cntArr.length; i++) {
        	if(winner < cntArr[i]) {
        		winner = cntArr[i];
        	}
        }
        
        for(int i=0; i<cntArr.length; i++) {
        	if(winner == cntArr[i]) list.add(i);
        }
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i)+1;
        }
        
        Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] answer = {1,2,3,4,5,4,3,4,2,3,4,2,2,2};
		solution(answer);
	}
}
