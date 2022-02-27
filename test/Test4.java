package test;

public class Test4 {
   
   public static int solution(int[] prices) {
	  
      int answer = 0;
     
      int max = 0;
      int max_index = 0;
      int min = 1000001;
      int min_index = 0;
      
      for(int i=0; i<prices.length; i++) {
    	  if(max < prices[i]) {
    		  max = prices[i];
    		  max_index = i;
    	  } 
    	  
    	  if(min > prices[i]) {
    		  min = prices[i];
    		  min_index = i;
    	  }
      }
      
      if(min_index < max_index) answer = max - min;
      else if(min_index == max_index) answer = 0;
      else {
    	  
    	  int new_min = 1000001;
    	  int new_max = 0;
    	  int new_answer = 0;
    	  int new_answer2 = 0;
    	  
    	  for(int i=0; i<max_index; i++) {
    		  if(new_min > prices[i]) new_min = prices[i];
    		  new_answer = max - min;
    	  }
    	  
    	  for(int i=min_index+1; i<prices.length; i++) {
    		  if(new_max < prices[i]) max = prices[i];
    		  new_answer2 = max - min;
    	  }
 
    	  if(new_answer > new_answer2) answer = new_answer;
    	  else answer = new_answer2;
    	  
    	  answer = max - min;
      }
      
      System.out.println(answer);
      
      return answer;
   }
   
   public static void main(String[] args) throws Exception {
       
     int[] a = {3,2,4,8,7};
     int[] b = {3,4,1,5,4};
     int[] c = {5,4,3,2,1};
  
//     int x = solution(a);
//     int y = solution(b);
     int z = solution(c);
  }
}