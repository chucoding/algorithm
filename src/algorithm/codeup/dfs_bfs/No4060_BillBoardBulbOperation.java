package algorithm.codeup.dfs_bfs;

import java.util.Scanner;

public class No4060_BillBoardBulbOperation {

	static int[][] visited = null;
	static int[][] billBoard = null;
	
	public static void main(String[] args) {
		
		int m = 0; //세로 길이
		int n = 0; //가로 길이
		
		int turnon = 0; //킨 횟수
		int turndown = 0; //끈 횟수
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			m = sc.nextInt();
			n = sc.nextInt();
			if(m>=2 && m<=100 && n>=2 && n<=100) break;
		}

		billBoard = new int[m][n]; 
		visited = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				billBoard[i][j] = sc.nextInt();
				visited[i][j] = 0;
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				
				if(visited[i][j] == 0) {
					
					if(billBoard[i][j] == 1) turnon++;
					else turndown++;
					
					dfs(i, j, i, j);
					
				} else {
					continue;
				}
			}
		}
		
		System.out.print(turndown+" "+turnon);
	}
		
	public static void dfs(int x, int y, int i, int j) {

		if(x<0 || y<0 || x>visited.length-1 || y>visited[0].length-1) return;
		if(visited[x][y] == 1) return; //방문했다면 종료
		if(billBoard[i][j] != billBoard[x][y]) return;
		
		visited[x][y] = 1;
		
		dfs(x-1, y, i, j); //위쪽 탐색
		dfs(x, y-1, i, j); //왼쪽 탐색
		dfs(x+1, y, i, j); //오른쪽 탐색
		dfs(x, y+1, i, j); //아래쪽 탐색
	}
}
