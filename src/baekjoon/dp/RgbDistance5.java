package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RgbDistance5 {

	private static int[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		visited = new int[n][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				if(visited[i][j] != 0) continue;
				int sum = seperate(i, j, arr);
				if(min > sum) min = sum; 
			}
		}
		
		System.out.println(min);
	}
	
	public static int seperate(int i, int j, int[][] arr) {
		
		int sum = arr[i][j];
		visited[i][j] = 1;
		
		int pivot = j;
		
		for(int k=i-1; k>=0; k--) {
			if(visited[k][(j+1)%3] != 0) { j = (j+1)%3; }
			
			
			sum += arr[k][j];
			visited[k][j] = 1;
		}
		
		j = pivot;
		
		for(int k=i+1; k<arr.length; k++) {
			if(arr[k][(j+1)%3] < arr[k][(j+2)%3]) { j = (j+1)%3; }
			else { j = (j+2)%3; }
			
			sum += arr[k][j];
			visited[k][j] = 1;
		}
		
		return sum;
	}
}
