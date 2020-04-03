package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1697_HideAndSick {

//	public static void bfs(int node, Queue<Integer> q) {
//		q.offer(node-1);
//		q.offer(node+1);
//		q.offer(node*2);
//	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = 0;
		int k = 0;
		int answer = 0;
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
	
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		
		while(!q.isEmpty()) {
			int node = q.poll();
			answer++;
			
			if(node == k) break;
			
			for(int j=0; j<3*answer; j++) {
				
			}
			
//			bfs(node, q);
		}
		
		System.out.println(answer);
	}
}
