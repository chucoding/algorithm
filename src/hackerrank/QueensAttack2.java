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
    	
		int x = r_q-1;
		int y = c_q-1;
    	
    	//왼쪽 위 대각선
    	while(true) {
    		
    		x++;
    		y--;
    		if(x > n-1 || y < 0 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//위
    	while(true) {
    		
    		x++;
    		if(x > n-1 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//오른쪽 위 대각선
    	while(true) {
    		
    		x++;
    		y++;
    		if(x > n-1 || y > n-1 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//오른쪽
    	while(true) {
    		
    		y++;
    		if(y > n-1 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//오른쪽 아래 대각선
    	while(true) {
    		
    		x--;
    		y++;
    		if(x < 0 || y > n-1 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//아래
    	while(true) {
    		x--;
    		if(x < 0 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//왼쪽 아래 대각선
    	while(true) {
    		x--;
    		y--;
    		if(x < 0 || y < 0 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	x = r_q-1;
    	y = c_q-1;
    	
    	//왼
    	while(true) {
    		y--;
    		if(y < 0 || board[x][y] == 1) break;
    		count++;
    	}
    	
    	return count;
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
