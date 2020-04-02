package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class No2493_Top {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int[] answer = new int[n]; 
		int[] heights = new int[n]; 
		Stack<Integer> stack = new Stack<Integer>();

		for(int i=0; i<n; i++) {
			heights[i] = Integer.parseInt(st.nextToken());
			stack.push(heights[i]);
		}
		
		 while(!stack.isEmpty()) {
		
			 int height = stack.pop();
			 
			 for(int i=stack.size(); i>=0; i--) {
				 if(height < heights[i] ) {
					 answer[stack.size()] = i+1;
					 break;
				 }
			 }
		 }
		 
		 for(int i=0; i<n; i++) {
			 System.out.print(answer[i]+" ");
		 }
	}
}
