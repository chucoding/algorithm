package codeup.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No4503_Virus_list {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		ArrayList<Integer>[] v = new ArrayList[n];
		int[] check = new int[n];
		
		for(int i=0; i<n; i++) {
			check[i] = 0;
			v[i] = new ArrayList<>();
		}

		StringTokenizer st;
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			v[a].add(b);
			v[b].add(a);
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.add(0);

		while(!q.isEmpty()) {
			int node = q.poll();
			check[node] = 1;
			
			for(int i=0; i<v[node].size(); i++) {
				if(check[v[node].get(i)] == 0) q.offer(v[node].get(i));
			}
		}
		
		int answer = 0;
		for(int i=0; i<check.length; i++) {
			if(check[i] == 1) answer++;
		}
		
		System.out.println(answer-1);
	}
}
