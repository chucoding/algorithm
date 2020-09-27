package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class No15665_NnM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		List<Integer> nList = new ArrayList<Integer>();
		
		nList.add(arr[0]);
		for(int i=1; i<len; i++) {
			if(arr[i] != arr[i-1]) {
				nList.add(arr[i]);
			}
		}

		for(int i=0; i<nList.size(); i++) {
			for(int j=0; j<cnt; j++) {
				getSequence(nList.get(i), i, 0, cnt);
			}
		}
		
//		System.out.print(nList.get(i)+" ");
		
	}
	
	public static void getSequence(int n, int length, int j, int cnt) {
		for(int k=0; k<cnt; k++) {
			
		}
	}
}
