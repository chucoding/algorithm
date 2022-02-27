package codeup.recursive_function;

import java.util.Scanner;

public class No1920_BinaryConversion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void conversion(int n) {
		
		if(n<2) {
			System.out.print(n);
			return;
		}
		
		conversion(n/2);
		System.out.print(n%2);
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		conversion(n);
	}
}
