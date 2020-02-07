package programmers.skill_test;

public class Level1_2 {

	public static int[][] solution(int[][] arr1, int[][] arr2) {
	     
		int[][] answer = new int[arr1.length][arr1[0].length];
	      
	     for(int i=0; i<arr1.length; i++) {
	    	 for(int j=0; j<arr1[0].length; j++) {
	    		 answer[i][j] = arr1[i][j] + arr2[i][j];
	    	 }
	     }
	      
	     return answer;
	}
	
	//출력 테스트용
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] answer = solution(arr1, arr2);
	}
}
