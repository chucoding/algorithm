package programmers.coding_test_high_score_kit.stack_queue.tower;

import java.util.Stack;

public class Tower {

	public static int[] solution(int[] heights) {
		
		long a = System.nanoTime();
		
		int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for(int height : heights) {
        	stack.push(height);
        }
        
        while(!stack.isEmpty()) {

        	int height = stack.pop();

        	for(int i=stack.size(); i>=0; i--) {
        		if(height < heights[i] ) {
        			answer[stack.size()] = i+1;
        			break;
        		}
        	}
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] heights = {6,9,5,7,4};
		int[] res = solution(heights);
		
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
}

