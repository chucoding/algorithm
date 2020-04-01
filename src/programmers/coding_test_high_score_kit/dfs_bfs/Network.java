package programmers.coding_test_high_score_kit.dfs_bfs;

import java.util.HashSet;
import java.util.Set;

public class Network {

	private static int[] parent;

	public static int find(int x) {
		if(x == parent[x]) {
			return x;
		} else {
			int y = find(parent[x]);
			parent[x] = y;
			return y;
		}
	}
	
	public static void union(int x, int y) {
		
		x = find(x);
		y = find(y);
		
		if(x!=y) {
			
			for(int i=0; i<parent.length; i++) {
				if(parent[i] == y) {
					parent[i] = x;
				}
			}
		}
	}
	
    public static int solution(int n, int[][] computers) {

    	int answer = 0;
        parent = new int[n];

        for(int i=0; i<n; i++) {
        	parent[i] = i;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		
        		if(computers[i][j] == 1) {
        			union(i,j);
        		}
        	}
        }
        
        Set set = new HashSet();
        for(int i=0; i<n; i++) {
        	set.add(parent[i]);
        }

        answer = set.size();
        return answer;
    }
    

    //다른방법(chk 배열이용한 dfs - 유니온파인드에 비해 속도 10배 빠름!)
    public static int solution2(int n, int[][] computers) {
    	 int answer = 0;
         boolean[] chk = new boolean[n];
         for(int i = 0; i < n; i++) {
             if(!chk[i]) {
                 dfs(computers, chk, i);
                 answer++;
             }
         }
         return answer;
    }
    
    public static void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;
        for(int i = 0; i < computers.length; i++) {
            if(computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }
    }
    
    public static void main(String[] args) {
//		solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}});
//		solution(4, new int[][]{{1,1,0,0},{1,1,0,0},{0,0,1,0},{0,0,0,1}});

    	long a = System.nanoTime();
    	solution2(4, new int[][]{{1,0,0,1},{0,1,1,1},{0,1,1,0},{1,1,0,1}});
    	long b = System.nanoTime();
    	
    	System.out.println(b-a);
    }
}
