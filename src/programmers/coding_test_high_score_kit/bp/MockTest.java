package programmers.coding_test_high_score_kit.bp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTest {

	public static int[] solution(int[] answers) {
        int[] answer = {};
        List list = new ArrayList();
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        Integer[] cntArr = {0, 0, 0};
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == a[i%5]) cntArr[0]++;
        	if(answers[i] == b[i%8]) cntArr[1]++;
        	if(answers[i] == c[i%10]) cntArr[2]++;
        }
        
        Arrays.sort(cntArr, Collections.reverseOrder());
        for(int i=0; i<cntArr.length; i++) {
        	
        	if(i == 0 || cntArr[i] == cntArr[i-1]) list.add(i+1);
        	else break;
        }
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = (int) list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] answer = {1,2,3,4,5};
		solution(answer);
	}
}
