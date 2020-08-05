package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RgbDistance4 {

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
		
		seperate(1, 1, 2, arr, arr[0][0]);
		seperate(1, 0, 2, arr, arr[0][1]);
		seperate(1, 0, 1, arr, arr[0][2]);
		
		System.out.println(min);
	}
	
	public static void seperate(int i, int a, int b, int[][] arr, int num) {
		
		if(i == arr.length) {
			if(min > num) min = num;
			return;
		}
		
		if(arr[i][a] > arr[i][b]) {
			num += arr[i][b];
			a = (b+1)%3;
			b = (b+2)%3;
		}
		else {
			num += arr[i][a];
			a = (a+1)%3;
			b = (a+2)%3;
		}
		
		seperate(i+1, a, b, arr, num);
	}
}
