package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class No1181_WordSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		br.close();
		
		int size = set.size();
		String[] str = new String[size];

		Iterator<String> itr = set.iterator();
		for(int i=0; i<size; i++) {
			str[i] = itr.next();
		}
			
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) {
					return 1;
				} else if(s1.length() < s2.length()) {
					return -1;
				} else {
					int len = s1.length();
					for(int i=0; i<len; i++) {
						if(s1.charAt(i) > s2.charAt(i)) {
							return 1;
						} else if(s1.charAt(i) < s2.charAt(i)) {
							return -1;
						}
					}
					return 0;
				}
			}
		});
		
		for(int i=0; i<size; i++) {
			System.out.println(str[i]);
		}
	}
}
