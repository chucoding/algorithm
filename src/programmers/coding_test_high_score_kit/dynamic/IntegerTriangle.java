package programmers.coding_test_high_score_kit.dynamic;

public class IntegerTriangle {

	private static int[][] triangles = null;
	
	public static int solution(int[][] triangle) {
	
		int answer = 0;
		int i = triangle.length;
		int j = triangle[triangle.length-1].length;

		triangles = triangle;

		answer = recursion(i, j, answer);
		return answer;
	}
	
	public static int recursion(int i, int j, int answer) {

		if(i == 0) return triangles[i][0];
		else if(j == 0) return triangles[i][j];
		
		return recursion(i, j, answer);
	}

	public static void main(String[] args) {
		int answer = solution(new int[][] {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}});
	}
}
