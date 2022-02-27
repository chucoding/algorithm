package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class No1407_PrintString1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long a = System.nanoTime();
		System.out.println(Pattern.compile("\\s").matcher(br.readLine()).replaceAll(""));
//		System.out.println(br.readLine().replaceAll("\\s",""));
		long b = System.nanoTime();
		System.out.println(b-a);
	}
}
