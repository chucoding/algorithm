package programmers.coding_test_high_score_kit.bp;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumbers2 {

	private static void isSosu(Set set, StringBuilder a) {
        int b = Integer.parseInt(String.valueOf(a));
        boolean sosu = true;
        if (b <= 1) {
            return;
        }
        for (int j = 2; j <= Math.sqrt(b); j++) {
            if (b % j == 0) {
                sosu = false;
                break;
            }
        }
        if (sosu) {
            set.add(b);
        }
    }
	
	public static void perm(char[] arr, int depth, int k, Set set) {
        if (depth == k) { 
            // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
        	System.out.println("-------------------");
        	print(arr, k, set);
            return;
        } else {
            for (int i = depth; i < arr.length; i++) { //문자열 최대 길이
                swap(arr, i, depth);
                perm(arr, depth + 1, k, set);
                
                swap(arr, i, depth);
                System.out.println(arr);
                System.out.println();
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(char[] arr, int k, Set set) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
        }
//        System.out.println(sb);
        isSosu(set, sb);
    }
	
	public static int solution(String numbers) {
		char[] list = numbers.toCharArray();
		
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= list.length; i++) { //문자열 최대 길이
			perm(list, 0, i, set);
		}

//		System.out.println("소수 리스트입니다.");
//		System.out.println(set);

		return set.size();
	}
    
    public static void main(String[] args) {
		
    	int a = solution("17");
    }
}
