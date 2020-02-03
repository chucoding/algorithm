package algorithm.codeup.dfs_bfs;

import java.util.Scanner;

public class No4060_BillBoardBulbOperation {

	public static void main(String[] args) {
		
		int m = 0; //세로 길이
		int n = 0; //가로 길이
		int[][] billBoard = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			m = sc.nextInt();
			n = sc.nextInt();
			if(m>=2 && m<=100 && n>=2 && n<=100) break;
		}

		billBoard = new int[m][n]; 
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				billBoard[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(billBoard[i][j]+" ");
			}
			System.out.println();
		}

	}
}
