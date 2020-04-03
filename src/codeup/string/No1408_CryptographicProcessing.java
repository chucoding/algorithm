package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1408_CryptographicProcessing {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		
		long x = System.nanoTime();
		
		for(int i=0; i<str.length; i++) {
			System.out.print((char) (str[i] + 2));
		}
		
		System.out.println();
		
		for(int i=0; i<str.length; i++) {
			System.out.print((char) ((str[i] * 7) % 80 + 48));
		}
		
		long y = System.nanoTime();
		System.out.println();
		System.out.println(y-x);
	}
}
