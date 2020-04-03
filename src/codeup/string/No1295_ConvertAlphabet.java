package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1295_ConvertAlphabet {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(1000);
		sb.append(br.readLine());

		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) >= 97 && sb.charAt(i) <= 122) sb.replace(i, i, (char)(sb.charAt(i) - 35)+"");
			else if(sb.charAt(i) >= 65 && sb.charAt(i) <= 90) sb.replace(i, i, (char)(sb.charAt(i) + 35)+"");
		}
		
		System.out.println(sb);
		
//		for(int i=0; i<br.readLine().length(); i++) {
//			if(br.readLine().charAt(i) >= 97 && br.readLine().charAt(i) <= 122) br.readLine().rep
//		}
		
	}
}
