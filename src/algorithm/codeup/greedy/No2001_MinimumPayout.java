package algorithm.codeup.greedy;

import java.util.Scanner;

public class No2001_MinimumPayout {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int min_p = 2000;
		int min_j = 2000;
		double min = 0.0;
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			while(true) {
				if(arr[i] < 100 || arr[i] > 2000) {
					arr[i] = sc.nextInt();
				} else break;
			}
			
			if(i<3) {
				if(min_p > arr[i]) min_p = arr[i];
			} else {
				if(min_j > arr[i]) min_j = arr[i];
			}
			
		}
		
		min = (min_p + min_j) * 1.1;
		min = Math.round(min*10)/10.0;
		
		System.out.println(min);
	}
}
