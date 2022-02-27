package codeup.string;

import java.util.Scanner;

public class No1132_PrintChar {

//	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long a = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next().charAt(0));
		long b = System.nanoTime();
		System.out.println(b-a);
	}
}
