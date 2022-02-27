package programmers.coding_test_high_score_kit.sort;

import java.util.Arrays;
import java.util.Comparator;

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
				 //문자열의 사전순 값을 비교하여 그에 해당되는 int값을 리턴한다.
				 //s2+s1은 사전역순
				 //좌측값이 크면 1리턴(바꿈), 리턴값이 -1(오른쪽이 크면)이나 0이면 자리바꿈
				 // (s1+s2)compareTo(s2+s1) 비교하면서 들어가므로 시간이 지날수록 s1이 s2보다 작은값이 되버림
			 }
		 });

		 //0000 처럼 0으로만 구성되어있으면 0 return
		 if (arr[0].equals("0")) return "0";

		 //그 외의 경우 순차적으로 연결하여 answer return
		 for (int i = 0; i < arr.length; i++) {
			 answer+=arr[i];
		 }
		 
		 System.out.println(answer);
		 return answer;
    }
	
	public static void main(String[] args) {
		
		int[] numbers = {6, 10, 2};
		String sol = solution(numbers);
	}
}
