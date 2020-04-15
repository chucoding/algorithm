package programmers.coding_test_high_score_kit.dfs_bfs;

public class TargetNumber {

	private static int count = 0;

	public static void dfs(int[] arr, int i, int sum, int target){

		if(i == arr.length) {
			if(sum == target) count++;
			return;
		}

		dfs(arr, i+1, sum+arr[i], target);
		dfs(arr, i+1, sum-arr[i], target);

	}

	public static int solution(int[] numbers, int target) {
		int answer = 0;

		dfs(numbers, 0, 0, target);
		answer = count;

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,1,1,1}, 3));
		System.out.println(solution(new int[]{1,1,1,1,1,1}, 2));
	}
		
}
