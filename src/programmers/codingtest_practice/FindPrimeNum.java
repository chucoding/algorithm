package programmers.codingtest_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindPrimeNum {

	 public static int solution(int n) {
	      int answer = 0;
	      
	      List<Integer> list = new ArrayList<Integer>();
	      for(int i=1; i<=n; i++){
	          list.add(i);
	      }
	       
	      for(int i=2; i<=list.size(); i++){
	          for(int j=2*i; j<=n; j+=i){
	        	  for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
	    	    	  Integer o = iter.next();
	    	    	  if(o == j) iter.remove();
	    	      }
	          }
	      }

	      list.remove(1);
	      answer = list.size();
	      return answer;
	  }
	
	public static void main(String[] args) {
		solution(10);
	}
}
