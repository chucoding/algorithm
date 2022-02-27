package programmers.coding_test_high_score_kit.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class DoublePriorityQueue {

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        StringTokenizer st;
        for(int i=0; i<operations.length; i++) {
        	st = new StringTokenizer(operations[i]);
        	
        	char c = st.nextToken().charAt(0);
        	int n = Integer.parseInt(st.nextToken());

        	if(c == 'I') {
        		maxHeap.offer(n);
        		minHeap.offer(n);
        	}
        	else if(c == 'D' && !maxHeap.isEmpty() && !minHeap.isEmpty()) {
        		if(n == 1) minHeap.remove(maxHeap.poll());
        		else if(n == -1) maxHeap.remove(minHeap.poll());
        	} 
        }
        
        if(maxHeap.size() == 0) {
        	answer[0] = 0;
        	answer[1] = 0;
        } else {
        	answer[0] = maxHeap.poll();
        	answer[1] = minHeap.poll();
        }
        
        return answer;
    }	
	
	public static void main(String[] args) {
		solution(new String[] {"I 16","D 1"});
	}
}
