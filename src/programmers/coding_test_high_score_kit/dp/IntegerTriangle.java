package programmers.coding_test_high_score_kit.dp;

public class IntegerTriangle {

	public static int solution(int[][] triangle) {

        int answer = 0;
        answer = recursion(triangle.length-1, 0, triangle);
        return answer;
    }

    public static int recursion(int i, int j, int[][] triangle) {

        if(i == 0) return triangle[i][j];

        if(triangle[i][j] > triangle[i][j+1]) triangle[i-1][j] += triangle[i][j];
        else triangle[i-1][j] += triangle[i][j+1];

        j+=1;

        if(j > triangle[i].length-2) {
            i -= 1;
            j = 0;
        }

        return recursion(i, j, triangle);

    }

	public static void main(String[] args) {
		int answer = solution(new int[][] {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}});
	}
}
