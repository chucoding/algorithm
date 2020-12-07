package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

    	int sum = 0;
    	int[] count = new int[8];
    	
    	for(int i=0; i<8; i++) {
    		count[i] = n;
    	}
    	
    	for(int i=0; i<k; i++) {

    		int y = obstacles[i][0];
    		int x = obstacles[i][1];
    		
    		if(Math.abs(y - r_q) == Math.abs(x - c_q) || x == c_q || y == r_q) {
    			if(r_q < y && c_q > x) {
        			int min = Math.min(y-r_q, c_q-x);
        			if(count[0] > min) {
        				count[0] = min-1;
        			}
        		} else if(r_q < y && c_q == x) {
        			int min = y - r_q;
        			if(count[1] > min) {
        				count[1] = min-1;
        			}
        		} else if(r_q < y && c_q < x) {
        			int min = Math.min(y-r_q, x-c_q);
        			if(count[2] > min) {
        				count[2] = min-1;
        			}
        		} else if(r_q == y && c_q < x) {
        			int min = x - c_q;
        			if(count[3] > min) {
        				count[3] = min-1;
        			}
        		} else if(r_q > y && c_q < x) {
        			int min = Math.min(r_q-y, x-c_q);
        			if(count[4] > min) {
        				count[4] = min-1;
        			}
        		} else if(r_q > y && c_q == x) {
        			int min = r_q - y;
        			if(count[5] > min) {
        				count[5] = min-1;
        			}
        		} else if(r_q > y && c_q > x) {
        			int min = Math.min(r_q-y, c_q-x);
        			if(count[6] > min) {
        				count[6] = min-1;
        			}
        		} else if(r_q == y && c_q > x) {
        			int min = c_q - x;
        			if(count[7] > min) {
        				count[7] = min-1;
        			}
        		}
    		}
    	}
    	for(int i=0; i<8; i++) {
    		if(count[i] == n) {
    			switch(i) {
    			case 0 :
    				sum += Math.min(n - r_q, c_q - 1);
    				break;
    			case 1 :
    				sum += n - r_q;
    				break;
    			case 2 :
    				sum += Math.min(n - r_q, n - c_q);
    				break;
    			case 3 :
    				sum += n - c_q;
    				break;
    			case 4 : 
    				sum += Math.min(r_q - 1, n - c_q);
    				break;
    			case 5 :
    				sum += r_q - 1;
    				break;
    			case 6 :
    				sum += Math.min(r_q - 1, c_q - 1);
    				break;
    			case 7 :
    				sum += c_q - 1;
    				break;
    			}
    		}
    		else sum += count[i];
    	}
    	
    	return sum;
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
