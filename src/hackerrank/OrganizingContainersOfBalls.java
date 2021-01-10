package hackerrank;

import java.io.IOException;
import java.util.Scanner;


public class OrganizingContainersOfBalls {
    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
    	String result = "Impossible";
    	for(int i=0; i<container.length; i++) {
    		for(int j=0; j<container[i].length; j++) {
    			if(container[i][j] != 0) {
    			}
    		}
    	}
    	
		return result;
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

        }

        scanner.close();
    }
}