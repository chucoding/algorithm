package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

    	int count = 0;
    	int[][] board = new int[n][n];
    	
    	for(int i=0; i<k; i++) {
    		board[obstacles[i][0]-1][obstacles[i][1]-1] = 1;
    	}
    	
    	//왼쪽 위 대각선
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	while(true) {
    		int x = r_q-1;
    		int y = c_q-1;
    		if(x >= n-1 || y < 1 || board[x][y] == 1) break;
    		
    		x++;
    		y--;
    		count++;
    	}
    	
    	return count;
    }
    
    static void move(int n, int r_q, int c_q, int count, int[][] board) {
 
    	if(r_q < 1 || r_q >= n-1 || c_q < 1 || c_q >= n-1 || board[r_q][c_q] == 1) return;
    	
    	if(r_q < n-1 && c_q > 0) {
    		count++;
    		move(n, r_q+1, c_q-1, count, board); 
    	}
    	
    	if(r_q < n-1) {
    		count++;
    		move(n, r_q+1, c_q, count, board); //위
    	}
    	
    	if(r_q < n-1 && c_q < n-1) {
    		count++;
    		move(n, r_q+1, c_q+1, count, board); //오른쪽 위 대각선
    	}
    	
    	if(c_q < n-1) {
    		count++;
    		move(n, r_q, c_q+1, count, board); //오른쪽
    	}
    	
    	if(r_q > 0 && c_q < n-1) {
    		count++;
    		move(n, r_q-1, c_q+1, count, board); //오른쪽 아래 대각선
    	}
    	
    	if(r_q > 0) {
    		count++;
    		move(n, r_q-1, c_q, count, board); //아래
    	}
    	
    	if(r_q > 0 && c_q > 0) {
    		count++;
    		move(n, r_q-1, c_q-1, count, board); //왼쪽 아래 대각선
    	}
    	
    	if(c_q > 0) {
    		count++;
    		move(n, r_q, c_q-1, count, board); //왼
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        scanner.close();
    }
}
