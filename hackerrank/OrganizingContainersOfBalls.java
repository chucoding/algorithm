package hackerrank;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
    	int len = container.length;
    	
    	for(int i=0; i<len; i++) {
    		int loc = -1;
    		boolean b = false;
    		for(int j=0; j<len; j++) {
    			if(container[i][j] != 0) {
    				int sum_x = 0;
    		    	int sum_y = 0;
    		    	
    		    	//condition check
    		    	for(int k=0; k<len; k++) {
    		    		if(k != j) {
    		    			sum_x += container[i][k];
    		    		}
    		    		
    		    		if(k != i) {
    		    			sum_y += container[k][j];
    		    		}
    		    	}

    		    	//swap
    		    	if(sum_x == sum_y) {
    		    		b = true;
    		    		loc = j;
        		    	for(int k=0; k<len; k++) {
        		    		if(k != i) {
        		    			for(int l=0; l<len; l++) {
        		    				if(l != j && container[k][j] == container[i][l]) {
        		    					container[i][j] += container[k][j];
        		    					container[k][j] = 0;
        		    					container[k][l] += container[i][l];
        		    					container[i][l] = 0;
        		    				}
        		    			}
        		    		}
        		    	}
        		    	break;
    		    	}
    			}
    		}
    		
    		if(i < len && !b) return "Impossible";
    		
    		for(int j=0; j<len; j++) {
    			if(j!=loc && container[i][j] !=0) {
    				return "Impossible";
    			}
    		}
    	}
//    	for(int i=0; i<container.length; i++) {
//    		for(int j=0; j<container[i].length; j++) {
//    			System.out.print(container[i][j]+" ");
//    		}
//    		System.out.println();
//    	}
    	
		return "Possible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);
            System.out.println(result);
        }

        scanner.close();
    }
}