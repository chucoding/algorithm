package programmers.coding_test_high_score_kit.stack_queue.tower;

public class Tower3 {

	public static int[] solution(int[] heights) {
		
		int[] answer = new int[heights.length];
		long a = System.nanoTime();
		
		answer[0] = 0;
		int temp = 1;
		for(int i = 1; i < heights.length; i++){
			if(heights[i-1] > heights[i]){
				answer[i] = i;
				temp++;
			} else if(answer[i-1] != 0 && heights[i-temp] > heights[i]) {
				answer[i] = answer[i-1];
				temp++;
			} else {
				answer[i] = 0;
				temp = 1;
			}
		}

		long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] heights = {6,9,5,7,4,5};
		int[] res = solution(heights);
		
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
}

