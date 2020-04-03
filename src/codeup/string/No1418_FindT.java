package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1418_FindT {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i) == 't') System.out.print((i+1)+" ");
//		}
		
//		long a = System.nanoTime();
		
		int index = -1;
		while((index = s.indexOf('t', index+1)) >= 0) {
			System.out.print((index+1)+" ");
		}
//		
//		long b = System.nanoTime();
//		System.out.println(b-a);
	}
}
