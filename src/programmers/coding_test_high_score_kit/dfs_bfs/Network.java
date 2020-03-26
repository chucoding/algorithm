package programmers.coding_test_high_score_kit.dfs_bfs;

//import java.util.LinkedList;
//import java.util.Queue;

public class Network {

	private static int[][] computer;
	
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        
        computer = computers;
        
        for(int i=0; i<computer.length; i++) {
        	for(int j=i+1; j<computer[0].length; j++) {
        		dfs(i,j);
        		answer++;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
    
    public static void dfs(int i, int j) {

    	if(computer[i][j] == 1) dfs(i+1, j);
    	
    	return;
    }
    
    public static void main(String[] args) {
		solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}});
	}
}
