package programmers.kakao2019;

import java.util.Arrays;
import java.util.Comparator;

public class FailureRate {

	public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++) {
        	arr[i] = i;
        }
        
        double failure[] = new double[N+1];
        double failures[] = new double[N+1];
        
        for(int i=0; i<stages.length; i++) {
        	failure[stages[i]-1]++;
        }
        
        int sum = stages.length; 
        for(int i=0; i<failure.length; i++) {
        	if(sum == 0) failures[i] = 0.0;
        	else {
        		failures[i] = failure[i] / sum;
        		sum -= failure[i];
        	}
        }
        
        Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				if(failures[o2] > failures[o1]) return 1;
				else if(failures[o1] == failures[o2]) {
					if(o2 < o1) return 1;
				} 
				
				return -1;
			}
        });

        answer = new int[N];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = arr[i] + 1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(5, new int[] {2,1,2,6,2,4,3,3});
	}
}
