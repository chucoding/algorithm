package test;

import java.util.regex.Pattern;

public class Test8 {

	public static void main(String[] args) {
		String s = "test";
		Pattern.compile("/test").matcher("s").find();
		
		if(s.contains("test"))System.out.println("yes");
		
		char[] str = s.toCharArray();
		
	}
}
