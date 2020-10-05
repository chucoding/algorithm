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
		int depth = Integer.parseInt(st.nextToken());
		
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

		boolean[] visited = new boolean[depth];
		getSequence(arr, visited, depth, 0);
	}
	
	public static void getSequence(int[] arr, boolean[] visited, int depth, int i) {
		if(i == depth) {
			for(int j=0; j<depth; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			return;
		}
		
		visited[i] = true;
		getSequence(arr, visited, depth, i++);
		
		visited[i] = false;
		getSequence(arr, visited, depth, i);
	}
}
