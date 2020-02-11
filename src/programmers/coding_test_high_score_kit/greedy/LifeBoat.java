package programmers.coding_test_high_score_kit.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LifeBoat {

	public static int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<people.length; i++) {
			q.offer(people[i]);
		}
		
		
		while(true) {
			
			if(q.isEmpty()) break;
			
			int j=0;
			for(int i=0; i<people.length; i++) {
				if(people[i] + people[people.length-j] > 100 ) j++; 
				else if(people[i] + people[people.length-j] < 100) i++;	
			}
		}
		
		return answer;
	}
	
	public static int dfs(int arr[], int left, int right, int i) {

		if (left < right) {
			dfs(arr, left, i, - 1);
		}
		if(right > left) {
			dfs(arr, i, + 1, right);
		}

		return dfs(arr, i, 1, right);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
	}
}
