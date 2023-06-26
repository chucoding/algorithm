package programmers.codingtest_practice;

import java.util.stream.IntStream;

public class PlacingIntegersInDescendingOrder2 {

	String res = "";
	public long solution(long n) {
		
		String s = Long.toString(n);
		IntStream str = s.chars();
		System.out.println(str);
		
		s.chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) {
		
		PlacingIntegersInDescendingOrder2 s = new PlacingIntegersInDescendingOrder2();
		System.out.println(s.solution(118372));
	}
}
