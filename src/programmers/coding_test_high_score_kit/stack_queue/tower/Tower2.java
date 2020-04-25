package programmers.coding_test_high_score_kit.stack_queue.tower;

public class Tower2 {

	public static int[] solution(int[] heights) {
		
		long a = System.nanoTime();
		
		int[] answer = new int[heights.length];
        
        for(int i=heights.length-1; i>=1; i--){
            for(int j=i-1; j>=0; j--){
                if(heights[j] > heights[i]) {
                    answer[i] = j+1;
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

