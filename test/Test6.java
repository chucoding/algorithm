package test;

public class Test6 {

	public static int solution(int[][] office, int r, int c, String[] move) {

		int answer = 0; 
		String[] status = new String[]{"up","right","down","left"};

		if(office[r][c] != 0) {
			answer += office[r][c];
			office[r][c] = 0;
		}

		int cur = 0;
		for(int i=0; i<move.length; i++){

			if(move[i].equals("go")){
				if(status[cur].equals("up") && r!=0 && office[r-1][c]!=-1) r--;
				else if(status[cur].equals("down") && r!=office.length-1 && office[r+1][c]!=-1) r++;
				else if(status[cur].equals("left") && c!=0 && office[r][c-1]!=-1) c--;
				else if(status[cur].equals("right") && c!=office[0].length-1 && office[r][c+1]!=-1) c++;
			}
			else if(move[i].equals("right")) cur = (cur+1) % 4;
			else if(move[i].equals("left")) cur = (cur-1) % 4;

			if(office[r][c] != 0) {
				answer += office[r][c];
				office[r][c] = 0;
			}
		}

		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		solution(new int[][]{{5,-1,4},{6,3,-1},{2,-1,1}}, 1, 0, new String[] {"go", "go", "right", "go", "right", "go", "left", "go"});
	}
}
