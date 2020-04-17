package programmers.kakao2019;

import java.util.Arrays;
import java.util.Comparator;

public class FailureRate2 {

	public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++) {
        	arr[i] = i;
        }
        
        Arrays.sort(stages);
        double success[] = new double[N+1];
        
        int sum = 0;
        int j=0;
        for(int i=stages.length-1; i>=1; i--) {
        	
        	if(stages[i] != stages[i-1]) success[j++] = sum++;
        	sum++;
        }
        
        for(int i=0; i<success.length; i++) {
        	System.out.println(success[i]);
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(5, new int[] {2,1,2,6,2,4,3,3});
	}
}
