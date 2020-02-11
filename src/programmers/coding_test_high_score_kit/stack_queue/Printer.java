package programmers.coding_test_high_score_kit.stack_queue;


public class Printer {

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		int max = 0;
		int maxIndex = 0;
		for(int i=0; i<priorities.length; i++) {

			if(max < priorities[i]) {
				max = priorities[i];
				maxIndex = i;
			}
		}
		
		if(location >= maxIndex) answer = location - maxIndex + 1;
		else answer = priorities.length - maxIndex + location + 1;
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,1,3,2}, 2));
		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
