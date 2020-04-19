package programmers.coding_test_high_score_kit.stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
		long a = System.nanoTime();
        
        Queue<Integer> indexQ = new LinkedList<Integer>();
        Queue<Integer> valueQ = new LinkedList<Integer>();
        
        for(int i=0; i<priorities.length; i++){
            indexQ.offer(i);
            valueQ.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        
        int i = priorities.length - 1;
        while(!indexQ.isEmpty()){
            
            if(priorities[i] == valueQ.peek()){
                valueQ.poll();
                if(location == indexQ.poll()) break;
                 i--;
                 answer++;
                
            } else {
                indexQ.offer(indexQ.poll());
                valueQ.offer(valueQ.poll());
            }
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer+1;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,6,3,1,2,5,6,7,2,3}, 3));
//		System.out.println(solution(new int[] {2,1,3,2}, 2));
//		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
