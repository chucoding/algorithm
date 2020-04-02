package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1133_StringIoWithSpaces {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println(br.readLine());			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
