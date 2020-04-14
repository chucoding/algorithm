package programmers.coding_test_high_score_kit.dfs_bfs;

import java.util.Arrays;

public class Network2 {

	public static void dfs(int node, int[] visited, int[][] computers) {
		
		for(int i=0; i<computers[node].length; i++) {
			if(computers[node][i] == 1 && visited[i] == 0) {
				visited[i] = 1;
				dfs(i, visited, computers);
			}
		}
		
		return;
	}
	
	public static int solution(int n, int[][] computers) {
        int answer = 0;

        int[] visited = new int[n];
        Arrays.fill(visited, 0);
        
        for(int i=0; i<n; i++) {
        	if(visited[i] != 0) continue;
        	dfs(i, visited, computers);
        	answer++;
        }
        
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		solution(3, new int[][] {{1,1,0},{1,1,0},{0,0,1}});
	}
}
