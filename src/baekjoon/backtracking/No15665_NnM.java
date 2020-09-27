package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15665_NnM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String[] arr = new String[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = st.nextToken();
		}
	}
}
