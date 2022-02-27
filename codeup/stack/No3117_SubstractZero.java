package codeup.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No3117_SubstractZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		long a = System.nanoTime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0; i<k; i++) {
			
			int t = Integer.parseInt(br.readLine());
			
			if(!st.empty() && t == 0) st.pop();
			else st.push(t);
			
		}
		
		int sum = 0;
		
		//둘 모두 속도차이 안남! stack이 백터로 되어있기 때문,, 다른걸로 구현시 속도차이남
		for(;!st.empty();) {
			sum+=st.pop();
		}
		
//		for(int i=0; i<st.size(); i++) {
//			sum+=st.get(i);
//		}
		
		System.out.println(sum);
		
		long b = System.nanoTime();
		
		System.out.println(b-a);
	}
}
