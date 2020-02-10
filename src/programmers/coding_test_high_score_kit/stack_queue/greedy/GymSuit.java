package programmers.coding_test_high_score_kit.stack_queue.greedy;

public class GymSuit {

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;
        int[] student = new int[n];
        
        for(int i=0; i<n; i++) {
        	student[i] = 1;
        }
        
        for(int i=0; i<reserve.length; i++) {
        	student[reserve[i]-1] += 1;
        }
        
        for(int i=0; i<lost.length; i++) {
        	student[lost[i]-1] -= 1;
        }

        for(int i=0; i<n; i++) {

        	if(student[i] == 0) {
        		if(i == 0 && student[i+1] == 2) {
        			student[i]++;
            		student[i+1]--;
        		} else if(i != 0 && i != n-1 && student[i-1] == 2) {
        			student[i]++;
        			student[i-1]--;
        		} else if(i != n-1 && i != 0 && student[i+1] == 2) {
        			student[i]++;
        			student[i+1]--;
        		} else if(i == n-1 && student[i-1] == 2) {
        			student[i]++;
            		student[i-1]--;
        		}
        	}
        }
        
        for(int i=0; i<n; i++) {
        	if(student[i] > 0) answer++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
//		solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
//		solution(5, new int[]{2, 4}, new int[]{3});
//		solution(10, new int[]{1,3,4,5}, new int[]{2,9});
//		solution(6, new int[]{2,4}, new int[]{1,3,6});
		solution(6, new int[]{1,3,4,6}, new int[]{2,5});
	}
}
