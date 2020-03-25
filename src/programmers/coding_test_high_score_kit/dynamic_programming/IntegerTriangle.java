package programmers.coding_test_high_score_kit.dynamic_programming;

public class IntegerTriangle {

	private static int[][] triangles = null;
	
	public static int solution(int[][] triangle) {
	
		int answer = 0;
		triangles = triangle;
		
		answer = recursion(triangle.length-1, 0, 0);
		
		return answer;
	}
	
	public static int recursion(int i, int j, int answer) {

		//탈출조건
		if(i == 0) return answer += triangles[i][j];
		
		if(j == triangles[i].length-1) j = 0;
		else {
			if(triangles[i][j] > triangles[i][j+1]) answer += triangles[i][j];
			else answer += triangles[i][j+1];
			
			return recursion(i-1, j, answer);
		}
		
		return 1;
	}

	public static void main(String[] args) {
		int answer = solution(new int[][] {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}});
	}
}
