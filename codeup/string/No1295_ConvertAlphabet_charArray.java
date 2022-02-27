package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1295_ConvertAlphabet_charArray {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toCharArray();
		
		for(int i=0; i<str.length; i++) {
			if(str[i] >= 97 && str[i] <= 122) str[i] -= 32;
			else if(str[i] >= 65 && str[i] <= 90) str[i] += 32;
		}
		
		System.out.println(str);
	}
}
