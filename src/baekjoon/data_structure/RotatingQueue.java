package baekjoon.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class RotatingQueue {

	private static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		Deque<Integer> queue = new ArrayDeque<Integer>();
		for(int i=0; i<size; i++) {
			queue.offer(i+1);
		}
		
		st = new StringTokenizer(br.readLine());
		int[] order = new int[n];
		for(int i=0; i<n; i++) {
			order[i] = Integer.parseInt(st.nextToken());
		}
		
//		queue.pollFirst();
//		queue.pollLast();
		
	}
}
