package codeup.recursive_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1953_PrintTriangle1 {

	public static String recursive(String s, int n) {
		
		if(n <= 2) {
			s += "*";
			return s;
		}
		System.out.println();
		return recursive(s, n-1) + recursive(s, n-2);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Character.getNumericValue(br.read());
		
		String s = "";
		recursive(s, n);
	}
}
