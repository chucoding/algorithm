package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1408_CryptographicProcessing {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toCharArray();
		char[] a = new char[str.length];
		char[] b = new char[str.length];
		
		for(int i=0; i<str.length; i++) {
			a[i] = (char) (str[i] + 2);
			b[i] = (char) ((str[i] * 7) % 80 + 48);
		}
		
		String.valueOf(a);
		String.valueOf(b);
		
		System.out.println(a);
		System.out.println(b);
	}
}
