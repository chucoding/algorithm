package programmers.skill_test;

import java.util.ArrayList;
import java.util.List;

public class Level2_5 {

	public static int solution(int n) {
	     int answer = 0;
	     List<Integer> list = new ArrayList();
	     
	     while(true) {
	    	 if(n == 1) {
	    		 list.add(n%2); 
	    		 break;
	    	 }
	    	 
	    	list.add(n%2); 
	    	n /= 2;
	     }
	     
	     int[] arr = new int[list.size()];
	     
	     System.out.println(list);
	     for(int i=0; i<list.size(); i++) {
	    	 arr[list.size()-1-i] = list.get(i);
	     }
	     
	     for(int i=0; i<arr.length; i++) {
	    	 System.out.println(arr[i]);
	     }
	     
	     
	     
	     return answer;
	}
	 
	public static void main(String[] args) {
		solution(78);
	}
}
