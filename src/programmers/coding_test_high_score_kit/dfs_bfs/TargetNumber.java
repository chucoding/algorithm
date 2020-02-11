package programmers.coding_test_high_score_kit.dfs_bfs;

public class TargetNumber {

	public static int solution(int[] numbers, int target) {
		int answer = 0;
        
        int a=0;
        while(true) {
        	if(numbers.length-a == target+a) break;
        	if(a > numbers.length) return 0;
        	a++;
        }
        
        if(a == 0) return 1;
        
        for(int j=0; j<a; j++) {
        	for(int i=numbers.length-j; i>0; i--) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
//		System.out.println(solution(new int[]{1,1,1,1,1}, 3));
		System.out.println(solution(new int[]{1,1,1,1,1,1}, 2));
	}
	
	public static int dfs() {
		return 0;
		
	}
}
