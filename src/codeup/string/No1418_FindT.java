package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1418_FindT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());

		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == 't') System.out.print((i+1)+" ");
		}
	}
}
