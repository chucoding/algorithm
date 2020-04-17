package programmers.coding_test_high_score_kit.greedy;

import java.util.Arrays;

public class GymSuit {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        
        for(int i=0; i<lost.length; i++) arr[lost[i]-1]--;
        for(int i=0; i<reserve.length; i++) arr[reserve[i]-1]++;
        
        for(int i=0; i<arr.length; i++) {
        	if(i == 0 && arr[i+1] ==2) {
        		arr[i+1]--;
        		arr[i]++;
        	}
        	if(arr[i] == 0 && i!=0 && arr[i-1] == 2 ) {
        		arr[i-1]--;
        		arr[i]++;
        	} 
        	else if(arr[i] == 0 && i != arr.length-1 && arr[i+1] == 2 ) {
        		arr[i+1]--;
        		arr[i]++;
        	} else if(i == arr.length-1 && arr[i-1] == 2) {
        		arr[i-1]--;
        		arr[i]++;
        	}
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 0) continue;
        	answer++;
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		
		solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
		solution(5, new int[]{2, 4}, new int[]{3});
		solution(3, new int[]{3}, new int[]{1});
		solution(10, new int[]{1,3,4,5}, new int[]{2,9});
//		solution(6, new int[]{2,4}, new int[]{1,3,6});
//		solution(6, new int[]{1,3,4,6}, new int[]{2,5});
	}
}
