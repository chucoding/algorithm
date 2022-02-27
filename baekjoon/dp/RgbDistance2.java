package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RgbDistance2 {

	private static int min = 1000;
	
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
		
		seperate(0, 0, arr, 0);
		System.out.println(min);
	}
	
	public static void seperate(int i, int j, int[][] arr, int num) {
		
		if(i == arr.length) {
			if(min > num) min = num;
			return;
		}
		
		num += arr[i][j];
		
		seperate(i+1, (j+1)%3, arr, num);
		seperate(i+1, (j+2)%3, arr, num);
	}
}
