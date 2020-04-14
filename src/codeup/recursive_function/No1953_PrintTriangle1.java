package codeup.recursive_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1953_PrintTriangle1 {

	public static void recursive(int start, int end, int n) {
		
		if(start == n) return;
		else {
			if(start == end) {
				start = 0;
				end += 1;
				System.out.println();
			} 
			
			System.out.print("*");
			recursive(start+1, end, n);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		recursive(0, 1, n);
	}
}
