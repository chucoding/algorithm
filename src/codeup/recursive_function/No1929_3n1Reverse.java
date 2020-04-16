package codeup.recursive_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1929_3n1Reverse {

	public static void recursion(int n){
		
		if(n <= 1) return;
		else if(n % 2 == 0) n /=2;
		else if(n % 2 == 1) n = 3*n+1;
			
		recursion(n);
		System.out.println(n);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		recursion(n);
		System.out.println(n);
	}
}
