package codeup.dfs_bfs;

import java.util.Scanner;

public class No4060_BillBoardBulb {

	private static Scanner sc = new Scanner(System.in);
	private static int[][] billBoard;
	private static int[][] visited;
	
	public static void dfs(int i, int j, int a, int b) {
		
		if(i<0 || j<0 || i>billBoard.length-1 || j>billBoard[0].length-1 || visited[i][j] == 1 || billBoard[i][j] != billBoard[a][b]) return;
		visited[i][j] = 1;
		
		dfs(i-1, j, i, j);
		dfs(i, j-1, i, j);
		dfs(i+1, j, i, j);
		dfs(i, j+1, i, j);
	}
	
	public static void main(String[] args) {
		
		int m = 0;
		int n = 0;
		
		while(true) {
			m = sc.nextInt();
			n = sc.nextInt();
			if(m>=2 && m<=100 && n>=2 && n<=100) break;
		}
		
		int off = 0;
		int on = 0;
		
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
				if(visited[i][j] == 0 && billBoard[i][j] == 0) {
					dfs(i,j,i,j);
					on++;
				} else if(visited[i][j] == 0 && billBoard[i][j] == 1) {
					dfs(i,j,i,j);
					off++;
				}
			}
		}
		
		System.out.println(on+" "+off);
	}
}
