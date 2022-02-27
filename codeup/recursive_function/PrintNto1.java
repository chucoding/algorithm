package codeup.recursive_function;

import java.util.Scanner;

public class PrintNto1 {

	private static Scanner sc = new Scanner(System.in);

	public static void recursion(int n) {
		System.out.println(n);
		if(n == 1) return;
		recursion(n-1);
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		recursion(n);
	}
}
