package programmers.coding_test_high_score_kit.dfs_bfs;

public class Network {

	private static int[][] _computers;
	private static int[][] visited;
	
    public static void dfs(int i, int j) {

    	if(i < 0 || j < 0 || i > visited.length-1 || j > visited.length-1 || visited[i][j] == 1 || _computers[i][j] == 0) return;
    	
    	visited[i][j] = 1;	
    		
    	dfs(i-1, j);
    	dfs(i, j-1);
    	dfs(i+1, j);
    	dfs(i, j+1);
    }
	
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        
        _computers = computers;
        visited = new int[n][n];

        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		visited[i][j] = 0;
        	}
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(visited[i][j] == 0 && computers[i][j] == 1) {
        			dfs(i,j);
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}});
		solution(4, new int[][]{{1,1,0,0},{1,1,0,0},{0,0,1,0},{0,0,0,1}});
		solution(4, new int[][]{{1,0,0,1},{0,1,1,1},{0,1,1,0},{1,1,0,1}});
	}
}
