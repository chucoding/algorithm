package codeup.recursive_function;

import java.util.Scanner;

public class Sum1ToN {

	private static Scanner sc = new Scanner(System.in);
	private static int num = 0;
	
	public static int sum(int i, int sum) {
		
		if(num < i) return sum;
		sum+=i;
		return sum(i+1, sum);
	}
	
	public static void main(String[] args) {
		num = sc.nextInt();
		System.out.println(sum(1, 0));
	}
}
