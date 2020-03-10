package programmers.coding_test_high_score_kit.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class TheLargestNumber {

	public static String solution(int[] numbers) {

		 String answer = "";
	        
		 //int 배열을 String 배열로 변환
		 String[] arr = new String[numbers.length];
		 for (int i = 0; i < numbers.length; i++) {
			 arr[i] = (String.valueOf(numbers[i]));
		 }

		 //배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
		 Arrays.sort(arr, new Comparator<String>() {
			 @Override
			 public int compare(String s1, String s2) {
				 return (s2+s1).compareTo(s1+s2);
			 }
		 });

		 //0000 처럼 0으로만 구성되어있으면 0 return
		 if (arr[0].equals("0")) return "0";

		 //그 외의 경우 순차적으로 연결하여 answer return
		 for (int i = 0; i < arr.length; i++) {
			 answer+=arr[i];
		 }
		 
		 return answer;
    }
	
	public static String solution2(int[] numbers) {
		
		String answer = "";
	
		int max = 0;
		for(int i=0; i<numbers.length; i++) {
			if(max < numbers[i])
				max = numbers[i];
		}

		//자리수 찾기
		int length = (int)(Math.log10(max)+1);
		int[][] arr = new int[numbers.length][length];
			 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<length; j++) {
				if(numbers[i] > 0) {
					arr[i][length-j-1] = numbers[i] % 10;
					numbers[i] /= 10;
					continue;
				}
				arr[i][length-j-1] = -1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		return answer;
	}
	
	public static String solution3(int[] numbers) {
		String answer = "";
		Queue queue = new LinkedList();
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {6, 10, 2};
		String sol = solution2(numbers);
	}
}
