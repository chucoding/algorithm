package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No1419_Love2_Pattern {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int count = 0;

			Pattern pattern = Pattern.compile("love");            
			Matcher matcher = pattern.matcher(s);
			while (matcher.find()) {
				count++;
			}
			System.out.println(count);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
