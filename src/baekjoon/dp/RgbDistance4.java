package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RgbDistance4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int value = 0;
		int idx = 0;
		int pivot = 0;
		int superMin = Integer.MAX_VALUE;
		int min = 1000;
		
		for(int i=0; i<n; i++) {
	
			min = 1000;
			
			if(arr[i][0] < min) {
				idx = 0;
				min = arr[i][0];
			}
			if(arr[i][1] < min) {
				idx = 1;
				min = arr[i][1];
			}
			if(arr[i][2] < min) {
				idx = 2;
				min = arr[i][2];
			}

			value += arr[i][idx];
			pivot = idx;
			
			for(int j=i-1; j>=0; j--) {
				if(arr[j][(idx+1)%3] < arr[j][(idx+2)%3]) { idx = (idx+1)%3; }
				else { idx = (idx+2)%3; }
				
				value += arr[j][idx];
			}
			
			idx = pivot;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j][(idx+1)%3] < arr[j][(idx+2)%3]) { idx = (idx+1)%3; }
				else { idx = (idx+2)%3; }
				
				value += arr[j][idx];
			}
			
			if(superMin > value) { superMin = value; }
			value = 0;
		}
		
		System.out.println(superMin);
	}
}
