package test;

import java.util.Arrays;

public class Test7 {

	private static int answer = 0;
    
    public static void swap(int i, int number, int[] numbers, int K){
        for(int j=numbers.length-1; j>=0; j--){
            if(numbers[j] < number + K && numbers[j] > number - K){
                int tmp = numbers[i];
                numbers[j] = numbers[i];
                numbers[i] = numbers[j];
                answer++;
                break;
            }
        }
    }
    
    public static int solution(int[] numbers, int K) {

        int[] arr = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
        	arr[i] = K*i;
        }
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] >= arr[i] + K) swap(i, numbers[i], numbers, K);
        }
    
      
        Arrays.sort(numbers);
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] - numbers[i-1] > 20){
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		solution(new int[]{10, 40, 30, 20}, 20);
		solution(new int[]{40, 30, 20, 10}, 20);
//		solution(new int[]{0, 100}, 50);
//		solution(new int[]{0, 100, 30}, 30);
	}
}
