package programmers.coding_test_high_score_kit.dfs_bfs;

public class TargetNumber {

	public static int solution(int[] numbers, int target) {
        
		int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,1,1,1}, 3));
		System.out.println(solution(new int[]{1,1,1,1,1,1}, 2));
	}
	
	public static int dfs(int[] numbers, int node, int sum, int target) {
		if(node == numbers.length) {
			if(sum == target)
				return 1;
			return 0;
		}
		
		return dfs(numbers, node+1, sum+numbers[node], target) + dfs(numbers, node+1, sum - numbers[node], target);
		
	}
		
}
