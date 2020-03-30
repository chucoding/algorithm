package codeup.dfs_bfs;

import java.util.Scanner;

public class BillBoardBulb {

	private static Scanner sc = new Scanner(System.in);
	private static int[][] billBoard;
	
	public static void dfs(int i, int j, int x) {
		
		if(i<0 || j<0 || i>billBoard.length-1 || j>billBoard[0].length-1 || billBoard[i][j] != x) return;
		else {
			System.out.println(i+" "+j);
			dfs(i-1,j, x);
			dfs(i,j-1, x);
			dfs(i+1,j, x);
			dfs(i,j+1, x);
		}
	}
	
	public static void main(String[] args) {
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int off = 0;
		int on = 0;
		
		billBoard = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				billBoard[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {

				if(billBoard[i][j] == -1) continue;
				else {
					if(billBoard[i][j] == 0) {
						dfs(i, j, 0);
						on++;
					} else {
						dfs(i, j, 1);
						off++;
					}
				}
			}
		}
		
		System.out.println(on+" "+off);
	
	}
}
