package programmers.kakao2018;

public class SecretMap {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = {};
	      
	      int[][] arr = new int[n][n];
	      
	      for(int i=0; i<n; i++) {
	    	  for(int j=n-1; j>=0; j--) {
	    		  
	    		  if(arr1[i] % 2 == 1|| arr2[i] % 2 == 1) arr[i][j] = 1;
	    		  arr1[i] /= 2;
	    		  arr2[i] /= 2;
	    	  }
	      }
	  
	      StringBuilder sb = new StringBuilder();
	      answer = new String[n];
	      
	      for(int i=0; i<n; i++) {
	    	  
	    	  for(int j=0; j<n; j++) {
	    		  if(arr[i][j] == 1) sb.append("#");
	    		  else sb.append(" ");
	    	  }
	    	  answer[i] = new String(sb);
	    	  sb.setLength(0);
	      }
	      
	      for(int i=0; i<n; i++) {
	    	  System.out.println(answer[i]);
	      }
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28});
	}
}
