package codeup.recursive_function;

import java.util.Scanner;

public class Print1ToN {

	public static void recursion(int i, int n) {
		
		System.out.println(i);
		if(i == n) return;
		else recursion(i+1, n);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recursion(1, n);
	}
}
