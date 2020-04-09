package programmers.coding_test_high_score_kit.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {

	public static int solution(int[][] jobs) {
		int answer = 0;
		
		int length = 0;
		for(int i=0; i<jobs.length; i++) {
			length += jobs[i][1];
		}
		
		Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		int index = 0;
		int n =0;
		int endTime = 0;
		
		for(int i=0; i<length; i++) {
			while(index < jobs.length && i == jobs[index][0]) {
				
				if(!heap.isEmpty()) heap.offer( jobs[index][1] - jobs[index][0]);
				else {
					heap.offer(jobs[index][1]);
					endTime = jobs[index][1];
				}
				index++;
			}
			
			System.out.println(heap);
			
			if(!heap.isEmpty() && endTime == 0) {
				n = heap.poll();
				endTime = i + n;
				answer += endTime;
				System.out.println(answer);
			}
			
			endTime--;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[][] {{0,3},{1,9},{2,6}});
	}
}
