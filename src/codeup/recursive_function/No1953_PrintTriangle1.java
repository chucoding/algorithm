package codeup.recursive_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1953_PrintTriangle1 {

	public static void recursive(int i, int n) {
		
		if(n == 1) return;
		else {
			if(n == i) {
				i = 0;
				n -= 1;
				System.out.println();
			}
			System.out.print("*");
			recursive(i+1, n);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Character.getNumericValue(br.read());
		
		recursive(0, n);
	}
}
