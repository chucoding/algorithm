package codeup.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No4503_Virus {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int edgeCount = Integer.parseInt(br.readLine());

		int[][] graph = new int[n][n];
		int[] visited = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				graph[i][j] = 0;
			}
			visited[i] = 0;
		}
		
		StringTokenizer st;
		for(int i=0; i<edgeCount; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(0);
		
		while(!queue.isEmpty()) {
			
			int i = queue.poll();
			visited[i] = 1;
			
			for(int j=0; j<n; j++) {
				if(graph[i][j] == 1 && visited[j] == 0) queue.offer(j);
			}
		}
		
		int answer = 0;
		for(int i=0; i<visited.length; i++) {
			if(visited[i] == 1) answer++;
		}
		
		System.out.println(answer-1);
	}
}
