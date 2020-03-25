package codeup.recursive_function;

import java.util.Scanner;

public class PrintOddNumbersBetweenTwoNumbers {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%2 == 1 && a == b) System.out.println(a);
		else if(a%2 == 0 && a == b) System.out.println();
		else if(a%2 == 1) recursion(a, b);
		else if(a%2 == 0) recursion(a+1,b);
		
	}
	
	public static void recursion(int a, int b) {
		
		System.out.println(a);
		if(b-a <= 1) return;
		recursion(a+2, b);
	}
}
