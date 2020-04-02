package codeup.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1714_PrintNumbersBackwards {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			r += s.charAt(i);
		}
		
		System.out.println(r);

	}
}
